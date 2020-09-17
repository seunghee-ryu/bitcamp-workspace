package com.eomcs.basic.ex07;

public class Exam0230 {

  static String hello() {
    return "안녕하세요!";
  }
  //리턴 타입은 한개만
  //여러개를 리턴하고 싶다면 배열이나 객체

  public static void main(String[] args) {

    //hello 메서드를 실행하고 그 리턴 값을 변수에 담는다.
    //리턴 값을 받을 변수를 준비한다.
    //변수에 리턴 값을 받는다.
    //리턴 값과 변수의 타입이 같아야 한다.

    String r = hello();
    System.out.println(r);

    //메서드가 값을 리턴한다고 해서 반드시 그 값을 변수에 받아야 하는 것은 아니다.
    //변수에 받을지 여부는 호출하는 쪽의 마음이다.

    hello(); //값을 받는 변수가 없으면 리턴 값은 버려진다.

    //리턴 타입과 다른 타입의 변수로 값을 받으려 하면 컴파일 오류


  }

}
