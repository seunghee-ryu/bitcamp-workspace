package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0470 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("안중근");
    list.add("윤봉길");
    list.add("김원봉");
    list.add("김구");

    //string 이 아닌 값은 넣을 수 없다.

    for (int i = 0; i < list.size(); i++)
      System.out.println(list.get(i));

  }


}
