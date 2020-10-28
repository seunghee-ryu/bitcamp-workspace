package com.eomcs.basic.ex07;

public class Exam0240 {

  static String hello(String name, int age) {
    String retVal = String.format("%d 살 %s 님을 환영합니다.", age, name);
    return retVal;
  }

  public static void main(String[] args) {
    //hello() 메서드를 실행하고 그 리턴 값을 변수에 담는다.
    String r = hello("홍길동", 20);
    System.out.println(r);

    //리턴 값을 안 받아도 된다.
    hello("임꺽정", 30);
  }

}
