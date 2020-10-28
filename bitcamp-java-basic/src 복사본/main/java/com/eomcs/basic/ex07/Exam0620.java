package com.eomcs.basic.ex07;

public class Exam0620 {
  // 학생 이름과 국영수 점수를 입력받아 총점과 평균을 출력
  // 이름 홍길동
  // 국 100 영 100 수 90
  public static void main(String[] 변수명은상관없다) {



  String name = System.getProperty("name");
  String s1 = System.getProperty("kor");
  String s2 = System.getProperty("eng");
  String s3 = System.getProperty("math");

  if (name == null || s1 == null || s2 == null || s3 == null) {
    System.out.println(
        "실행 형식: java -cp ./bin/main -Dname=이름 -Dkor=국어점수 -Deng=영어점수 -Dmath=수학점수 com.eomcs.basic.ex07.Exam0620");
    return;
  }

  int kor = Integer.parseInt(s1);
  int eng = Integer.parseInt(s2);
  int math = Integer.parseInt(s3);

  int sum = kor + eng + math;

  System.out.printf("이름: %s\n", name);
  System.out.printf("총점: %d\n", sum);
  System.out.printf("평균: %.1f\n", sum / 3f);
  }
}
