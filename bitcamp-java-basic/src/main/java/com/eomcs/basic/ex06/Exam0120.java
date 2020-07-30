package com.eomcs.basic.ex06;

public class Exam0120 {
  public static void main(String[] args) {
    int age = 17;
    if (age >= 19) System.out.println("성인이다.");
    if (age >= 19);
    System.out.println("성인이다.");
    // if 뒤에 문자의 끝을 표시하는 세미콜론을 사용하지 않도록 조심

    if (age
        >=
        19) System
    .
    out
    .
    println(
        "성인이다.")
    ;

    // 이런 식으로 나눠서 적지 말아라

    if (age >= 19)
      System.out.println("성인이다."); // 이 문장만 if에 종속된다.
    System.out.println("군대 가야한다.");
    System.out.println("일해야 한다.");
    System.out.println("세금 납부해야 한다.");

    //여러 문장을 if 문에 종속시키고 싶으면 블록을 사용하라
    if (age >= 19) {
      System.out.println("성인이다.");
      System.out.println("군대 가야한다.");
      System.out.println("일해야 한다.");
      System.out.println("세금 납부해야 한다.");
    }



  }

}
