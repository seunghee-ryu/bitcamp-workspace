package com.eomcs.pms;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner KeyInput = new java.util.Scanner(System.in);
    
    System.out.println("작업");
    
    System.out.printf("프로젝트? ");
    String project = KeyInput.nextLine();
    
    System.out.printf("번호? ");
    String str = KeyInput.nextLine();
    int no = Integer.parseInt(str);
    
    
    System.out.printf("내용? ");
    String contents = KeyInput.nextLine();
    
    System.out.printf("완료일? ");
    java.sql.Date completedDate = java.sql.Date.valueOf(KeyInput.nextLine());
    
    System.out.println("상태? ");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print(">");
    String state = KeyInput.nextLine();
    
    System.out.printf("담당자? ");
    String worker = KeyInput.nextLine();
    
    KeyInput.close();
    
    System.out.println("---------------------");
    
    System.out.printf("프로젝트: %s\n", project);
    System.out.printf("번호: %s\n", no);
    System.out.printf("내용: %s\n", contents);
    System.out.printf("완료일: %s\n", completedDate.toString());
    System.out.print("상태: ");
    
    switch (state) {
      case "0":
        System.out.println("신규");
        break;
      case "1":
        System.out.println("진행중");
        break;
      default:
        System.out.println("완료");
        
    }
    
//    if (state.equals("0")) {
//      System.out.println("신규");
//    } else if (state.equals("1")) {
//      System.out.println("진행중");
//    } else {
//      System.out.println("완료"); 
//    }
//  전체 긁고서 커맨드 누르고 슬래
    System.out.printf("담당자: %s\n", worker);
    
  }
}
