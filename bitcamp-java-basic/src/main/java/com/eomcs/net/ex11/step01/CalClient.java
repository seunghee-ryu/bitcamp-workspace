// 계산기 클라이언트 만들기
package com.eomcs.net.ex11.step01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CalClient {
  public static void main(String[] args) {

    try (
        Scanner keyboardScaner = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8888);
        PrintStream out = new PrintStream(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

      receiveResponse(in);

      while (true) {
        String input = prompt(keyboardScaner);
        if (input == null) {
          continue;
        }
        sendRequest(out, input);
        receiveResponse(in);

        if (input.equalsIgnoreCase("quit")) {
          break;
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static String prompt(Scanner keyboardScanner) {
    System.out.print("계산식>");
    String input = keyboardScanner.nextLine();

    if (input.equalsIgnoreCase("quit")) {
      return input;

    } else if (input.split(" ").length != 3) {
      System.out.println("입력 형식이 올바르지 않습니다. 예) 23 + 7");
      return null;
    }

    return input;
  }

  static void sendRequest(PrintStream out, String message) throws Exception {
    out.println(message);
    out.flush();
  }

  static void receiveResponse(BufferedReader in) throws Exception {
    while (true) {
      String input = in.readLine();
      if (input.length() == 0) {
        // 빈 줄을 읽었다면 읽기를 끝낸다.
        break;
      }
      System.out.println(input);
    }
  }
}


