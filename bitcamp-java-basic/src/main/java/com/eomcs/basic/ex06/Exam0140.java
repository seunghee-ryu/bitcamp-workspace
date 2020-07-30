package com.eomcs.basic.ex06;

public class Exam0140 {
  public static void main(String[] args) {
    int age = 17;

    // if 문은 else 문 없이 단독으로 사용할 수 있다.
    if (age < 19)
      System.out.println("미성년입니다.");

    // else 문을 사용하는 모범적인 예
    if (age >= 19)
      System.out.println("성인입니다.");
    else
      System.out.println("미성년입니다.");

    // 여러 문장을 실행할 때는 블록으로 묶어야 한다.
    if (age >= 20) {
      System.out.println("--------------------");
      System.out.println("성인입니다.");
    }
    else {
      System.out.println("--------------------");
      System.out.println("미성년입니다.");
    }

    // if, else 둘 중 하나만 블록으로 묶을 수 있다.
    if (age >= 19) {
      System.out.println("성인입니다.");
      System.out.println("--------------------");
    }
    else
      System.out.println("미성년입니다.");

    // if, else 둘 중 하나만 블록으로 묶을 수 있다.
    if (age >= 19)
      System.out.println("성인입니다.");
    else {
      System.out.println("미성년입니다.");
      System.out.println("--------------------");
    }


  }

}
