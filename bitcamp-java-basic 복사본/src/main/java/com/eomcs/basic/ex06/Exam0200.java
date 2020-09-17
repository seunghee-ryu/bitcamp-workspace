package com.eomcs.basic.ex06;

public class Exam0200 {
  public static void main(String[] args) {

    final int DEVELOPER = 1;
    final int GENERAL_MANAGER = 2;
    final int BUILDING_MANAGER = 3;

    int type = 2;

    if (type == DEVELOPER) { // 개발자일경우
      System.out.println("정보처리자격증");
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == GENERAL_MANAGER) { // 일반관리
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == BUILDING_MANAGER) { // 시설관리
      System.out.println("이력서");
    } else {
      System.out.println("잘못된 지원입니다.");
    }

    System.out.println("--------------------");

    //단순한 것을 비교할때는 switch 문이 더 편리하다

/*
    switch (type) {
      case DEVELOPER:
        System.out.println("정보처리자격증");
        System.out.println("졸업증명서");
        System.out.println("이력서");
        break;
      case GENERAL_MANAGER:
        System.out.println("졸업증명서");
        System.out.println("이력서");
        break;
      case BUILDING_MANAGER:
        System.out.println("이력서");
        break;
      default:
        System.out.println("잘못된 지원입니다.");
        */


    // 위와 같이 중복되는 것이 있을때는
    // 일부러 브레이크를 쓰지않는 경우도 있다.
    switch (type) {
      case DEVELOPER:
        System.out.println("정보처리자격증");
      case GENERAL_MANAGER:
        System.out.println("졸업증명서");
      case BUILDING_MANAGER:
        System.out.println("이력서");
        break;
      default:
        System.out.println("잘못된 지원입니다.");
    }

    int score = 70;

    switch (score) {
      case 100:
      case 90:
        System.out.println("A");
        break;
      case 80:
      case 70:
        System.out.println("B");
        break;
      case 60:
      case 50:
        System.out.println("C");
        break;
      default:
        System.out.println("F");

        // 값이 딱 떨어질 때는 좋지만 범위를 정할때는 if 문이 더 낫다.

        System.out.println("--------------------");

        String value = "developer";
        final String value2 = "hello";

        switch (value) { // 4 바이트 이하 정수(byte, short, int, char), 문자
          case "developer":
            break;
          case "manager":
            break;
          case value2: // final을 붙이면 값이 바뀌지 않기 때문에 상수가 된다.
            break;
          case "ok" + "haha": // 상수 표현식도 가능하다.
          default:


            int value3 = 100;
            final int X = 200;
            switch (value3) {
              case 100:
                break;
              case 100 + 3:
                break;
              case X:
                break;
              case X + 3:
                break;
              }
            
            
    System.out.println("--------------------"); 
    


        }
    }
    
    Job type2 = Job.DEV;
    switch (type2) {
      case DEV:
        break;
      case GM:
        break;
      case BM:
        break;
    }

  }
  enum Job {
    DEV, GM, BM
  }

}
