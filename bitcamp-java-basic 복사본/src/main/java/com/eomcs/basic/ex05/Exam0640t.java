package com.eomcs.basic.ex05;

//# 증감 연산자 : 후위(post-fix) 증감 연산자 응용 II
//
public class Exam0640t {
  public static void main(String[] args) {
    int i = 2;
    int result = i++ + i++ * i++;
    
    System.out.printf("%d, %d\n", i, result); // 14

  }
}
