package com.eomcs.pms;

import java.util.Scanner; // 클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.

import java.sql.Date;


// 1 낱개의 변수를 사용하여 여러 회원 정보 처리한다
// 2 조건문을 사용하여 입출력 제어하기
// - 필요한 만큼만 입력 받고 출력하고 싶다.
// 3 배열을 사용하여 여러개의 값을 다루기
// - 배열을 사용하면 간단하게 여러개의 변수를 선언할 수 있다.
public class App_c {

  public static void main(String[] args) {

    Scanner KeyInput = new Scanner(System.in);


    System.out.println("[회원]");

    // 최대 5명의 회원 정보를 입력 받는 변수를 선언
    int[] no = new int[5];
    String[] name = new String[5];
    String[] email = new String[5];
    String[] password = new String[5];
    String[] photo = new String[5];
    String[] tel = new String[5];
    Date [] now = new Date[5];
        
    long currentMillis = 0;
    int count = 1;


    // 1번 회원 입력
    System.out.print("번호? ");
    no[0] = KeyInput.nextInt(); // 0을 배열 인덱스라고 한다
    KeyInput.nextLine();

    System.out.print("이름? ");
    name[0] = KeyInput.nextLine();

    System.out.print("이메일? ");
    email[0] = KeyInput.nextLine();

    System.out.print("암호? ");
    password[0] = KeyInput.nextLine();

    System.out.print("사진? ");
    photo[0] = KeyInput.nextLine();

    System.out.print("전화? ");
    tel[0] = KeyInput.nextLine();

    currentMillis = System.currentTimeMillis();
    now[0] = new Date(currentMillis);
    System.out.println();

    System.out.print("계속 입력하시겠습니까?(y/N) ");
    String response = KeyInput.nextLine();

    if (response.equals("y") || response.equals("Y")) {
      // 2번 회원 입력
      count = count + 1;
      System.out.print("번호? ");
      no[1] = KeyInput.nextInt();
      KeyInput.nextLine();

      System.out.print("이름? ");
      name[1] = KeyInput.nextLine();

      System.out.print("이메일? ");
      email[1] = KeyInput.nextLine();

      System.out.print("암호? ");
      password[1] = KeyInput.nextLine();

      System.out.print("사진? ");
      photo[1] = KeyInput.nextLine();

      System.out.print("전화? ");
      tel[1] = KeyInput.nextLine();

      currentMillis = System.currentTimeMillis();
      now[1] = new Date(currentMillis);
      System.out.println();
      

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      response = KeyInput.nextLine();

      if (response.equalsIgnoreCase("y")) {
        // 3번 회원 입력
        count = count + 1;
        System.out.print("번호? ");
        no[2] = KeyInput.nextInt();
        KeyInput.nextLine();

        System.out.print("이름? ");
        name[2] = KeyInput.nextLine();

        System.out.print("이메일? ");
        email[2] = KeyInput.nextLine();

        System.out.print("암호? ");
        password[2] = KeyInput.nextLine();

        System.out.print("사진? ");
        photo[2] = KeyInput.nextLine();

        System.out.print("전화? ");
        tel[2] = KeyInput.nextLine();

        currentMillis = System.currentTimeMillis();
        now[2] = new Date(currentMillis);
        System.out.println();

        System.out.print("계속 입력하시겠습니까?(y/N) ");
        response = KeyInput.nextLine();

        if (response.equalsIgnoreCase("y")) {
          // 4번 회원 입력
          count += 1;
          System.out.print("번호? ");
          no[3] = KeyInput.nextInt();
          KeyInput.nextLine();

          System.out.print("이름? ");
          name[3] = KeyInput.nextLine();

          System.out.print("이메일? ");
          email[3] = KeyInput.nextLine();

          System.out.print("암호? ");
          password[3] = KeyInput.nextLine();

          System.out.print("사진? ");
          photo[3] = KeyInput.nextLine();

          System.out.print("전화? ");
          tel[3] = KeyInput.nextLine();

          currentMillis = System.currentTimeMillis();
          now[3] = new Date(currentMillis);
          System.out.println();

          System.out.print("계속 입력하시겠습니까?(y/N) ");
          response = KeyInput.nextLine();

          if (response.equalsIgnoreCase("y")) {
            // 5번 회원 입력
            count++;
            System.out.print("번호? ");
            no[4] = KeyInput.nextInt();
            KeyInput.nextLine();

            System.out.print("이름? ");
            name[4] = KeyInput.nextLine();

            System.out.print("이메일? ");
            email[4] = KeyInput.nextLine();

            System.out.print("암호? ");
            password[4] = KeyInput.nextLine();

            System.out.print("사진? ");
            photo[4] = KeyInput.nextLine();

            System.out.print("전화? ");
            tel[4] = KeyInput.nextLine();

            currentMillis = System.currentTimeMillis();
            now[4] = new Date(currentMillis);
            System.out.println();


            KeyInput.close();
          }
        }
      }
    }

    System.out.println("------------------------");
    System.out.printf("%d, %s, %s, %s, %s\n", no[0], name[0], email[0], tel[0], now[0].toString());
    if (count > 1)
      ;
    {
      System.out.printf("%d, %s, %s, %s, %s\n", no[1], name[1], email[1], tel[1], now[1].toString());
      if (count > 2)
        ;
      {
        System.out.printf("%d, %s, %s, %s, %s\n", no[2], name[2], email[2], tel[2], now[2].toString());
        if (count > 3)
          ;
        {
          System.out.printf("%d, %s, %s, %s, %s\n", no[3], name[3], email[3], tel[3], now[3].toString());
          if (count > 4)
            ;
          {
            System.out.printf("%d, %s, %s, %s, %s\n", no[4], name[4], email[4], tel[4], now[4].toString());
          }
        }
      }
    }
  }
}


