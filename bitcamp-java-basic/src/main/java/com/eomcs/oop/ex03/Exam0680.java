package com.eomcs.oop.ex03;

public class Exam0680 {
  public static class A {
    static int a = 100;
    static {
      a = 200;
      System.out.println("static {} 실행");
    }

    static {
      b = 400;
    }

    static int b = 300;


    // 변수 초기화 문장을 컴파일 할 때
    // 모든 스태틱 필드를 먼저 만든다.
    // 스태틱 변수 초기화 문장(static int a = 100;, static int b = 300;)과
    // 스태틱 블록(static {a = 200; sysout~ }, static { b = 400; } )을
    // 구분하지 않고 선언한 순서대로
    // 하나의 스태틱 블록에 합친다.
    // 위의 문장은 다음 문장으로 바뀐다.

    // == 스태틱 변수 초기화 문장을 스태틱 블록으로 변경한 다음에
    // 모든 스태틱 블록을 순서대로 한 스태틱 블록에 합친다.
    // 즉 스태틱 변수 초기화 문장과 스태틱 블록을
    // 구분하지 않고 선언한 순서대로 하나로 합친다.



    // static int a;
    // static {
    // a = 100;
    // a = 200;
    // System.out.println("static {} 실행");
    // b = 400;
    // b = 300;
    // }

  }

  public static void main(String[] args) throws Exception {
    System.out.println(A.a);
  }

}
