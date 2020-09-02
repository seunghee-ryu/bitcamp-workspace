// 제네릭(Generic) 문법 정리 - 레퍼런스와 인스턴스 생성
package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0212 {
  public static void main(String[] args) {

    ArrayList<Object> list1;

    list1 = new ArrayList();
    list1 = new ArrayList<>();
    list1 = new ArrayList<Object>();

    list1.add(new String());
    list1.add(new java.util.Date());
    list1.add(new Integer(100));
    list1.add(new StringBuffer());

//    list1 = new ArrayList<String>();
//    list1 = new ArrayList<Integer>();
//
//    ArrayList<Object> list1;
//    // 제네릭 타입을 Object로 지정하면
//    // 그렇게 지정된 ArrayList 객체만 list1에 저장할 수 있다.
//
//    list1 = new ArrayList(); // 이렇게 사용하지 말고, 명확히 제네릭의 타입을 지정하라.
//    list1 = new ArrayList<>();
//    list1 = new ArrayList<Object>();
//    //list1 = new ArrayList<String>(); // 컴파일 오류!
//    //list1 = new ArrayList<Member>(); // 컴파일 오류!
  }
}








