package com.eomcs.basic.ex07;

public class Exam0220 {

  //메서드 블록을 실행할 때 값이 필요하다면 파라미터 변수를 선언

  static void hello(String name, int age) {
    System.out.printf("%d살 %s님 반갑습니다.\n", age, name);
  }


  public static void main(String[] args) {

    System.out.println("main()11111");
    hello("홍길동", 20);


    System.out.println("main()22222");
    hello("임꺽정", 30);

    System.out.println("main()33333");
    hello("유관순", 16);

    System.out.println("main()44444");

    //아규먼트
    //메서드를 호출할 때 넘겨주는 값
    //hello("홍길동", 20);
    //"홍길동", 20 이 아규먼트이다.

    //파라미터
    //아규먼트를 받는 변수
    //void hello(String name, int age) {...}
    //name 과 age 변수가 파라미터이다.



  }

}
