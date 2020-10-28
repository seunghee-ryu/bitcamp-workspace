package com.eomcs.basic.ex06;

public class Exam0310 {
  public static void main(String[] args) {
    int count = 0;
    //조건이 참인동안 문장을 계속 실행한다.
    while (count < 5) System.out.println(count++);

    System.out.println("--------------------");

    count = 0;
    while (count < 5)
      System.out.println(count++);

    System.out.println("--------------------");

    //여러개의 문장을 반복 실행하려면 블록으로 묶어
    count = 0;
    while (count < 5) {
      System.out.println(count);
      count++;
    }

  }

}
