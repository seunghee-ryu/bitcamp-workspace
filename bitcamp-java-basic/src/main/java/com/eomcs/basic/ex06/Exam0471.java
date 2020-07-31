package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0471 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("안중근");
    list.add("윤봉길");
    list.add("김원봉");
    list.add("김구");

    //제네릭( < > 를 사용하는 명령어를 제네릭이라 말한다)을 사용하면 for 문장에서
    //항목의 타입을 정확하게 지정하여 값을 받을 수 있다.

    for (String name : list) {
      System.out.print(name + " ");
    }

  }


}
