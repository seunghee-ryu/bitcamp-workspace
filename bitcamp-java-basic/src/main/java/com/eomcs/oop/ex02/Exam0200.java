package com.eomcs.oop.ex02;

import com.eomcs.util.Calculator;

public class Exam0200 {

  public static void main(String[] args) {
    // 연산자 우선순위 없다는 가정
    // 식1) 2 + 3 - 1 * 7 / 3 = 9
    // 식2) 3 * 2 + 7 / 4 -5 = ?

    // 식1과 식2를 동시에 계산할 수 있는가?
    // => 불가능하다.
    // => calculator 는 result 변수를 한개만 관리하기 때문에
    //    동시에 여러 개의 식 결과를 따로 관리할 수 없다.
    // 식1과 식2를 동시에 계산하려면 result 변수를 2개 준비해야 한다.
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();



//    Calculator.plus(2);         // 식1
//    Calculator.plus(3);         // 식2
//    Calculator.plus(3);         // 식1
//    Calculator.multiple(2);     // 식2
//    Calculator.minus(1);        // 식1
//    Calculator.plus(7);         // 식2
//    Calculator.multiple(7);     // 식1
//    Calculator.divide(4);       // 식2
//    Calculator.divide(3);       // 식1
//    Calculator.minus(5);        // 식2 <- 이렇게 동시 진행 불가능

    c1.plus(2);         // 식1
    c2.plus(3);         // 식2
    c1.plus(3);         // 식1
    c2.multiple(2);     // 식2
    c1.minus(1);        // 식1
    c2.plus(7);         // 식2
    c1.multiple(7);     // 식1
    c2.divide(4);       // 식2
    c1.divide(3);       // 식1
    c2.minus(5);        // 식2 <- 이렇게 나눠서 계산해야 한다.


    // Calculator.result = 0;      // 결과를 0로 초기화 해야 한다. // that 이후에는 필요없다.
    printResult(c1.result);
    printResult(c2.result);

    // 인스턴스가 있어야 하는 메소드.


  }


  static void printResult(int value) {
    System.out.println("***********************");
    System.out.printf("==> 결과 = %d\n", value);
    System.out.println("***********************");
  }

}
