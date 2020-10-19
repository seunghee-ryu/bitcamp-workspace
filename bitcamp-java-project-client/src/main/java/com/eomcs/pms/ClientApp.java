package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import com.eomcs.util.Prompt;

public class ClientApp {

  // host 와 port 변수를 준비한다.
  static String host;
  static int port;

  public static void main(String[] args) {

    if (args.length != 2) {
      System.out.println("프로그램 사용법");
      System.out.println("java -cp ... ClientApp 서버주소 포트번호");
      System.exit(0);
    }

    // host는 args의 0번째에 들어있고 port 번호는 args의 1번째에 들어있다.
    host = args[0];
    port = Integer.parseInt(args[1]);

    // quit 일때 바로 클라이언트를 종료한다.
    while (true) {
      String input = Prompt.inputString("명령> ");
      if (input.equalsIgnoreCase("quit")) {
        break;
      }

      // request를 수행한다.
      request(input);

      // stop 일때 서버를 종료한다.
      if (input.equalsIgnoreCase("stop")) {
        break;
      }
    }
    System.out.println("안녕!");

  }


  // request를 수행하는 메서드
  private static void request(String message) {
    // stop의 값을 false로 설정해 둔다.
    boolean stop = false;

    // socket을 통해 서버와 통신한다.
    try (Socket socket = new Socket("localhost", 8888);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

      // 메시지를 보낸다.
      out.println(message);
      out.flush();

      // 서버의 리턴을 받는다.
      receiveResponse(out, in);

      // 만약 메시지가 stop 이라면 stop의 불린 값을 true로 바꾼다.
      if (message.equalsIgnoreCase("stop")) {
        stop = true;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    // 만약 stop이 참이라면 서버에 한 번 접속했다가 끊는다.
    if (stop) {
      try (Socket socket = new Socket(host, port)) {
      } catch (Exception e) {
      }
    }
  }

  // 사용자로부터 값을 입력받는 파라미터를 만든다.
  private static void receiveResponse(PrintWriter out, BufferedReader in) throws Exception {
    while (true) {
      String response = in.readLine();
      if (response.length() == 0) {
        break;
      } else if (response.equals("!{}!")) {
        // 사용자로부터 값을 입력받아서 서버에 보낸다.
        out.println(Prompt.inputString(""));
        out.flush();
      } else {
        System.out.println(response);
      }
    }
  }
}
