package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);

    // 여러개의 프로젝트 정보를 입력받기 위해 변수 준비

    final int LENGTH = 100;
    int[] no = new int[LENGTH];
    String[] title = new String[LENGTH];
    String[] content = new String[LENGTH];
    Date[] startDate = new Date[LENGTH];
    Date[] endDate = new Date[LENGTH];
    String[] owner = new String[LENGTH];
    String[] members = new String[LENGTH];

    int count = 0;

    System.out.print("[프로젝트]");

    for (int i = 0; i < LENGTH; i++) {
      count++;

      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명: ");
      title[i] = keyInput.nextLine();

      System.out.print("내용: ");
      content[i] = keyInput.nextLine();

      System.out.print("시작일? ");
      startDate[i] = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.print("종료일? ");
      endDate[i] = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.print("만든이? ");
      owner[i] = keyInput.nextLine();

      System.out.print("팀원? ");
      members[i] = keyInput.nextLine();

      System.out.println();

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y")) // 응답이 y 가 아니라면 멈춰라
        break;

      System.out.println();


    }

    keyInput.close();

    System.out.println("------------------------");

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          no[i], title[i], startDate[i], endDate[i], owner[i]);
    }

  }
}

