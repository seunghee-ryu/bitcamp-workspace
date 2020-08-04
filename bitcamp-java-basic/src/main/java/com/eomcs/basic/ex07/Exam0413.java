package com.eomcs.basic.ex07;

import java.util.ArrayList;

public class Exam0413 {

  public static void main(String[] args) throws Exception {

    ArrayList list = new ArrayList();

    while (true) {
      list.add(createArray());
      Thread.currentThread().sleep(2000);

    }

  }

  static int[] createArray() {
    System.out.print(".");
    return new int[10_000_000];

  }

}


// heap이 가득 차서 오류가 난다.
// new 라는 명령은 heap에 메모리를 만든다.

