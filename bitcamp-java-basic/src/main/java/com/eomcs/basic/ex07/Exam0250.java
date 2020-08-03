package com.eomcs.basic.ex07;

public class Exam0250 {
  static void hello(String...names) {
    for (int i = 0; i <names.length; i++) {
      System.out.printf("%s님 반갑습니다.\n", names[i]);
    }
  }

  public static void main(String[] args) {
    hello(); // 배열 0개

    hello("홍길동"); // 배열 1개

    hello("홍길동", "임꺽정", "유관순"); // 배열 3

    String[] arr = {"김구", "안중근", "윤봉길", "유관순"};

    hello(arr);

    //다른 타입을 섞는 것은 안된다.

}
}
