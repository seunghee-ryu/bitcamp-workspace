package com.eomcs.basic.ex06;

public class Exam0420 {
  //for 반복문의 초기화 변수
  //for 문 안에 선언된 변수는 for 문을 나가는 순간 제거된다.

  for (int i = 1; i <= 5; i++)
    System.out.println(i);

  //문장이 끝난 후에 다시 i 값을 출력하려고 하면
  //컴파일 오류가 난다.

  System.out.println("--------------------");

  //반복문을 종료한 뒤라도 해당 변수의 값을 사용하고 싶으면
  //다음과 같이 반복문 밖에 변수를 선언해라
  int x;
  for (x = 1; x <= 5; x++)
    System.out.println(x);
  System.out.printf("x = %d\n", x);

}

}