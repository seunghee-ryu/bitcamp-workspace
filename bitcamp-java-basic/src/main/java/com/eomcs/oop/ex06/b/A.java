package com.eomcs.oop.ex06.b;

public class A {
  static public void m() {
    System.out.println("m()");
  }

  static public void m(int a) {
    System.out.println("m(int)");
  }

  static public void m(String a) {
    System.out.println("m(String)");
  }

  static public void m(String a, int b) {
    System.out.println("m(String, int)");
  }

  static public void m(int a, String b) {
    System.out.println("m(int, String)");
  }
}
