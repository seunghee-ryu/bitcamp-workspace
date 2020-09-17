//반복문 : while (조건) 문장;

package com.eomcs.basic.ex06;

public class Exam0300 {
  public static void main(String[] args) {
    /*
    int count = 0;
    while (count++ < 10) {
      System.out.println(count);

      System.out.println("---------------------");

      int count2 = 0;
      while (count2 < 10) {
        System.out.println(count2);
        count2++;
      }

    }

    /*
     * 기계어로 바뀔때
    while
      int temp = count; // temp는 0
    count = count +1;
    boolean condition = tem < 10;
    if (condition == true) {
      System.out.println("안녕");
    }
    */
    /*
    System.out.println("---------------------");
    int count3 = 0;
    int sum = 0;
    while (count3++ < 100) {
      sum = sum + count3;
    }
    System.out.println(sum);

    System.out.println("---------------------");
    int count4 = 0;
    while (count4++ < 20) {
      //if (count4 % 2 != 0)
        //continue; // 즉시 조건문으로 제어를 이동시킨다.
      if (count4 > 5)
        break; // 즉시 반복문을 멈춘다.
      System.out.println(count4);
    }

    System.out.println("---------------------");
    */
    /*
    int i = 2;
    int j = 1;
    while (i <= 9) { // nested
      j = 1;
      while (j <= 9) {
      System.out.printf("%d * %d = %d\n", i, j, i * j);
      if (i == 5 && j == 5)
        break;
      j++;
      }
      if (i == 5)
        break;
      i++;
    }
    */
    /*
    int i = 2;
    int j = 1;

    loop:
      while (i <= 9) { // while 문 안에 while 문이 있는 것을 nested라고 한다.

      j = 1;
      while (j <= 9) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
        if (i == 5 && j == 5)
          break loop; // loop를 사용해서 라벨을 붙이면 바로 종료할 수 있다.
        j++;             // 여러 문장이면 중괄호로 묶는다.
      }
      i++;
    }
    System.out.println("-----");

    System.out.println("종료");
    */

    System.out.println("---------------------");

    int i = 0;

    do {
      System.out.println(i);
      i++;
    } while (i < 10); {


    }

  }

}
