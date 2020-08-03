package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;


public class App {
  static Scanner keyboardScan = new Scanner(System.in);

  // 회원 데이터
  static final int LENGTH = 100;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tel = new String[LENGTH];
  static Date[] registeredDate = new Date[LENGTH];
  static int size = 0;

  // 프로젝트 데이터
  static final int PLENGTH = 100;
  static int[] pno = new int[PLENGTH];
  static String[] ptitle = new String[PLENGTH];
  static String[] pcontent = new String[PLENGTH];
  static Date[] pstartDate = new Date[PLENGTH];
  static Date[] pendDate = new Date[PLENGTH];
  static String[] powner = new String[PLENGTH];
  static String[] pmembers = new String[PLENGTH];
  static int psize = 0;

  // 작업 데이터
  static final int TLENGTH = 100;
  static int[] tno = new int[TLENGTH];
  static String[] tcontent = new String[TLENGTH];
  static Date[] tdeadline = new Date[TLENGTH];
  static String[] towner = new String[TLENGTH];
  static int[] tstatus = new int[TLENGTH];
  static int tsize = 0;

  public static void main(String[] args) {

    loop: while (true) {
     String command = promptString("명령> ");

      switch (command) {
        case "/member/add":
          addMember();

        case "/member/list":
          listMember();

        case "/project/add":
          addProject();

        case "/project/list":
          listProject();

        case "/task/add":
          addTask();

        case "/task/list":
          listTask();


        case "quit":
        case "exit":
          System.out.println("안녕!");

          break loop;

        default:
          System.out.println("실행할 수 없는 명령입니다.");
      }
      System.out.println();
    }
  keyboardScan.close();
  }

  static void addMember() {
    System.out.println("회원 등록");
    for (int i = 0; i < LENGTH; i++) {
      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());

      System.out.print("이름? ");
      name[i] = keyboardScan.nextLine();

      System.out.print("이메일? ");
      email[i] = keyboardScan.nextLine();

      System.out.print("암호? ");
      password[i] = keyboardScan.nextLine();

      System.out.print("사진? ");
      photo[i] = keyboardScan.nextLine();

      System.out.print("전화? ");
      tel[i] = keyboardScan.nextLine();

      registeredDate[i] = new java.sql.Date(System.currentTimeMillis());

      size++;
    }
  }

  static void listMember() {
    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", no[i], name[i], email[i], tel[i],
          registeredDate[i]);
    }

  }

  static void addProject() {
    System.out.println("[프로젝트 등록]");

    System.out.print("번호? ");
    pno[psize] = Integer.valueOf(keyboardScan.nextLine());

    System.out.print("프로젝트명? ");
    ptitle[psize] = keyboardScan.nextLine();

    System.out.print("내용? ");
    pcontent[psize] = keyboardScan.nextLine();

    System.out.print("시작일? ");
    pstartDate[psize] = Date.valueOf(keyboardScan.nextLine());

    System.out.print("종료일? ");
    pendDate[psize] = Date.valueOf(keyboardScan.nextLine());

    System.out.print("만든이? ");
    powner[psize] = keyboardScan.nextLine();

    System.out.print("팀원? ");
    pmembers[psize] = keyboardScan.nextLine();

    psize++;
  }

  static void listProject() {
    System.out.println("[프로젝트 목록]");

    for (int i = 0; i < psize; i++) {
      // 번호, 프로젝트명, 시작일, 종료일, 만든이
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          pno[i], ptitle[i], pstartDate[i], pendDate[i], powner[i]);
    }
  }

  static void addTask() {

    System.out.println("[작업 등록]");

    System.out.print("번호? ");
    tno[tsize] = Integer.parseInt(keyboardScan.nextLine());

    System.out.print("내용? ");
    tcontent[tsize] = keyboardScan.nextLine();

    System.out.print("마감일? ");
    tdeadline[tsize] = Date.valueOf(keyboardScan.nextLine());

    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    tstatus[tsize] = Integer.valueOf(keyboardScan.nextLine());

    System.out.print("담당자? ");
    towner[tsize] = keyboardScan.nextLine();

    tsize++;

  }

  static void listTask() {
    System.out.println("[작업 목록]");

    for (int i = 0; i < tsize; i++) {
      String stateLabel = null;
      switch (tstatus[i]) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          tno[i], tcontent[i], tdeadline[i], stateLabel, towner[i]);
    }
  }

    static String promptString(String title) {
      System.out.println(title);
      return keyboardScan.nextLine();
    }

    static int promptInt(String title) {
      System.out.println(title);
      return Integer.parseInt(keyboardScan.nextLine());
    }

    static Date promptDate(String title) {
      System.out.print(title);
      return Date.valueOf(keyboardScan.nextLine());
    }

  }

