package com.eomcs.basic.ex05;

public class Exam0142t {
  public static void main(String[] args) {
    
    int x = Integer.MAX_VALUE;
    int y = Integer.MAX_VALUE;
    
    int r1 = x + y;
    
    System.out.println(r1);
    
    long r2 = x + y;
    System.out.println(r2);
    
    r2 = (long)x + (long)y;
    System.out.println(r2);
    
    
  }

}
