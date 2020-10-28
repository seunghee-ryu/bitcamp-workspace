package com.eomcs.basic.ex04;

public class Exam0451 {
  public static void main(String[] args) {
    java.util.Date d1 = new java.util.Date();
    java.util.Date d2 = d1;
    
    System.out.printf("%d, %d\n", d1.getDate(), d2.getDate());
    
    d1.setDate(22);
    
    System.out.printf("%d, %d\n", d1.getDate(), d2.getDate());
    
  }

}


// %d는 서식지정자
// %d는 부호가 있는 10진 정수
// \n은 줄바
// http://tcpschool.com/c/c_intro_printf
// https://keep-cool.tistory.com/15