package com.eomcs.oop.ex03;

public class Exam0660 {
  public static class A {
    static int a;

    static void m() {}

    //클래스가 로딩될 때 스태틱 초기화 블록은 실행된다.
    //여러개의 스태틱 블록이 있을 때 컴파일러는 한 개의 블록으로 합친다.
    //바이트코드를 확인해봐라.

    static {
      System.out.println("Static{} 11111");
    }

    static {
      System.out.println("Static{} 22222");
    }
  }

  public static void main(String[] agrs) throws Exception {

    //클래스가 로딩되는 경우
    //1) 클래스 멤버(변수와 메서드)를 최초로 사용할 때
    //2) 해당 클래스의 인스턴스를 최초로 생성할 때
    //3)자바에서 제공하는 도구를 사용하여 클래스를 로딩할 때

    //클래스가 로딩된 후
    //1)클래스 필드가 생성된다.
    //2)클래스 블록(스태틱 블록)이 실행된다.

    //레퍼런스를 선언할 때는 클래스가 로딩되지 않는다.
    //클래스는 중복 로딩되지 않는다.

    //만약 이전에 클래스가 로딩 되었다면 다시 로딩되지 않는다.
    //즉 스태틱 블록을 다시 실행하지 않는다.

    A.m();
    System.out.println("종료");
  }

}
