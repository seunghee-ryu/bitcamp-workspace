package com.eomcs.basic.ex04;

public class Exam0411 {
  public static void main(String[] args) {
    byte b;
    
    b = -128;
    b = 127;
    //b = -129;
    //b = 128
    
    short s;
    
    s = -32768;
    s = 32767;
    //s = -32769;
    //s = 32768
    
    int i;
    
    i = -2147483648;
    i = 2147483647;
    //i = -2147483649;
    //i = 2147483648;
    //해결책?
    //i = -2147483649L;
    //i = 2147483648l; <컴파일 오류
    
    //8바이트 크기의 정수값
    long l;
    
    l = -9223372036854775808L;
    l = 9223372036854775807L;
  }

}
