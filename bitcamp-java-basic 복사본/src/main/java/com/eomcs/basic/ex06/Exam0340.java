package com.eomcs.basic.ex06;

public class Exam0340 {
  public static void main(String[] args) {
    int i = 0;

    do
      System.out.println(++i);
    while (i <10);

    System.out.println("--------------------");

    // 여러개의 문장을 반복할 때는 블록으로 묶어라

    i = 0;
    do {
      i += 1;
      System.out.println(i);
    } while (i < 10);
  }
}

/*
# do ~ while
-최소 한번은 반복한다.
-한번 이상 반복하면 do while
-0번 이상 반복하면 while

do
문장1;
while (조건);

do {
문장 1;
문장 2;
문장 3;
} while (조건);
*/
