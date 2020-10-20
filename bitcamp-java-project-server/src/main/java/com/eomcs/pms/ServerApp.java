package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import com.eomcs.context.ApplicationContextListener;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.listener.AppInitListener;
import com.eomcs.pms.listener.DataHandlerListener;
import com.eomcs.pms.listener.RequestMappingListener;

public class ServerApp {

  static boolean stop = false;

  // 스레드풀 준비
  ExecutorService threadPool = Executors.newCachedThreadPool();

  static Map<String,Object> context = new Hashtable<>();

  List<ApplicationContextListener> listeners = new ArrayList<>();

  public void addApplicationContextListener(ApplicationContextListener listener) {
    listeners.add(listener);
  }

  public void removeApplicationContextListener(ApplicationContextListener listener) {
    listeners.remove(listener);
  }

  private void notifyApplicationContextListenerOnServiceStarted() {
    for (ApplicationContextListener listener : listeners) {
      listener.contextInitialized(context);
    }
  }

  private void notifyApplicationContextListenerOnServiceStopped() {
    for (ApplicationContextListener listener : listeners) {
      listener.contextDestroyed(context);
    }
  }

  public void service(int port) {

    notifyApplicationContextListenerOnServiceStarted();

    try (ServerSocket serverSocket = new ServerSocket(port)) {
      System.out.println("서버 실행 중...");

      while (true) {
        Socket clientSocket = serverSocket.accept();

        if (stop) {
          break;
        }
        // 스레드풀로 변경
        threadPool.execute(() -> handleClient(clientSocket));
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    notifyApplicationContextListenerOnServiceStopped();

    // 스레드풀을 종료한다.
    threadPool.shutdown();

    // 스레드풀을 종료한다.
    try {
      if (!threadPool.awaitTermination(10, TimeUnit.SECONDS)) {
        System.out.println("아직 종료 안된 작업이 있다.");
        System.out.println("남아 있는 작업의 강제 종료를 시도하겠다.");
        threadPool.shutdownNow();

        if (!threadPool.awaitTermination(5, TimeUnit.SECONDS)) {
          System.out.println("스레드풀의 강제 종료를 완료하지 못했다.");
        } else {
          System.out.println("모든 작업을 강제 종료했다.");
        }

      }

      System.out.println("main() 종료!");
    } catch (Exception e) {
      // 예외는 무시한다.
    }
  }


  public static void main(String[] args) {
    ServerApp server = new ServerApp();

    server.addApplicationContextListener(new AppInitListener());
    server.addApplicationContextListener(new DataHandlerListener());
    server.addApplicationContextListener(new RequestMappingListener());

    server.service(8888);
  }

  private static void handleClient(Socket clientSocket) {
    InetAddress address = clientSocket.getInetAddress();
    System.out.printf("클라이언트(%s)가 연결되었습니다.\n",
        address.getHostAddress());

    try (Socket socket = clientSocket;
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream())) {

      String request = in.readLine();

      if (request.equalsIgnoreCase("stop")) {
        stop = true;
        out.println("서버를 종료하는 중입니다!");
        out.println();
        out.flush();
        return;
      }

      Command command = (Command) context.get(request);
      if (command != null) {
        command.execute(out, in);
      } else {
        out.println("해당 명령을 처리할 수 없습니다!");
      }

      out.println();
      out.flush();


    } catch (Exception e) {
      System.out.println("클라이언트와의 통신 오류!");
    }

    System.out.printf("클라이언트(%s)와의 연결을 끊었습니다.\n",
        address.getHostAddress());
  }
}