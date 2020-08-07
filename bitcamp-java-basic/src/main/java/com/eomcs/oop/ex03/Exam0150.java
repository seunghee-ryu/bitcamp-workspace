package com.eomcs.oop.ex03;

public class Exam0150 {
  static class Car {

    // 클래스 필드
    // 모든 인스턴스가 공유하는 값을 저장하는 용도이다.
    static int count;


    static final int SEDAN = 1;
    static final int TRUCK = 2;


    // 인스턴스 필드는
    // 개별적으로 관리되어야 할 값을 저장하는 용도이다.
    String model;
    String no;
    int cc;
    int type;
  }

  public static void main(String[] args) {

    // 클래스 필드는 인스턴스를 생성할 필요 없이
    // 클래스 이름을 바로 사용한다.
    Car.count = 0;

    // 인스턴스 필드는 new 명령을 수행해야지 생성된다.
    Car c1 = new Car();
    Car c2 = new Car();

    c1.model = "티코"; // 인스턴스 필드는 인스턴스의 주소(c1)이 있어야 접근할 수 있다.
    c1.no = "40-1111";
    c1.cc = 980;
    c1.type = Car.SEDAN; // 승용차
    Car.count++;

    c2.model = "타이탄";
    c2.no = "50-2222";
    c2.cc = 1980;
    c2.type = Car.TRUCK; // 트럭
    Car.count++;

    System.out.printf("%s, %s, %d\n", c1.model, c1.no, c1.cc);
    System.out.printf("%s, %s, %d\n", c2.model, c2.no, c2.cc);
    System.out.println(Car.count);

    // 클래스 필드에 접근할 때, 레퍼런스 주소를 통해 접근하는 방법도 있으나
    // 이 방법은 사용하지 않는 것이 좋다.
    // 다른 개발자가 봤을 때 레퍼런스 변수라고 오해할 가능성이 있기 때문이다.


  }

}
