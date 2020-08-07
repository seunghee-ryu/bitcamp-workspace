package com.eomcs.oop.ex02;

public class Exam0240 {

  static class Calculator {
    //클래스 변수는 클래스가 로딩될 때 한 번 생성된다.

    static int result = 0;

    static void plus(int value) {
      result += value;

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
    //클래스 변수는 오직 한 개만 존재하기 때문에
    //여러개의 작업을 동시에 진행할 수 없다.
    //한개의 식을 계산한 후에 다른 식을 계산해야 한다.
    //다른 식을 계산하기 전에 기존의 계산 결과를 갖고 있는
    //result 변수를 0으로 초기화 시켜야 한다.

    //식1
    Calculator.plus(2); // + 2
    Calculator.plus(3); // + 2 + 3
    Calculator.minus(1); // + 2 + 3 - 1
    Calculator.multiple(7); // + 2 + 3 - 1 * 7
    Calculator.divide(3); // + 2 + 3 - 1 * 7 / 3 = ?

    System.out.printf("result = %d\n", Calculator.result);

    //식2
    Calculator.result = 0;

    Calculator.plus(3); // + 3
    Calculator.multiple(2); // + 3 * 2
    Calculator.plus(7); // + 3 * 2 + 7
    Calculator.divide(4); // + 3 * 2 + 7 / 4
    Calculator.minus(5); // + 3 * 2 + 7 / 4 - 5 = ?

    System.out.printf("result = %d\n", Calculator.result);
  }

}
