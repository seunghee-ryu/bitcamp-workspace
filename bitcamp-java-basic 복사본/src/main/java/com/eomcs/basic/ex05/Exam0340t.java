package com.eomcs.basic.ex05;

public class Exam0340t {
  public static void main(String[] args) {
    boolean a = true;
    boolean b = false;
    boolean r = a || (b = true);
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    // t, f, t
    
    a = true;
    b = false;
    r = a | (b = true);
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    // t, t, t
    
    
    
  }
  

}

