package com.eomcs.oop.ex03;

import java.util.Scanner;

public class Exam0320 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    public void compute() {
      // 인스턴스 메서드, 내장변수 this

      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("성적 데이터를 입력하세요(예: 홍길동 100 100 100)> ");
    Score s1 = new Score();
    s1.name = sc.next();
    s1.kor = sc.nextInt();
    s1.eng = sc.nextInt();
    s1.math = sc.nextInt();

    System.out.print("성적 데이터를 입력하세요(예: 홍길동 100 100 100)> ");
    Score s2 = new Score();
    s2.name = sc.next();
    s2.kor = sc.nextInt();
    s2.eng = sc.nextInt();
    s2.math = sc.nextInt();

    s1.compute();
    s2.compute();

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.aver);

  }



}
