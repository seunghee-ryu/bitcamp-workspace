package com.eomcs.oop.ex02;

public class Exam0230 {

  static class Calculator {
    //클래스 변수 사용
    //메서드들의 작업 결과를 보관할 때 사용할 변수
    //변수 선언에 static 을 붙인다.
    //스태틱 변수라고도 부른다.
    //클래스 변수는 new 명령으로 생성하지 않는다.
    //클래스가 메모리에 로딩될 때 자동으로 메서드 영역에 생성된다.

    static int result = 0;

    static void plus(int value) {
      //메서드 작업 결과는 클래스 변수에 보관한다.
      result += value; // result = result + value
    }

    static void minus(int value) {
      result -= value;
    }

    static void multiple(int value) {
      result *= value;
    }

    static void divide(int value) {
      result /= value;
    }

  }

  public static void main(String[] args) {
    //계산 결과를 보관할 변수는 필요없다.
    //Calculator 내부에서 계산 결과를 관리한다.

    Calculator.plus(2);
    Calculator.plus(3);
    Calculator.minus(1);
    Calculator.multiple(7);
    Calculator.divide(3);

    System.out.printf("result = %d\n", Calculator.result);


  }

}
