package com.eomcs.basic.ex05;

//# 증감 연산자 : 전위(pre-fix) 증가 연산자
//
public class Exam0650t {
  public static void main(String[] args) {
    int i = 2;
    
    ++i; //3
    ++i; //4
    
    System.out.println(i); //4
    System.out.println(++i); //5
    System.out.println(i); //5

  }
}
