package com.eomcs.basic.ex05;

//# 비트 이동 연산자 : >>, >>>, <<
//
public class Exam0430t {
  public static void main(String[] args) {
    int i = 0b01101001;
    System.out.println(i);
    
    System.out.println(i >>> 1);
    System.out.println(i >>> 2);
    System.out.println(i >>> 3);
    System.out.println(i >>> 4);
    
  }
}
