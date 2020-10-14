/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
  public static void main(String[] args) {
    // 8888 포트에서 클라이언트를 기다리는 서버 소켓을 생성한다.
    // 클라이언트가 연결된 소켓을 리턴 받는다.
    // 소켓을 통해 문자열 메시지를 입출력 할 수 있도록 스트림 객체를 준비한다.
    // 클라이언트가 보낸 메시지를 읽고, 다시 클라이언트에게 리턴해준다.
    // 클라이언트의 요청을 반복해서 처리한다.
    // 클라이언트가 quit 명령어를 보내면 응답한 후 연결을 끊는다.
    // 응답의 끝에는 빈 줄을 보내도록 응답 프로토콜을 정의한다.
    // - 프로토콜이란? 클라이언트/서버 간의 데이터를 주고받는 형식이다.
    // 클라이언트 연결이 끊어지면 다음 클라이언트와 연결하는 것을 반복한다.
    // 클라이언트가 접속하거나 연결을 끊으면 로그를 남긴다.


    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 실행 중");

      while (true) {
        handleClient(serverSocket.accept());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


  private static void sendResponse(PrintWriter out, String message) {
    out.println(message);
    out.println();
    out.flush();
  }


  private static void handleClient(Socket clientSocket) throws Exception {

    InetAddress address = clientSocket.getInetAddress();
    System.out.printf("클라이언트(%s)가 연결되었습니다.\n", address.getHostAddress());

    try (Socket socket = clientSocket;
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream())) {

      while (true) {
        String request = in.readLine();
        sendResponse(out, request);
        if (request.equalsIgnoreCase("quit"))
          break;
      }

    } catch (Exception e) {
      System.out.println("클라이언트와의 통신 오류");
    }

    System.out.printf("클라이언트(%s)와의 연결을 끊었습니다.\n", address.getHostAddress());
  }
}
