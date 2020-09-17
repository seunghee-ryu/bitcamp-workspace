package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0460 {
  public static void main(String[] args) {

    //배열은 같은 타입의 값만 보관할 수 있지만
    //컬렉션은 다른 타입의 값도 보관할 수 있다.

    //배열은 크기가 고정되지만
    //컬렉션은 크기가 가변적이다.

    // ArrayList list = new ArrayList();
    // 명령어 변수이름 = new 변수를 저장할 메모리

    ArrayList list = new ArrayList();
    list.add("홍길동");
    list.add(3.14f);
    list.add(true);
    list.add(365);

    for (int i = 0; i < list.size(); i++)
      System.out.println(list.get(i));

    //list 는 size 를 사용해서 크기를 알아낸다.


  }

}
