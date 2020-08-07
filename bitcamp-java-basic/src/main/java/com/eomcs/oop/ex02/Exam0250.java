package com.eomcs.oop.ex02;

public class Exam0250 {

  static class Calculator {
    // 인스턴스 변수
    // 작업 결과를 개별적응로 관리하고 싶을 때 인스턴스 변수로 선언한다.
    // 인스턴스 변수는 클래스가 로딩될 때 만들어지지 않는다.
    // new 명령을 사용해서 만들어야 한다.
    // 변수 선언 앞에 static이 붙지 않는다.

    int result = 0;


    // 인스턴스 변수를 다루는 메서드는 작업을 수행할 때 그 인스턴스 주소를 받아야 한다.
    // result는 더 이상 클래스 변수가 아니기 때문에 직접 접근할 수 없다.
    // 오직 인스턴스 주소를 통해서 접근할 수 있다.
    static void plus(Calculator that, int value) {
      that.result += value;
    }

    static void minus(Calculator that, int value) {
      that.result -= value;
    }

    static void multiple(Calculator that, int value) {
      that.result *= value;
    }

    static void divide(Calculator that, int value) {
      that.result /= value;
    }

  }

  public static void main(String[] args) {

    Calculator c1 = new Calculator();
    // 식 1의 계산 결과를 보관할 메모리 준비
    Calculator c2 = new Calculator();
    // 식 2의 계산 결과를 보관할 메모리 준비


  // 계산을 수행할 때 계산 결과를 보관할 메모리를 전달한다.
  Calculator.plus(c1, 2); // + 2
  Calculator.plus(c2, 3); // + 3

  Calculator.plus(c1, 3); // + 2 + 3
  Calculator.multiple(c2, 2); // + 3 * 2

  Calculator.minus(c1, 1); // + 2 + 3 - 1
  Calculator.plus(c2, 7); // + 3 * 2 + 7

  Calculator.multiple(c1, 7); // + 2 + 3 - 1 * 7
  Calculator.divide(c2, 4); // + 3 * 2 + 7 / 4

  Calculator.divide(c1, 3); // + 2 + 3 - 1 * 7 / 3 = ?
  Calculator.minus(c2, 5); // + 3 * 2 + 7 / 4 - 5 = ?

  // 식1의 계산 결과는 c1 인스턴스의 result 변수에 들어 있고,
  // 식2의 계산 결과는 c2 인스턴스의 result 변수에 들어 있다.
  System.out.printf("c1.result = %d\n", c1.result);
  System.out.printf("c2.result = %d\n", c2.result);

  }

}
