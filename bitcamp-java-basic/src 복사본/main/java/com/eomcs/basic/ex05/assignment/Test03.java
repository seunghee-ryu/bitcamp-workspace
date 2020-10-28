package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제3 : 
//다음 int 변수에 들어있는 값을 
//다음과 같이 첫 바이트부터 끝 바이트까지 16진수로 순서대로 출력하라
//실행 예)
//입력? 0xaabbccdd
//aa
//bb
//cc
//dd
public class Test03 {

  public static void main(String[] args) {
    int value = 0xaabbccdd; // 10101010 10111011 11001100 11011101
    
    //코드를 완성하시오!
    
    int a, b, c, d;
    
    a = (value >> 24) & 0xff;
    b = (value >> 16) & 0xff;
    c = (value >> 8) & 0xff;
    d = value & 0xff;
    
    System.out.println(Integer.toHexString(a));
    System.out.println(Integer.toHexString(b));
    System.out.println(Integer.toHexString(c));
    System.out.println(Integer.toHexString(d));
    
    System.out.println("---- 답안 ----");
    
    System.out.println(Integer.toHexString(value >> 24 & 0xff));
    System.out.println(Integer.toHexString(value >> 16 & 0xff));
    System.out.println(Integer.toHexString(value >> 8 & 0xff));
    System.out.println(Integer.toHexString(value & 0xff));
    
    
    
    
    
  }

}








