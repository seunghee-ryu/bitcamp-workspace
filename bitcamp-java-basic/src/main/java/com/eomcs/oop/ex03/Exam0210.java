package com.eomcs.oop.ex03;

public class Exam0210 {
  static class A{
    // 클래스 메서드
    // 스태틱 붙은 메서드이다.
    // 클래스 이름으로 호출할 수 있다.
    // 스태틱 메서드라고도 부른다.

    static void m1() {
      System.out.println("m1()");
    }

    // 인스턴스 메서드
    // 스태틱이 붙지 않은 메서드
    // 인스턴스 주소가 있어야만 호출할 수 있다.

    void m2() {
      System.out.println("m2()");
    }

    public static void main(String[] args) {
      A.m1();
      A obj1 = new A();

      obj1.m1();
      obj1.m2();

      A obj2 = null;
      obj2.m2();
      //실행오류, 인스턴스 주소가 무효하기 때문에.

    }







  }







}


  /*

  static class A {

    // Method Area 영역에 v1 이라는 변수 만들어
    static int v1; // 스태틱 필드 = 클래스 필드 = 스태틱 변수
    // new 명령에서 heap 영역에 v2 라는 변수 만들어
    int v2; // 인스턴스 변수 = 인스턴스 필드 = 논 스태틱 필드



    //static method = class method
    static void m1() {
      System.out.println("m1()");

      A.v1 = 100;
      v1 = 200; // 같은 스태틱 멤버이기 때문에 A. 생략가능

      // 스태틱 메서드는 this 라는 내장 변수가 없다.
      //this.v2 = 200;
      //v2 = 200;
      //m2();
      //this.m2();
      // 스태틱 메서드는 this라는 내장 변수가 없기 때문에
      // => this를 사용하여 접근하는 인스턴스 멤버(필드, 메서드)를 사용할 수 없다.

    }

    //non-static method = instance method
    void m2() {
      System.out.println("m2()");

      // 인스턴스 필드에 접근하려면
      // 메서드 내장 변수인 this 를 사용하라.
      // this는 메서드가 호출될 때 외부로부터 받은 인스턴스 주소를 갖고있다.
      this.v2 = 100;
      v2 = 300; //코드를 작성할 때 this를 생략할 수 있다. =>반반


      // 스태틱 필드는 인스턴스 레퍼런스를 통해 접근할 수 있다.
      // 그러나 비권장
      this.v1 = 100; // => A.v1 = 100;

      // 물론 다음과 같이 클래스 이름을 생략할 수 있다.
      // => 반반
      v1 = 200; // => this.v2 = 200; => A.v1 = 200;
      A.v1 = 100;


      m1();
      A.m1();
      // 인스턴스 메서드는 인스턴스 멤버(필드, 메서드) 뿐만 아니라
      // 클래스 멤버(필드, 메서드)도 사용할 수 있다.



    }



    static int abs(int value) {
      if (value < 0) {
        return value * -1;
      } else {
        return value;
      }
    }



  }

  public static void main(String[] args) {
    A.m1();
    //A.m2();

    // 인스턴스 메소드는 인스턴스가 있어야 호출 가능

    A obj1 = new A();
    obj1.m2();

    obj1.m1(); // => A.m1();


    System.out.println(A.abs(100));
    System.out.println(A.abs(-100));
    System.out.println(Math.abs(-100));


  }

}

*/
