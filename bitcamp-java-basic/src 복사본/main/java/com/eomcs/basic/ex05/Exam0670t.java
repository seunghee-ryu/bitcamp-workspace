package com.eomcs.basic.ex05;

//# 증감 연산자 : 전위(pre-fix) 증감 연산자 응용 I
//
public class Exam0670t {
  public static void main(String[] args) {
    int a = 5;
    int r = ++a;
    System.out.printf("%d, %d\n", a, r); // 6, 6
  }
}
