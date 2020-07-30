package com.eomcs.basic.ex06;

public class Exam0330 {
  public static void main(String[] args) {
    int x = 2, y = 1;

    // 5 * 5까지만 출력

    while (x <= 9) {
      while (y <=9) {
        System.out.printf("%d * %d = %d\n", x, y, x * y);
        if (x == 5 && y == 5)
          break;
        y++;
      }
      System.out.println();
      x++;
      y = 1;
    }
    System.out.println("종료");

  }
}
