package com.eomcs.basic.ex06;

public class Exam0321 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

    // 1부터 100까지의 짝수의 합은?
    // countinue 사용 전
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count % 2 == 0) {
        sum += count;
      }
    }
    System.out.printf("count=%d, sum=%d\b", count, sum);

    System.out.println("--------------------");

    // countinue 사용후
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count % 2 == 1)
        continue;
      sum += count;
    }
    System.out.printf("count=%d, sum%d\n", count, sum);
  }

}
