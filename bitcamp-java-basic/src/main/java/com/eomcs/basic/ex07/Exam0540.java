package com.eomcs.basic.ex07;

public class Exam0540 {
  public static void main(String[] args) {
    // 학생의 이름과 국영수 점수를 입력받아 총점과 평균을 출력하라
    // 이름 홍길동
    // 총점 290
    // 평균 96.9


    if (args.length < 4) {
      System.out.
      println("실행 형식: java -cp ./bin/main com.eomcs.basic.ex07.Exam0540 이름 국어점수 영어점수 수학점수");
    return;
    }

    int sum = 0;
    for (int i = 1; i < args.length; i++)
      sum += Integer.parseInt(args[i]);

    System.out.printf("이름: %s\n", args[0]);
    System.out.printf("총점: %d\n", sum);
    System.out.printf("평균: %.1f\n", sum / 3f);

  }

}
