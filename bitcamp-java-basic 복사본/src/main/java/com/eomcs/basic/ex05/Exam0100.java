package com.eomcs.basic.ex05;

public class Exam0100 {
  public static void main(String[] args) {
    System.out.println(100 + 27);
    System.out.println(100 - 27);
    System.out.println(100 * 27);
    System.out.println(100 / 27);
    System.out.println(100 % 27);
    
    //산술 연산자 우선순위
    
    System.out.println(2 + 3 * 7);
    System.out.println(2 * 7 + 3);
    
    System.out.println((2 + 3) * 7);
    
    //산술 연산자 기본 연산 단위
    
    byte b;
    b = 5;
    b = 6;
    
    b = 5 + 6;
    
    System.out.println(b);
    
    byte x = 5, y = 6, z;
    z = x;
    z = y;
    // z = x + y;
    
    short s1 = 5;
    short s2 = 6;
    short s3;
    s3 = s1;
    s3 = s2;
    // s3 = s1 + s2;
    
    
    int s4 = s1 + s2;
    System.out.println(s4);
    
    
    
    
    
    
    
    
    
    
  }

}
