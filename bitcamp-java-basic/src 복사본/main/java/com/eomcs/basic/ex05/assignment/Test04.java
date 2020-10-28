package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제4: 
//다음 int 변수에 들어있는 값을 
//각 자릿수의 10진수 값을 역순으로 출력하라.
//실행 예)
//입력? 23459876
//6
//7
//8
//9
//5
//4
//3
//2
public class Test04 {

  public static void main(String[] args) {
    
    
    
    System.out.println("---- 답안 1 ----");
    
    int value = 23459876;
    
    System.out.println(value % 10); // 6
    value = value / 10; // 2345987
    
    System.out.println(value % 10); // 7
    value = value / 10; // 234598
    
    System.out.println(value % 10); // 8
    value = value / 10; // 23459
    
    System.out.println(value % 10); // 9
    value = value / 10; // 2345
    
    System.out.println(value % 10); // 5
    value = value / 10; // 234
    
    System.out.println(value % 10); // 4
    value = value / 10; // 23
    
    System.out.println(value % 10); // 3
    value = value / 10; //2 
    
    System.out.println(value % 10); //2
    
    
    
  }

}








