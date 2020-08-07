package com.eomcs.oop.ex02;

public class Exam0115 {

  // Score를 다른 클래스에서도 사용할 수 있도록 만든다.

  static class Score {

    //변수를 만들라는 설계도
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    void compute() {
      //this.sum은 heap에 있는 변수를 가리킨다.
      //this는 로컬변수
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
    }

  }


  public static void main(String[] args) {

    Score s1;
    s1 = new Score();

    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 87;
    s1.compute();

    Score s2;
    s2 = new Score();

    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 100;
    s2.math = 100;
    s2.compute();


    printScore(s1);
    System.out.println("----------");
    printScore(s2);

    }


  static void printScore(Score s) {
    // 고정된 기능이 아니기 때문에 print는 score에 넣지 않는다.

    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);


  }
}