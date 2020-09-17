package com.eomcs.basic.ex06;

public class Exam0242 {

  //상수를 조금 더 조직적으로 관리하기 위해서
  //enum을 사용한다
  //nested enum은 기본이 static이다
  //그래서 static 을 생력해도 된다.
  //메인 메소드를 정의하기 전에 클래스 메소드에서 정의해둔다.

  enum Level {
    GUEST, MEMBER, ADMIN
  }

  public static void main(String[] args) {
    //enum으로 정의된 상수를 사용하려면
    //enum타입의 변수를 선언해야 한다.
    //final int처럼 값을 지정하지 않아도 된다.
    //물론 값을 직접 지정할 수도 있다.

    //enum변수에는 그 타입에 정의된 값만 저장할 수 있다.

    Level level = Level.MEMBER;

    switch (level) {
      case GUEST:
        System.out.println("조회만 가능합니다.");
        break;
      case MEMBER:
        System.out.println("글작성 가능합니다.");
        break;
      case ADMIN:
        System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다.");
        break;
    }
  }

}
