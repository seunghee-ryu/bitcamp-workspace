package com.eomcs.oop.ex03;

 class SmartPhone {

  int volume;
  int bright;
  int contrast;

  // 파라미터가 다른 생성자를 여러개 정의할 수 있다.
  private public SmartPhone() {
    //this(50, 50, 50); // <== 다른 생성자를 호출한다.
    System.out.println("SmartPhone() 생성자 호출됨");
    //this(50, 50, 50); // 다른 생성자를 호출할 때는 반드시 첫문장이어야 한다.

  }

  public SmartPhone(int volume) {
    System.out.println("SmartPhone(int) 생성자 호출됨");
    this.volume = volume;
    this.bright = 50;
    this.contrast = 50;
  }

  void m1() {
    //일반 메서드에서 생성자를 임의로 호출할 수 없다.
    //this();
  }

}

public class Exam0424 {

  public static void main(String[] args) {
    // private 로 접근을 제한한 경우 다른 클래스가 생성자를 지정할 수 없다.
    // SmartPhone obj1 = new SmartPhone();
    SmartPhone obj2 = new SmartPhone(100);



  }

}
