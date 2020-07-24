package com.eomcs.pms;

import java.util.Scanner; // 클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.
import java.sql.Date;


// 1 낱개의 변수를 사용하여 여러 회원 정보 처리한다
// 2 조건문을 사용하여 입출력 제어하기
// - 필요한 만큼만 입력 받고 출력하고 싶다.
public class App_b {

  public static void main(String[] args) {

    Scanner KeyInput = new Scanner(System.in);


    System.out.println("[회원]");

    // 최대 5명의 회원 정보를 입력 받는 변수를 선언
    int no1 = 0, no2 = 0, no3 = 0, no4 = 0, no5 = 0;
    String name1 = "", name2 = "", name3 = "", name4 = "", name5 = "";
    String email1 = "", email2 = "", email3 = "", email4 = "", email5 = "";
    String password1 = "", password2 = "", password3 = "", password4 = "", password5 = "";
    String photo1 = "", photo2 = "", photo3 = "", photo4 = "", photo5 = "";
    String tel1 = "", tel2 = "", tel3 = "", tel4 = "", tel5 = "";
    Date now1 = null, now2 = null, now3 = null, now4 = null, now5 = null;
    long currentMillis = 0;
    int count = 1;


    // 1번 회원 입력
    System.out.print("번호? ");
    no1 = KeyInput.nextInt();
    KeyInput.nextLine();

    System.out.print("이름? ");
    name1 = KeyInput.nextLine();

    System.out.print("이메일? ");
    email1 = KeyInput.nextLine();

    System.out.print("암호? ");
    password1 = KeyInput.nextLine();

    System.out.print("사진? ");
    photo1 = KeyInput.nextLine();

    System.out.print("전화? ");
    tel1 = KeyInput.nextLine();

    currentMillis = System.currentTimeMillis();
    now1 = new Date(currentMillis);
    System.out.println();

    System.out.print("계속 입력하시겠습니까?(y/N) ");
    String response = KeyInput.nextLine();

    if (response.equals("y") || response.equals("Y")) {
      // 2번 회원 입력
      count = count + 1;
      System.out.print("번호? ");
      no2 = KeyInput.nextInt();
      KeyInput.nextLine();

      System.out.print("이름? ");
      name2 = KeyInput.nextLine();

      System.out.print("이메일? ");
      email2 = KeyInput.nextLine();

      System.out.print("암호? ");
      password2 = KeyInput.nextLine();

      System.out.print("사진? ");
      photo2 = KeyInput.nextLine();

      System.out.print("전화? ");
      tel2 = KeyInput.nextLine();

      currentMillis = System.currentTimeMillis();
      now2 = new Date(currentMillis);
      System.out.println();

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      response = KeyInput.nextLine();

      if (response.equalsIgnoreCase("y")) {
        // 3번 회원 입력
        count = count + 1;
        System.out.print("번호? ");
        no3 = KeyInput.nextInt();
        KeyInput.nextLine();

        System.out.print("이름? ");
        name3 = KeyInput.nextLine();

        System.out.print("이메일? ");
        email3 = KeyInput.nextLine();

        System.out.print("암호? ");
        password3 = KeyInput.nextLine();

        System.out.print("사진? ");
        photo3 = KeyInput.nextLine();

        System.out.print("전화? ");
        tel3 = KeyInput.nextLine();

        currentMillis = System.currentTimeMillis();
        now3 = new Date(currentMillis);
        System.out.println();

        System.out.print("계속 입력하시겠습니까?(y/N) ");
        response = KeyInput.nextLine();

        if (response.equalsIgnoreCase("y")) {
          // 4번 회원 입력
          count += 1;
          System.out.print("번호? ");
          no4 = KeyInput.nextInt();
          KeyInput.nextLine();

          System.out.print("이름? ");
          name4 = KeyInput.nextLine();

          System.out.print("이메일? ");
          email4 = KeyInput.nextLine();

          System.out.print("암호? ");
          password4 = KeyInput.nextLine();

          System.out.print("사진? ");
          photo4 = KeyInput.nextLine();

          System.out.print("전화? ");
          tel4 = KeyInput.nextLine();

          currentMillis = System.currentTimeMillis();
          now4 = new Date(currentMillis);
          System.out.println();

          System.out.print("계속 입력하시겠습니까?(y/N) ");
          response = KeyInput.nextLine();

          if (response.equalsIgnoreCase("y")) {
            // 5번 회원 입력
            count++;
            System.out.print("번호? ");
            no5 = KeyInput.nextInt();
            KeyInput.nextLine();

            System.out.print("이름? ");
            name5 = KeyInput.nextLine();

            System.out.print("이메일? ");
            email5 = KeyInput.nextLine();

            System.out.print("암호? ");
            password5 = KeyInput.nextLine();

            System.out.print("사진? ");
            photo5 = KeyInput.nextLine();

            System.out.print("전화? ");
            tel5 = KeyInput.nextLine();

            currentMillis = System.currentTimeMillis();
            now5 = new Date(currentMillis);
            System.out.println();


            KeyInput.close();
          }
        }
      }
    }

    System.out.println("------------------------");
    System.out.printf("%d, %s, %s, %s, %s\n", no1, name1, email1, tel1, now1.toString());
    if (count > 1)
      ;
    {
      System.out.printf("%d, %s, %s, %s, %s\n", no1, name2, email2, tel2, now2.toString());
      if (count > 2)
        ;
      {
        System.out.printf("%d, %s, %s, %s, %s\n", no1, name3, email3, tel3, now3.toString());
        if (count > 3)
          ;
        {
          System.out.printf("%d, %s, %s, %s, %s\n", no1, name4, email4, tel4, now4.toString());
          if (count > 4)
            ;
          {
            System.out.printf("%d, %s, %s, %s, %s\n", no1, name5, email5, tel5, now5.toString());
          }
        }
      }
    }
  }
}


