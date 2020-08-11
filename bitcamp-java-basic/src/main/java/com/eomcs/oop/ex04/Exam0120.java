package com.eomcs.oop.ex04;

import java.util.Date;

public class Exam0120 {
  public static void main(String[] args) throws Exception {
    Date d1 = new Date();
    System.out.println(d1);

    Date d2 = new Date(118, 2, 20);
    System.out.println(d2);

    Date d3 = new Date(1000L * 60 * 60 * 24 * 365 * 50);
    System.out.println(d3);
  }

}
