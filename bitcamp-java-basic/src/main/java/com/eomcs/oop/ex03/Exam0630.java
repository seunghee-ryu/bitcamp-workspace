package com.eomcs.oop.ex03;

public class Exam0630 {
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
    //해당 클래서의 인스턴스를 최초로 생성할 때
    //인스턴스를 만들려면 설계도가 있어야 하고
    //설계도는 메모리에 로딩되어 있어야 한다
    //따라서 설계도가 없으면 즉시 설계도를 로딩할 것이다.

    new A();
    System.out.println("종료");
  }

}
