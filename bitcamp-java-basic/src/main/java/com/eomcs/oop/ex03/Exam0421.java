package com.eomcs.oop.ex03;

public class Exam0421 {
  static class SmartPhone {

    int volume;
    int bright;
    int contrast;

    // 생성자가 한개라도 있으면 기본 생성자가 자동으로 생성되지 않는다.
    public SmartPhone(int a) {
      System.out.println("SmartPhone(int) 생성자 호출됨");
    }

  }

  public static void main(String[] args) {

    //SmartPhone obj1 = new SmartPhone();
    SmartPhone obj1 = new SmartPhone(100);
    //SmartPhone obj2 = new SmartPhone(3.14);

  }

}
