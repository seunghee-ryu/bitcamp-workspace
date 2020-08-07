package com.eomcs.oop.ex03;

public class Exam0130 {
  static class A {

    // 클래스 변수 = 스태틱 변수
    // 클래스를 로딩하는 순간 자동 생성된다.
    // 클래스 이름으로 사룡한다고 해서 클래스에 소속된 변수, 클래스 변수라 부른다.
    // static이 붙은 변수이기 때문에 스태틱 변수라고도 부른다.
    // 클래스와 함께 method area 영역에 존재한다.
    // 문법/
    // static 베이터타입 변수명;


    static int v1;
    static boolean v2;
  }

  public static void main(String[] args) {

    // 클래스 변수 사용법
    // 클래스명.스태틱변수명 = 값;
    // 클래스를 사용하는 순간 클래스가 로딩되고 스태틱 변수는 자동 생성된다.
    A.v1 = 100;
    A.v2 = true;

    System.out.printf("%d, %b\n", A.v1, A.v2);

  }
}

// 클래스 변수는 클래스가 로딩될 때 딱 한 번 자동으로 생성되기 때문에
// 각각 구분되는 개별 데이터를 저장할 수 없다.
// 왜? 변수가 한개이다.

// 클래스 로딩
// 외부 저장장치에 있는 .class 파일을 JVM이 관리하는 메모리로 로딩하는 것
// 클래스의 코드를 사용하는 시점에 메모리(메소드 영역)에 로딩된다.

// 클래스 코드를 사용하는 시점?
// 스태틱 멤버(필드와 메서드)를 사용할 때
// ex) A.v1 = 200;
// ex) System.out.println(A.v1);
// ex) Integer.parseInt(..);
// new 명령을 사용하여 인스턴스를 생성할 때
// ex) new A();
// 한번 로딩되면 JVM을 종료할 때까지 유지한다.
// 물론 강제로 unloading 할 수 있다. 그리고 다시 로딩한다.

// 클래스를 로딩할거라고 착각하는 경우
// 다음과 같이 레퍼런스 변수를 선언할 때는 클래스를 로딩하지 않는다.
// 예) A obj;
// 예) String str;












/*
 *
 * public class Exam0130 { // static 변수 // 메소드 안에 클래스를 선언할때는 static을 붙일 수 없다. static class A { //
 * 설계도 static int v1; // static field = class variable static boolean v2; } public static void
 * main(String[] args) { // static 변수
 *
 * A obj1 = new A(); // ();는 생성자 호출 A obj2 = new A();
 *
 * // 레퍼런스.변수명 = 100; // - 레퍼런스 다음에 지정한 변수가 인스턴스 변수가 아니라 // 클래스 변수라면 컴파일러가 컴파일하는 과정에 정확하게 // 클래스 변수를
 * 가리키도록 기계어로 바꾼다. // 즉 개발자가 레퍼런스를 통해 클래스 변수를 지정하더라도 // 컴파일러가 클래스 변수로 인식하여 클래스 변수를 사용하는 코드로 변환한다.
 * obj1.v1 = 100; // => A.v1 = 100; obj2.v1 = 200; // => A.v1 = 200;
 *
 * A.v1 = 300;
 *
 * System.out.println(obj1.v1); System.out.println(obj2.v1); System.out.println(A.v1); }
 *
 * }
 *
 */
