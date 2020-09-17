package com.eomcs.basic.ex06;

public class Exam0130 {
  public static void main(String[] args) {
    // if 문의 조건은 반드시 boolean 데이터여야 한다.
    if (true) System.out.println("1111");
    if (false) System.out.println("2222");
    if (10 < 8 + 5) System.out.println("3333");

    // 그 외의 모든 데이터 타입은 컴파일 오류이다.

    int a = 100;
    if (a == 100) System.out.println("5555");

    // a 변수에 100을 넣는다는 a = 100을 if에 넣으면 오

    boolean b;
    if (b = true) System.out.println("된다!");

  }

}
