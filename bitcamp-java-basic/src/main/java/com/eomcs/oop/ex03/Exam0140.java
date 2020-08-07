package com.eomcs.oop.ex03;

public class Exam0140 {
  static class A {
    static int v1; // 클래스 변수
    int v2; // 인스턴스 변수
  }

  public static void main(String[] args) {
    // 클래스 변수는 클래스가 로딩되는 시점에 method area에 생성된다.
    // 클래스가 로딩되는 때?
    // - 로딩되지 않은 클래스를 사용할 때
    // - 클래스 변수(스태틱 변수)를 사용하거나 클래스 메서드(스태틱 메서드)를 사용하려고 할 때
    //
    A.v1 = 100;


    // 인스턴스 변수는 new로 인스턴스를 생성할 때마다 heap에 생성된다.
    // A.v2 = 200 컴파일 오류

    A p = new A();

    p.v2 = 200;

    A p2 = new A();
    p2.v2 = 300;

    System.out.printf("A.v1=%d, p.v2=%d, p2.v2=%d\n", A.v1, p.v2, p2.v2);


  }

}
