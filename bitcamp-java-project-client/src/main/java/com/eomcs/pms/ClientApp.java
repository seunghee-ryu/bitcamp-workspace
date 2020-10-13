
package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientApp {
  public static void main(String[] args) {
    // 서버주소: localhost
    // 서버포트: 8888

    // 서버와 연결된 소켓을 생성한다.
    // 소켓을 통해 문자열을 입출력할 수 있도록 스트림 객체를 준비한다.
    // 먼저 서버에 간단한 인삿말을 보낸다.
    // 서버가 응답한 메시지를 출력한다.

    try (Socket socket = new Socket("localhost", 8888);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

      out.println("Hello");
      out.flush();

      String response = in.readLine();
      System.out.println(response);

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}

