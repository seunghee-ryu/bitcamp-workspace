package com.eomcs.basic.ex05;

//# 증감 연산자 : 전위(pre-fix) 증감 연산자 응용 II
//
public class Exam0680t {
  public static void main(String[] args) {
    int i = 2;
    int result = ++i + ++i * ++i;
    System.out.println(result); //23
  }
}






