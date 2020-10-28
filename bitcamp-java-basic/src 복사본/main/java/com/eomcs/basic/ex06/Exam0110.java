// 조건문

package com.eomcs.basic.ex06;

public class Exam0110 {
  public static void main(String[] args) {
    // 명령어는 위에서 아래로 흐른다.
    // 명령어의 흐름을 바꾸고 싶을 때 쓰는 것이 조건문이다.
    int age = 19;

    if (age >= 19) {
      System.out.println("성년!");
      System.out.println("안녕!");
    }
    // 소스 코드를 읽을 때 어느것이 더 직관적인지 봐야한다.
    // age >= 19 는 19세 이상입니다 로 읽히고
    // age > 18 은 18세 초과입니다 로 읽힌다.
    // 어느것이 더 읽기 편한지 판단해야 한다.
    // if 문은 ; 전까지만 작용한다.
    // {} 로 묶으면 그 단위에 작용한다.

    System.out.println("---------- ----------");

    int gender = 1;

    if (gender != 2) {
      System.out.println("여성");
    }

    System.out.println("---------- ----------");

    int gender1 = 1;

    if (gender == 1)
      System.out.println("여성");

    if (gender == 2)
      System.out.println("남성");

    System.out.println("---------- ----------");

    int age1 = 64;

    if (age >= 19)
      System.out.println("성인입니다.");

    if (age >= 65)
      System.out.println("노인연금수령 대상자입니다.");
    // 위의 if문이 참이든 거짓이든 아래 if 문장을 검사해야 하는 경우에는 이렇게 쓴다.

    System.out.println("---------- ----------");

    int gender2 = 2;

    if (gender2 == 1) {
      System.out.println("여성");
      System.out.println("-----");
    } else {
      System.out.println("남성");
      System.out.println("-----");
    }
    // 서로 배타적인 경우 모든 조건을 모두 검사하지 않아도 되는 경우에는
    // if 문을 계속 사용하지 않고 else 문을 사용한다.
    // else 문은 if 문 없이 홀로 사용할 수 없기 때문에 if 문 바로 뒤에 붙어야 한다.

    System.out.println("---------- ----------");

    int age4 = 17;

    if (age4 >= 19)
      if (age4 > 65)
        System.out.println("지하철 무임승차 가능합니다.");
      else
        System.out.println("미성년입니다.");
    else
      System.out.println("ok");
    // else 는 가장 가까운 if 문에 속한다.
    // 중괄호를 사용해서 19세 이상 if 문에 65세 이상 if 문을 종속시키면
    // else 는 19세 이상 if 문에 속하게 된다.
    // 하지만 중괄호를 사용하지 않는다면 65세 이상 if 문에 종속된다.

    System.out.println("---------- ----------");

    int age5 = 67;

    if (age5 <8)
      System.out.println("아동");
    else
      if (age5 <14)
        System.out.println("어린이");
      else
        if (age5 <19)
          System.out.println("청소년");
        else
        if (age5 < 65)
          System.out.println("성인");
        else
          System.out.println("노인");


    System.out.println("---------- ----------");

    age5 = 64;

    if (age5 < 8)
      System.out.println("아동");
    else if (age5 < 14)
      System.out.println("어린이");
    else if (age5 < 19)
      System.out.println("청소년");
    else if (age5 < 65)
      System.out.println("성인");
    else
      System.out.println("노인");

    System.out.println("---------- ----------");

    age5 = 22;

    if (age5 < 8) {
      System.out.println("아동");
    } else if (age5 < 14) {
      System.out.println("어린이");
    } else if (age5 < 19) {
      System.out.println("청소년");
    } else if (age5 < 65) {
      System.out.println("성인");
    } else {
      System.out.println("노인");
    }

    // 원래는 아래 모양과 같다

    if (age5 < 8) {
      System.out.println("아동");
    } else
      if (age5 < 14) {
        System.out.println("어린이");
      } else
        if (age5 < 19) {
          System.out.println("청소년");
        } else
          if (age5 < 65) {
            System.out.println("성인");
          } else {
            System.out.println("노인");
          }

    System.out.println("---------- ----------");






      }

    }
