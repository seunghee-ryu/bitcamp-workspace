package com.eomcs.oop.ex03;

import java.util.Scanner;

public class Exam0310 {

  static class Math{
    //인스턴스 변수를 사용하지 않고
    //파라미터 값을 가지고 작업하는 경우에 보통 클래스 메서드로 정의한다.

    public static int abs(int value) {
      if (value < 0)
        return value * -1;
      return value;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("숫자를 입력하세요> ");
    int value = sc.nextInt();
    sc.nextLine();

    int result = Math.abs(value);

    System.out.printf("절대값 = %d\n", result);

  }

}
