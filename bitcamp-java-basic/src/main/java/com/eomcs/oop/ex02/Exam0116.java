package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score;

public class Exam0116 { // score 클래스의 변수들을 쓸 수 있도록 한다.

  public static void main(String[] args) {

    // 입력을 한번에 받을 수 있게 한다.

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