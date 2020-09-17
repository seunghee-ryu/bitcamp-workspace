package com.eomcs.basic.ex05;

//# 관계 연산자(relational operators: <, <=, >, >=), 등위 연산자(equality operators: ==, !=)
//
public class Exam0210 {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    
    // 비교의 결과는 true 또는 false이다.
    // 즉 boolean 값이다.
    boolean r1 = a < b; // true
    
    //int r2 = a < b; // 컴파일 오류!
    //관계 연산자와 등위 연산자는 결과가 boolean이어야 한다.
    //결과값은 true, false이다.
    

    System.out.println(a < b); // true
    System.out.println(a <= b); // true
    System.out.println(a > b); // false
    System.out.println(a >= b); // false
    System.out.println(a == b); // false
    System.out.println(a != b); // true

  }
}
