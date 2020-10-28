package com.eomcs.basic.ex05;

//# 증감 연산자 : 전위(pre-fix) 감소 연산자
//
public class Exam0660t {
  public static void main(String[] args) {
    int i = 7;
    
    --i; //6
    --i; //5
    System.out.println(i); //5
    System.out.println(--i); //4
    System.out.println(i); //4

  }
}
