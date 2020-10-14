
package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import com.eomcs.util.Prompt;

// 서버와 연결된 소켓을 생성한다.
// 소켓을 통해 문자열을 입출력할 수 있도록 스트림 객체를 준비한다.
// 먼저 서버에 간단한 인삿말을 보낸다.
// 서버가 응답한 메시지를 출력한다.
// 사용자가 입력한 명령을 보내기.
// 사용자가 quit 명령을 입력할 때까지 반복한다.
// 서버가 응답의 끝을 알리는 빈 줄을 보낼 때까지 클라이언트는 계속 읽는다.
// 애플리케이션 아규먼트를 통해 서버의 주소와 포트번호를 입력 받는다.

public class ClientApp {
  public static void main(String[] args) {

    if (args.length != 2) {
      System.out.println("프로그램 사용법:");
      System.out.println(" java -cp ... ClientApp 서버주소 포트번호");
      System.exit(0);
    }


    try (Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

      while (true) {
        String input = Prompt.inputString("명령> ");
        out.println(input);
        out.flush();

        receiveResponse(in);

        if (input.equalsIgnoreCase("quit"))
          break;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void receiveResponse(BufferedReader in) throws Exception {
    while (true) {
      String response = in.readLine();
      if (response.length() == 0)
        break;
      System.out.println(response);
    }
  }

}

