package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0461 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("홍길동");
    list.add(3.14f);
    list.add(true);
    list.add(365);

    // for 문에 컬렉션도 적용할 수 있다.
    // for (변수선언 : 컬렉션 객체) 문장;

    for (Object value : list)
      System.out.println(value);

  }

}
