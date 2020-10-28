// Exam0350.java
// 주제 : 부동소수점의 정규화 = 2진수 표현
package com.eomcs.basic.ex03;

//# 부동소수점의 리터럴 - 2진수로 변경된 것을 확인하기
//- 자바가 부동소수점을 다룰 때 IEEE 754 규칙에 따라 2진수로 변환하는 것을 확인해 보자.

public class Exam0360 {
    public static void main(String[] args) {
      System.out.println(2.127f); 
    }
} 

//2진수로 딱 떨어지지 않는 수에 관해선 소수점 아래를 적당히 잘라낸다.