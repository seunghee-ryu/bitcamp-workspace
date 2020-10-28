// 제네릭(Generic) 문법 정리 - 제네릭 파라미터
package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0223 {

  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}

  public static void main(String[] args) {
//    m1(Arraylist<A>)
    m1(new ArrayList());
//    m1(new ArrayList<Object>());
//    m1(new ArrayList<A>());
    m1(new ArrayList<B1>());
//    m1(new ArrayList<B2>());
//    m1(new ArrayList<C>());

  }

  static void m1(ArrayList<B1> list) {
//    list.add(new Object());
//    list.add(new A());
    list.add(new B1());
//    list.add(new B2());
    list.add(new C());

  }

//  static class A {}
//  static class B1 extends A {}
//  static class B2 extends A {}
//  static class C extends B1 {}
//  /*
//   *   Object
//   *     |
//   *     A
//   *    / \
//   *   B1 B2
//   *   |
//   *   C
//   */
//
//  public static void main(String[] args) {
//    // m1(ArrayList<A>)
//    // => A 타입에 대해서만 ArrayList 객체를 파라미터로 넘길 수 있다.
//    // => A의 하위 타입은 불가능
//    //
//    m1(new ArrayList()); // 컴파일 오류는 아니지만, 타입을 지정하지 않는 것은 바람직하지 않다.
//    // 왜?
//    // => 타입을 지정하지 않으면 ArrayList에 A가 아닌 다른 타입의 객체가 들어갈 수 있다.
//    // => 그러면 실행 중에 get()을 호출할 때 형변환 문제가 발생할 것이다.
//    //
//    //m1(new ArrayList<Object>()); // 컴파일 오류!
////    m1(new ArrayList<A>());
//    //m1(new ArrayList<B1>()); // 컴파일 오류!
////    m1(new ArrayList<B2>()); // 컴파일 오류!
//    //m1(new ArrayList<C>()); // 컴파일 오류!
//  }
//
//  static void m1(ArrayList<A> list) {
//
//    // 컴파일러는 파라미터로 넘어온 어레이리스트가 어떤 타입이든간에
//    // 문법적으로 A 타입의 값만 다룬다.
////    list.add(new Object()); // 컴파일 오류!
//    list.add(new A());
//    list.add(new B1());
//    list.add(new B2());
//    list.add(new C());
//  }
}








