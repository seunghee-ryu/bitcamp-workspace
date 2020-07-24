package com.eomcs.pms;

import java.util.Scanner; // 클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.
import java.sql.Date;


// 1 낱개의 변수를 사용하여 여러 회원 정보 처리한다
// 2 조건문을 사용하여 입출력 제어하기
// - 필요한 만큼만 입력 받고 출력하고 싶다.
// 3 배열을 사용하여 여러개의 값을 다루기
// - 배열을 사용하면 간단하게 여러개의 변수를 선언할 수 있다.
// 4 반복문을 사용하여 여러개의 값을 다루기
// - 반복문을 사용하면 같은 코드를 중복해서 작성할 필요가 없다.
// 5 배열 갯수를 변수에서 관리하기
// - 변수의 값만 바꾸면 배열 갯수를 바로 변경할 수 있어 편하다.
// 6 상수를 사용하여 초기값을 변경하지 못하게 막기
// - 변수는 중간에 값을 바꿀 수 있기 때문에 값을 바꾸지 말아야 하는 경우
// 상수로 선언한다.
// 7 메서드를 사용하여 코드를 분리하기
// - 메서드를 사용하면 기능별로 코드를 별도의 블럭으로 분리할 수 있다.
// 작은 단위로 코드가 분리되면 관리하기 쉽다.
// 코드를 관리하기 쉽게 기능 단위로 쪼갠다.
// 8 클래스를 사용하여 데이터를 담을 메모리를 정의한다.
// - 번호, 이름, 이메일 등 각각의 데이터를 낱개로 다루는 것 보다
//   하나의 데이터로 묶어서 다루면 값을 다루기가 편하다.

public class App3 {
  
  static class Member {
    int no;
    String name;
    String email;
    String password;
    String photo;
    String tel;
    Date now;
  }
  

  static int count = 0;
  static final int MAX_LENGTH = 5;
  static Member[] members = new Member[MAX_LENGTH];
  
  
  public static void main(String[] args) {



    System.out.println("[회원]");


    // 최대 5명의 회원 정보를 입력 받는 변수를 선언


    inputMembers(); // 별도의 블록으로 분리한 코드를 실행하기


    System.out.println("------------------------");

    printMembers();

  }



  static void inputMembers() {
    Scanner KeyInput = new Scanner(System.in);
    long currentMillis = 0;

    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      Member m =new Member();
      // 1번 회원 입력
      System.out.print("번호? ");
      m.no = KeyInput.nextInt(); // 0을 배열 인덱스라고 한다
      KeyInput.nextLine();

      System.out.print("이름? ");
      m.name = KeyInput.nextLine();

      System.out.print("이메일? ");
      m.email = KeyInput.nextLine();

      System.out.print("암호? ");
      m.password = KeyInput.nextLine();

      System.out.print("사진? ");
      m.photo = KeyInput.nextLine();

      System.out.print("전화? ");
      m.tel = KeyInput.nextLine();

      currentMillis = System.currentTimeMillis();
      m.now = new Date(currentMillis);
      System.out.println();
      
      // 식판을 배선카에 담는다
      members[i] = m;

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = KeyInput.nextLine();

      if (response.equalsIgnoreCase("y") == false) {
        break; // 반복문을 멈춰라
      }
    }

    KeyInput.close();
  }



  static void printMembers() {

    for (int i = 0; i < count; i++) {
      Member m = members[i];
      System.out.printf("%d, %s, %s, %s, %s\n", 
          m.no, m.name, m.email, m.tel, m.now.toString());

      {


      }

    }
  }
}


