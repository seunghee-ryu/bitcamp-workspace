package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0110 {
  public static void main(String[] args) {
    try {
      // 1) Driver 구현체의 인스턴스를 생성한다.
      java.sql.Driver driver = new org.mariadb.jdbc.Driver();

      // 2) Driver 인스턴스를 드라이버 관리자에 등록한다.
      DriverManager.registerDriver(driver);

      // DriverManager 에 등록된 Driver 인스턴스를 확인해본다.
      java.sql.Driver driver2 = DriverManager.getDriver("jdbc:mariadb:");
      System.out.println(driver2);

    }catch (Exception e) {
      e.printStackTrace();
    }
  }

}
