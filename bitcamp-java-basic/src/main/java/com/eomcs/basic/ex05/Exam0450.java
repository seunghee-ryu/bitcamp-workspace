package com.eomcs.basic.ex05;

//# 비트 이동 연산자 : 응용 II
//
public class Exam0450 {
  public static void main(String[] args) {
    // Yes/No 또는 true/false 값을 저장할 때 
    // 비트 연산자를 사용하면 메모리를 절약할 수 있다.
    
    // 특정 비트의 값을 설정할 때
    // 0x01, 0x02, 0x04, 0x08 처럼 직접 숫자를 사용하면
    // 코드를 읽고 이해하기가 쉽지 않다.
    // 해결책?
    // 각각의 값을 의미있는 이름을 가진
    // 변수에 저장한 후 사용하라
    // 또한 조회용으로 사용할 변수이므로 상수로 선언하
    
    int lang2 = 0;
    
    // 32비트에서 뒤에 8비트를 사용하여 8개의 true/false 값을 저장할 수 있다.
    // 8 비트에서 각 언어에 값을 저장할 비트를 다음과 같다고 가정하자.
    // 00000000
    // ||||||||- css
    // |||||||- html
    // ||||||- php
    // |||||- python
    // ||||- javascript
    // |||- java
    // ||- c++
    // |- c
    
    // 이렇게 준비된 32비트 메모리에서 특정 비트의 값을 1로 설정하고 싶다면 
    // 다음과 같이 특정 비트의 값이 1인 수를 OR(|) 연산하라!
    lang2 |= 0x80; // c = true 
    // 00000000 | 10000000 = 10000000

    //lang2 |= 0x00; // c++ = false

    lang2 |= 0x20; // java = true
    // 10000000 | 00100000 = 10100000

    //lang2 |= 0x00; // js = false

    lang2 |= 0x08; // python = true
    // 10100000 | 00001000 = 10101000

    //lang2 |= 0x00; // php = false

    lang2 |= 0x02; // html = true
    // 10101000 | 00000010 = 10101010

    //lang2 |= 0x00; // css = false
    
    System.out.println(Integer.toBinaryString(lang2));

    // 실무에서는 이렇게 비트를 이용하여 여러 개의 true/false 상태를 저장하기도 한다.

  }
}
