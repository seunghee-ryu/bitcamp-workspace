package com.eomcs.basic.ex05;

public class Exam0320t {
  public static void main(String[] args) {
    System.out.println(true & true); // t
    System.out.println(true & false); // f
    System.out.println(false & true); // f
    System.out.println(false & false); // f
    
    System.out.println("----------");
    
    System.out.println(true | true); // t
    System.out.println(true | false); // t
    System.out.println(false | true); // t
    System.out.println(false | false); // f
    
  }

}
