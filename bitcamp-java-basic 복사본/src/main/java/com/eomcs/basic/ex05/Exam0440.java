package com.eomcs.basic.ex05;

//# 비트 이동 연산자 : 응용 I
//
public class Exam0440 {
  public static void main(String[] args) {

    // i 변수에 들어있는 값을 순서대로 1바이트씩 잘라서 
    // a,b,c,d 변수에 넣은 다음 각 변수의 값을 16진수로 출력하라!
    int i = 0x27a130ff;
    int a, b, c, d;
    System.out.println(i);
    
    System.out.println(Integer.toHexString(i));
    
    // Integer.toHexString 16진수로 표현하고 싶을 때 쓴다.
    // long.toHexString long값을 16진수로 표현하고 싶을 때 쓴다.


    // 00100111_10100001_00110000_11111111 => 27a130ff 
    
    a = i >> 24; 
    // 00000000_00000000_00000000_00100111 = 27
    
    b = (i >> 16) & 0xff; 
    //   00000000_00000000_00100111_10100001 => 0x000027a1
    // & 00000000_00000000_00000000_11111111 => 0x000000ff
    // --------------------------------------
    //   00000000_00000000_00000000_10100001
    // 맨 끝자리만 추출하고 싶기 때문에 &를 써서 필터로 사용한다.

    c = (i >> 8) & 0xff;
    //   00000000_00100111_10100001_00110000
    // & 00000000_00000000_00000000_11111111
    // --------------------------------------
    //   00000000_00000000_00000000_00110000

    d = i & 0xff;
    //   00100111_10100001_00110000_11111111
    // & 00000000_00000000_00000000_11111111
    // --------------------------------------
    //   00000000_00000000_00000000_11111111

    System.out.println(Integer.toHexString(a));
    System.out.println(Integer.toHexString(b));
    System.out.println(Integer.toHexString(c));
    System.out.println(Integer.toHexString(d));


  }
}
