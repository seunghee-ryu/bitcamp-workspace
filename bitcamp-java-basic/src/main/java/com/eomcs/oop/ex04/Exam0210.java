package com.eomcs.oop.ex04;

import java.util.Calendar;
import java.util.Date;

public class Exam0210 {
  public static void main(String[] args) throws Exception {
    String s1 = new String("Hello");
    String s2 = new String("ABC가각");

    // 인스턴스 메서드
    // - non-static 메서드
    // - 인스턴스 주소를 가지고 호출해야 한다.
    // - this 라는 내장 변수가 있다.
    // - 특정 인스턴스의 변수를 다루는 메서드

    char c1 = s1.charAt(1);
    System.out.println(c1);

    char c2 = s2.charAt(1);
    System.out.println(c2);

    System.out.println(s1.compareTo(s2)); // 정렬했을 때 앞에 있느냐 뒤에 있느냐를 알고싶을때

    System.out.println(s1.contains("ll"));
    System.out.println(s2.contains("ll"));
    System.out.println(s1.equals(s2));

    System.out.println("-------------------");
    byte[] bytes = s2.getBytes();
    // JVM은 UTF16으로 저장한다. => os 기본문자
    // 리눅스/유닉스 : 41, 42, 43, ea,, 0b, 80, ea, b0, 81
    // 윈도우 : 41, 42, 43, b0 a1, b0 42


    for (byte b : bytes) {
      System.out.println(Integer.toHexString(b & 0xff));

      System.out.println(s1.contains("ll"));
      System.out.println(s2.contains("ll"));
      System.out.println(s1.equals(s2));

    }

      System.out.println("-------------------");
      byte[] bytes1 = s2.getBytes("ms949");
      // JVM은 UTF16으로 저장한다. => os 기본문자
      // 리눅스/유닉스 : 41, 42, 43, ea,, 0b, 80, ea, b0, 81
      // 윈도우 : 41, 42, 43, b0 a1, b0 42


      for (byte b : bytes1) {
        System.out.println(Integer.toHexString(b & 0xff));

    }

      System.out.println("----------------------");

      String s3 =String.format("%s 님 방가방가", "홍길동");
      System.out.println(s3);

      String s4 = String.join(",", "홍길동", "임꺽정", "유관순");
      System.out.println(s4);

      String s5 = String.valueOf(true);
      String s6 = String.valueOf(100);
      String s7 = String.valueOf(3.14f);
      System.out.printf("%s %s %s\n", s5, s6, s7);

    System.out.println(Math.abs(-100));
    System.out.println(Math.ceil(-3.28));
    System.out.println(Math.floor(-3.28));
    System.out.println(Math.pow(2, 7));
    System.out.println(Math.round(3.14));
    System.out.println(Math.round(3.54));

    Date d1 = new Date();

    System.out.println(d1.getYear() + 1900);
    System.out.println(d1.getMonth() + 1);
    System.out.println(d1.getDate());
    System.out.println(d1.getDay());

    long millis = Date.parse("Sat, 12 Aug 1995 13:30:25 GMT");
    System.out.println(millis);

    java.sql.Date d2 = java.sql.Date.valueOf("2020-08-10");
    // 같은 클래스 다른 유틸은 패키지 이름 적어야 한다.

    System.out.println(d2.getYear() + 1900);
    System.out.println(d2.getMonth() + 1);
    System.out.println(d2.getDate());
    System.out.println(d2.getDay());

    long curr = System.currentTimeMillis();
    Date d3 = new Date(curr);
    System.out.println(d3.getYear() + 1900);
    System.out.println(d3.getMonth() + 1);
    System.out.println(d3.getDate());
    System.out.println(d3.getDay());

    System.out.println("-------------------");
    Calendar cal = Calendar.getInstance();
    System.out.println(cal.get(1)); // year
    System.out.println(cal.get(2) + 1); // month
    System.out.println(cal.get(5)); // date
    System.out.println(cal.get(7)); // 요일(1~7)
    System.out.println(cal.get(4)); // 해당 월의 몇번째 주인지 알아내는 것
    System.out.println(cal.get(10)); // hour 12
    System.out.println(cal.get(11)); // hour 24
    System.out.println(cal.get(12)); // minute
    System.out.println(cal.get(13)); // second

    System.out.println(cal.get(Calendar.YEAR)); // year
    System.out.println(cal.get(Calendar.MONTH)); // month
    System.out.println(cal.get(Calendar.DATE)); // date
    System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 요일(1~7)
    System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 해당 월의 몇번째 주인지 알아내는 것
    System.out.println(cal.get(Calendar.HOUR)); // hour 12
    System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // hour 24
    System.out.println(cal.get(Calendar.MINUTE)); // minute
    System.out.println(cal.get(Calendar.SECOND)); // second



    // int -> Integer, byte -> Byte, short -> Short, long -> long
    // float -> Float, double -> Double, char -> Character

    Integer i1 = new Integer(100); // 4 바이트 정수값을 다루는 클래스
    Integer i2 = new Integer(100);

    System.out.println(i1.toString());
    System.out.println(i2.toString());
    System.out.println(i1 == i2);

    Integer i3 = Integer.valueOf(100); // 클래스 이름으로 바로 호출할 수 있는 클래스 메소드
    Integer i4 = Integer.valueOf(100);


    System.out.println(i3.toString());
    System.out.println(i4.toString());
    System.out.println(i4 == i4);




  }

}
