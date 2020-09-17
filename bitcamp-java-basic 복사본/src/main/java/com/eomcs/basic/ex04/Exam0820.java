package com.eomcs.basic.ex04;

public class Exam0820 {
  public static void main(String[] args) {
    
    int a = 100;
    
    {
      a = 200;
      
      int b = 300;
    }
    System.out.println(a);
    
    
    {
      int b = 400;
      
    }
  }

}
