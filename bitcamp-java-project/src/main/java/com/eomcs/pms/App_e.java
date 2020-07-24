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

public class App_e {

  public static void main(String[] args) {

    Scanner KeyInput = new Scanner(System.in);

    System.out.println("[회]");
    

    // 최대 5명의 회원 정보를 입력 받는 변수를 선언
    
    int maxLength = 5;
    
    int[] no = new int[maxLength];
    String[] name = new String[maxLength];
    String[] email = new String[maxLength];
    String[] password = new String[maxLength];
    String[] photo = new String[maxLength];
    String[] tel = new String[maxLength];
    Date[] now = new Date[maxLength];

    long currentMillis = 0;
    int count = 0;

    for (int i = 0; i < maxLength; i++) {
      count++;
      // 1번 회원 입력
      System.out.print("번호? ");
      no[i] = KeyInput.nextInt(); // 0을 배열 인덱스라고 한다
      KeyInput.nextLine();

      System.out.print("이름? ");
      name[i] = KeyInput.nextLine();

      System.out.print("이메일? ");
      email[i] = KeyInput.nextLine();

      System.out.print("암호? ");
      password[i] = KeyInput.nextLine();

      System.out.print("사진? ");
      photo[i] = KeyInput.nextLine();

      System.out.print("전화? ");
      tel[i] = KeyInput.nextLine();

      currentMillis = System.currentTimeMillis();
      now[i] = new Date(currentMillis);
      System.out.println();

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = KeyInput.nextLine();

      if (response.equalsIgnoreCase("y") == false) {
        break; // 반복문을 멈춰라
      }
    }
    KeyInput.close();
    System.out.println("------------------------");
    
    for (int i = 0; i< count; i++) {
    
    System.out.printf("%d, %s, %s, %s, %s\n", 
        no[i], name[i], email[i], tel[i], now[i].toString());
    
    {
     
          
        }
      }
    
  }
}


