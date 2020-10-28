package com.eomcs.basic.ex06;

public class Exam0150 {
  public static void main(String[] args) {
    int age = 15;

    if (age >= 19)
      if (age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
      else
        System.out.println("미성년입니다.");

    System.out.println("--------------------");

    // if 문은 else 문 없이도 단독으로 사용 가능하다.
    // 하지만 else 문은 if 문 없이 단독으로 사용하는 것이 불가능하다.

    if (age >= 19) {
      if (age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
      else
        System.out.println("미성년입니다.");
    }

    System.out.println("--------------------");

    // else 문을 if 문에 소속되게 하고 싶으면
    // 중괄호를 써서 블록으로 묶어라.

    if (age >= 19) {
      if (age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
    }
    else // 두번째 if 는 첫번째 if에 블록으로 묶여있기 때문에 이 else 와 상관없다
      System.out.println("미성년입니다.");

  }

}
