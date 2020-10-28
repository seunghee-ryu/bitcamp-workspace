package com.eomcs.basic.ex05;

public class Exam0160t {
  public static void main(String[] args) {
    float r1 = 5 / 2 + 3.1f;
    
    // r1 = int 5 / int 2 +float 3.1
    // r1 = int 2 + float 3.1
    // r1 = float 2.0 + float 3.1
    // r1 = float 5.1
    
    System.out.println(r1);
    
    float r2 = 3.1f + 5 / 2;
    
    // r2 = float 3.1 + int 5 / int 2
    // r2 = float 3.1 + int 2
    // r2 = float 3.1 + float 2.0
    // r2 = float 5.1
    
    
    
    
  }

}
