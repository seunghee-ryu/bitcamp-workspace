// Object 클래스 - getClass() : 해당 클래스의 정보를 리턴한다.
package com.eomcs.corelib.ex01;

public class Exam0160 {

  static class My {
    public static void main(String[] args) {
      My obj1 = new My();

      Class<?> classInfo = obj1.getClass();

      System.out.println(classInfo.getName());
      System.out.println(classInfo.getSimpleName());
    }
  }
}
//
//  static class My {
//  }
//
//  public static void main(String[] args) {
//    My obj1 = new My();
//
//    // 레퍼런스를 통해서 인스턴스의 클래스 정보를 알아낼 수 있다.
//    Class<?> classInfo = obj1.getClass();
//
//    // 클래스 정보로부터 다양한 값을 꺼낼 수 있다.
//    // 리플렉션 api 라고 한다.
//    // 거울처럼 클래스 정보를 속속들이 보여준다.
//
//    // api = 어플리케이션을 사용할 때 사용하는 도구
//    System.out.println(classInfo.getName());
//    System.out.println(classInfo.getSimpleName());
//  }
//}







