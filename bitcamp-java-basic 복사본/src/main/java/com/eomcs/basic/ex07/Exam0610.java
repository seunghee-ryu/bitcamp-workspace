package com.eomcs.basic.ex07;

public class Exam0610 {
  public static void main(String[] 변수명은상관없다) {
    // JVM 아규먼트?
    // JVM에게 전달하는 값

    // JVM 아규먼트 값 꺼내기
    // System.getProperty("이름");
    // $java -cp ./bin/main -D이름=값 -D이름=값 -D이름=값 com.eomcs.basic.ex07.Exam0610
    // -Da=값 -Db=값 -Dc=값
    //
    // 값은 숫자를 넣으면 된다.

    String value1 = System.getProperty("a");
    String value2 = System.getProperty("b");
    String value3 = System.getProperty("c");

    System.out.println(value1);
    System.out.println(value2);
    System.out.println(value3);


  }

}
