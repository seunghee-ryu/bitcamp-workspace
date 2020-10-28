package com.eomcs.basic.ex05;

//# 비트 연산자 & 활용: 특정 값을 차단하고 특정 값만 통과시킬 때
// 특정 비트의 값만 추출하고 싶을때 사용할 수 있다.
//
public class Exam0353 {
  public static void main(String[] args) {
    int data = 0b1111_1001_0111_1111;
    System.out.println(Integer.toBinaryString(data & 0b0000_1111_1100_0000));
    //   1111_1001_0111_1111
    // & 0000_1111_1100_0000
    //-----------------------
    //   0000_1001_0100_0000
    
    // Integer.toBinaryString < 2진수로 출력하기 위해 쓰는 것
    // 단 앞에 있는 0은 안 출력한다.
    
    
  }
}

