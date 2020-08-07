package com.eomcs.oop.ex03;

public class Exam0680 {
  public static class A {
    static int a = 100;
    static {
      a = 200;
      System.out.println("static {} 실행");
    }

    // 변수 초기화 문장이 있을 때
    // 스태틱 초기화 블록이 있으면 스태틱 초기화 블록의 첫문장으로
    // a 에 100을 할당하는 문장을 삽입한다.
    // 위의 문장은 다음 문장으로 바뀐다.


    // static int a;
    // static {
    // a = 100;
    // a = 200;
    // System.out.println("static {} 실행");
    // }

  }

  public static void main(String[] args) throws Exception {
    System.out.println(A.a);
  }

}
