package com.eomcs.basic.ex07;

public class Exam0260 {

  //가변 파라미터
  static void hello(String...names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s님 반갑습니다.\n", names[i]);
    }
  }

  //배열 파라미터
  static void hello2(String[] names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s님 반갑습니다.\n", names[i]);
    }
  }

  public static void main(String[] args) {

    //가변 파라미터의 메서드 호출
    //낱개의 값을 여러개 주거나 배열에 담아서 전달
    hello("홍길동", "임꺽정", "유관순");
    String[] arr = {"김구", "안중근", "윤봉길", "유관순"};

    //배열 파라미터 메서드 호출
    //낱개의 값 여러개 줄 수 없다.
    //오직 배열에 담아서만 전달
    String[] arr2 = {"김구", "안중근", "윤봉길", "유관순"};
    hello2(arr2);
  }

}
