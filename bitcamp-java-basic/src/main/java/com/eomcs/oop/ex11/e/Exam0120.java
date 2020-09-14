// anonymous class : 로컬 클래스 vs 익명 클래스
package com.eomcs.oop.ex11.e;

public class Exam0120 {
  // 인터페이스의 경우 static으로 선언하지 않아도 스태틱 멤버에서 사용할 수 있다.
  interface A {
    void print();
  }

  public static void main(final String[] args) {
    // 익명 클래스:
    // => 인스턴스를 한번만 생성할 것이라면,
    //    로컬 클래스로 정의하는 것보다 익명 클래스로 정의하는 것이 더 낫다.
    // 익명 클래스로 인터페이스 구현하기
    // 문법:
    // => 인터페이스명 레퍼런스 = new 인터페이스명() {}
    //
    A obj = new A() {
      @Override
      public void print() {
        System.out.println("Hello!");
      }
    };

    obj.print();
  }
}