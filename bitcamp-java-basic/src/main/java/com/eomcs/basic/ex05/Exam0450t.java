package com.eomcs.basic.ex05;

//# 비트 이동 연산자 : 응용 II
//
public class Exam0450t {
  public static void main(String[] args) {
    
    int lang2 = 0;
    
    lang2 |= 0x80;
    lang2 |= 0x20;
    lang2 |= 0x08;
    lang2 |= 0x02;
    
    System.out.println(Integer.toBinaryString(lang2));
    
    
  }
}
