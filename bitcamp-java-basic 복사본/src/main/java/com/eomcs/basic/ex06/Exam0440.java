package com.eomcs.basic.ex06;

public class Exam0440 {
  public static void main(String[] args) {
    // for(;;)와 배열

    /*
     * String[] names = new String[5];
     * name[0] = 홍길동;
     * name[1] = 임꺽정;
     * name[2] = 유관순;
     * name[3] = 윤봉길;
     * name[4] = 안중근;
     *
     * String[] names = new String[] {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};
     */

    String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};
    for (int i = 0; i <names.length; i++)
      System.out.println(names[i]);

    }
  }


