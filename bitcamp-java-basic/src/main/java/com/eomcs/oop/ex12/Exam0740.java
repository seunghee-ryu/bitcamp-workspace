// 메서드 레퍼런스 - 생성자 레퍼런스
package com.eomcs.oop.ex12;

public class Exam0740 {

  static class Message {
    String name;

    public Message() {
      this.name = "이름없음";
    }

    public Message(String name) {
      this.name = name;
    }

    public void print() {
      System.out.printf("%s님 반갑습니다!\n", name);
    }
  }

  static interface Factory1 {
    Message get();
  }

  static interface Factory2 {
    Message get(String name);
  }

  static interface Factory3 {
    Message get(String name, int age);
  }

  public static void main(String[] args) {

    Factory1 f1 = Message::new; // Factory() 생성자를 가리킨다.
    // 즉 컴파일러는 Messege의 기본 생성자를 호출하는 Factory 구현체를 만들어 리턴한다.

    Factory2 f2 = Message::new; // Factory(String) 생성자를 가리킨다.
    // 즉 컴파일러는 Messege의 생성자 중에서 String을 파라미터로 받는 생성자를 호출하는
    // Factory 구현체를 만들어 리턴한다.


    // Factory(String,int) 생성자가 없기 때문에 컴파일 오류!
    // Factory3 f3 = Message::new; // 컴파일 오류!
    // 즉 컴파일러는 Messege의 생성자 중에서
    // String과 int를 파라미터로 받는 생성자를 호출하는 Factory 구현체를 만들어야 하는데
    // Messege 클래스에는 String과 int를 생성자로 받는 파라미터가 없기 때문에
    //

  }
}


