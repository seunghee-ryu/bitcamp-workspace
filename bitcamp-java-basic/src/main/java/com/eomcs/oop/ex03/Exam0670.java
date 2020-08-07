package com.eomcs.oop.ex03;

public class Exam0670 {
  public static class A {
    static int a = 100;

    // 변수 초기화 문장을 컴파일 할때
    // 스태틱 초기화 블록이 없으면 컴파일러가 자동으로 삽입한다.
    // 스태틱 초기화 블록에 a에 100을 할당하는 문장을 삽입한다.
    // 위의 문장은 다음 문장으로 바뀐다.

    // static int a;
    // static {
    // a = 100;
    // }

  }

  public static void main(String[] args) throws Exception {
    System.out.println(A.a);
  }

}
