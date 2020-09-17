package com.eomcs.basic.ex06;

public class Exam0322 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

    // 1부터 100을 카운트하는데 합은 50까지만
    // break 사용 전

    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count > 50)
        continue;
      sum += count;
    }
    System.out.printf("count=%d, sum=%d", count, sum);

    System.out.println("--------------------");

    //break 사용후

    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count > 50)
        break; // 반복문을 종료하고 나간다.
      sum += count;
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);
  }

}
