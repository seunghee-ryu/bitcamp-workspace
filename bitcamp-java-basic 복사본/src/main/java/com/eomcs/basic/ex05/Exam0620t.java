package com.eomcs.basic.ex05;

//# 증감 연산자 : 후위(post-fix) 감소 연산자
//
public class Exam0620t {
  public static void main(String[] args) {
    int i = 7;
    
    i = i - 1; //6
    
    i--; //5
    
    System.out.println(i); //5
    System.out.println(i--); //5
    System.out.println(i); //4

  }
}
