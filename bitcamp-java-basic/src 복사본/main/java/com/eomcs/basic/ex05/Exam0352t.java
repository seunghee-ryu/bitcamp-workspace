package com.eomcs.basic.ex05;

public class Exam0352t {
  public static void main(String[] args) {
    System.out.println(57 % 2 == 0 ? "짝수" : "홀수");
    
    // & 연산자를 이용하여 짝수/홀수 알아내기
    System.out.println((57 & 0x1) == 0 ? "짝수" : "홀수");
    
  }

}
