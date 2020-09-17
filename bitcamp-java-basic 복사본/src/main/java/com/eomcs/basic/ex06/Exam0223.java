package com.eomcs.basic.ex06;

public class Exam0223 {
  public static void main(String[] args) {
    int score = 60;

    switch (score) {
      case 100:
      case 90:
        System.out.println("A");
        break;
      case 80:
      case 70:
        System.out.println("B");
        break;
      case 60:
      case 50:
      case 40:
        System.out.println("C");
        break;
      default:
        System.out.println("F");
    }
  }

}
