package com.eomcs.basic.ex05;

//# 증감 연산자 : 후위(post-fix) 증가 연산자
//
public class Exam0610t {
  public static void main(String[] args) {
    int i = 2;
    
    i++; //3
    i++; //4
    
    System.out.println(i); //4
    System.out.println(i++); //4
    System.out.println(i); //5

  }
}
