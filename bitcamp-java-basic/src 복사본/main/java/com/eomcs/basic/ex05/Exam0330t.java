package com.eomcs.basic.ex05;

public class Exam0330t {
  public static void main(String[] args) {
    
    boolean a = false;
    boolean b = false;
    boolean r = a && (b = true);
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    // f, f, f
    
    a = false;
    b = false;
    r = a & (b = true);
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    // f, t, f
    
  }

}
