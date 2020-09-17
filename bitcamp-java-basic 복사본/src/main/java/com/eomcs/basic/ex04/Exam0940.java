package com.eomcs.basic.ex04;

public class Exam0940 {
  public static void main(String[] args) {
    
    byte b = 100;
    short s = 100;
    int i = 100;
    long l = 100;
    
    byte b2 = (byte)s;
    System.out.println(b2);
    
    b2 = (byte)i;
    System.out.println(b2);
    
    int i2 = 0b0000_0000_0000_0000_0000_0001_0010_1100; // = 300(10진수)
    b2 = (byte) i2;
    System.out.println(b2);
    
    l = 400_0000_0000L;
    i = (int)l;
    System.out.println(l);
    System.out.println(0x502f9000);
    
  }

}
