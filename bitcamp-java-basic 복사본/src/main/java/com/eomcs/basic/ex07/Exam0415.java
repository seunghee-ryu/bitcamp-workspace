package com.eomcs.basic.ex07;

public class Exam0415 {

  public static void main(String[] args) throws Exception {

    // n!

    int result = 1;
    int n = 5;

    System.out.println(result);

    for (int i = 2; i <= n; i++) {
      result *= i;
    }

    System.out.println(result);


    System.out.println("------------------");

    result = factorial(5);

    System.out.println(result);
    // result = 5 * factorial(4)
    //        = 5 * 4 * factorial(3)
    //        = 5 * 4 * 3 * factorial(2)
    //        = 5 * 4 * 3 * 2 * factorial(1)
    //        = 5 * 4 * 3 * 2 * 1

  }
    // 재귀호출
  static int factorial(int n) {

    if (n == 1) {
      return 1;
    }

    // if 문이 없으면 리턴값이 무한대로 실행되기 때문에
    // 스택오버플로우 에러가 난다.


    return n * factorial(n - 1);

  }

}

