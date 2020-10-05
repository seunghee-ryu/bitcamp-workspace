// connectionless 클라이언트 - 연결없이 데이터 수신
package com.eomcs.net.ex05;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class Server0211 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);

    System.out.println("서버 실행 중");

    System.out.println("소켓 생성 전 잠깐>");
    keyScan.nextLine();

    DatagramSocket socket = new DatagramSocket(8888);

    byte[] buf = new byte[8196];

    DatagramPacket emptyPacket = new DatagramPacket(buf, buf.length);

    System.out.println("데이터 읽기 전에 잠깐 멈춤>");
    keyScan.nextLine();

    socket.receive(emptyPacket);
    System.out.println("데이터를 받았음");

    socket.close();
    keyScan.close();

    String message = new String(
        emptyPacket.getData(),
        0,
        emptyPacket.getLength(),
        "UTF-8"
        );
    System.out.println(message);

  }
}


