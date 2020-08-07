package com.eomcs.oop.ex03;

public class Exam0440 {
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    Score() {
      this("이름없음"); // Score(String) 생성자 호출
      System.out.println("Score()");
    }

    Score(String name) {
      this(name, 0, 0, 0); // Score(String, int, int, int)생성자 호출
      System.out.println("Score(String)");
      this.name = name;
    }

    Score(String name, int kor, int eng, int math) {
      System.out.println("Score(String, int, int, int) 호출");
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.compute();
    }

    public void compute() {
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
    }
  }

  public static void main(String[] args) {
    Score s1 = new Score();

    System.out.println("--------------------------------");

    Score s2 = new Score("유관순");

    System.out.println("--------------------------------");

    Score s3 = new Score("홍길동", 100, 90, 77);
    System.out.println("--------------------------------");

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.aver);

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s3.name, s3.kor, s3.eng, s3.math, s3.sum, s3.aver);


  }

}

