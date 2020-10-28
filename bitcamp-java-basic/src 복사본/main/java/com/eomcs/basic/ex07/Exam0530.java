package com.eomcs.basic.ex07;

public class Exam0530 {

  public static void main(String[] args) {

  int sum = 0;
  for (String arg : args)
    sum += Integer.parseInt(arg);
  System.out.printf("합계: %d\n", sum);

  }

}

// 프로그램 아규먼트
// 프로그램을 실행할 때 넘겨주는 값
// 어떻게 아규먼트를 넘기는가?

// java 클래스명 값1 값2 값3

// 아규먼트는 공백으로 구분한다.
// JVM은 아규먼트의 갯수만큼 문자열 배열을 만들어 저장한다.
// 아규먼트가 없으면 빈 배열을 만든다.
// 그런 후 main()을 호출할 때 그 배열의 주소를 넘겨준다.

