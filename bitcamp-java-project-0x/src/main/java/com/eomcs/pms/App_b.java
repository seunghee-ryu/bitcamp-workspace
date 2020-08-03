package com.eomcs.pms;
// 클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.
// 1) 회원의 번호, 이름, 이메일, 암호, 사진, 전화번호, 등록일을 담을 수 있는 메모리를 설계한다.
//   => Member 클래스 정의
// 2) Member 클래스의 레퍼런스 배열을 만들어 Member 의 인스턴스를 보관한다..

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    // 값을 담기 위해 메모리를 준비할 때
    // 어떤 종류의 메모리를 준비해야 하는지
    // 설계도를 작성한다.
    // => 클래스 정의

    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date createdDate;
    }

    // Member 인스턴스의 주소를 담을 레퍼런스 배열을 준비한다.
    final int LENGTH = 100;
    // 멤버 레퍼런스의 배열 주소를 담을 레퍼런스
    Member[] members = new Member[LENGTH]; // [  ,  ,  ,  , ]


    System.out.println("[회원]");

    Scanner keyboardScan = new Scanner(System.in);

    int count = 0;

    for (int i = 0; i < LENGTH; i++) {
      count++;

      members[i]= new Member();

      System.out.print("번호? ");
      members[i].no = Integer.parseInt(keyboardScan.nextLine());

      System.out.print("이름? ");
      members[i].name = keyboardScan.nextLine();

      System.out.print("이메일? ");
      members[i].email = keyboardScan.nextLine();

      System.out.print("암호? ");
      members[i].password = keyboardScan.nextLine();

      System.out.print("사진? ");
      members[i].photo = keyboardScan.nextLine();

      System.out.print("전화? ");
      members[i].tel = keyboardScan.nextLine();

      System.out.print("가입일? ");
      members[i].createdDate = new java.sql.Date(System.currentTimeMillis());

      System.out.println(); // 빈 줄 출력

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String str = keyboardScan.nextLine();
      if (!str.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println(); // 빈 줄 출력
    }

    keyboardScan.close();

    System.out.println("--------------------------------");

    for (int i = 0; i < count; i++) {
      // 번호, 이름, 이메일, 전화, 가입일
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          members[i].no, members[i].name, members[i].email, members[i].tel, members[i].createdDate);
    }

  }
}
