package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final int LENGTH = 100;
    String[] project = new String[LENGTH];
    int[] no = new int[LENGTH];
    String[] content = new String[LENGTH];
    Date[] startDate = new Date[LENGTH];
    Date[] endDate = new Date[LENGTH];
    String[] owner = new String[LENGTH];
    String[] members = new String[LENGTH];

    int count = 0;

    System.out.print("[작업]");

    for (int i = 0; i < LENGTH; i++) {
      count++;

      System.out.print("프로젝트? ");
      project[i] = sc.nextLine();
      sc.nextLine();

      System.out.print("번호: ");
      no[i] = sc.nextInt();

      System.out.print("완료일? ");
      endDate[i] = java.sql.Date.valueOf(sc.nextLine());

      System.out.print("만든이? ");
      owner[i] = sc.nextLine();

      System.out.print("팀원? ");
      members[i] = sc.nextLine();

      System.out.println();

      System.out.print("계속 출력하시겠습니까?(y/N) ");
      String response = sc.nextLine();
      if (!response.equalsIgnoreCase("y"))
      break;

      System.out.println();

    }
    sc.close();

    System.out.println("------------------------");

    for (int i = 0; i < LENGTH; i++) {

      System.out.printf("%s, %d, %s, %s, %s\n",
          project[i], no[i], endDate[i], owner[i]);

    }

  }
}
