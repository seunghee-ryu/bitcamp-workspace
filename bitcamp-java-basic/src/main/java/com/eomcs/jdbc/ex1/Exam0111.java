package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0111 {
  public static void main(String[] args) {
    try {

      // 1) Driver 구현체의 인스턴스를 생성한다.
      java.sql.Driver mariaDBDriver = new org.mariadb.jdbc.Driver();
      java.sql.Driver oracleDriver = new oracle.jdbc.driver.OracleDriver();
      java.sql.Driver mssqlDriver = new com.microsoft.sqlserver.jdbc.SQLServerDriver();

      // 2) Driver 인스턴스를 드라이버 관리자에 등록한다.
      DriverManager.registerDriver(mariaDBDriver);
      DriverManager.registerDriver(oracleDriver);
      DriverManager.registerDriver(mssqlDriver);

      // DriverManager 에 등록된 Driver 인스턴스를 확인해본다.
      // => DriverManager.getDriver(jdbcUrl);
      // => jdbcUrl
      // jdbc:[DBMS]://서버주소:포트번호/데이트베이스명
      java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb://");
      System.out.println(driver);

      java.sql.Driver driver2 = DriverManager.getDriver("jdbc:oracle:thin://");
      System.out.println(driver2);

      java.sql.Driver driver3 = DriverManager.getDriver("jdbc:sqlserver://");
      System.out.println(driver3);

      // 등록되지 않은 것은 에러가 뜰 것이다.


    }catch (Exception e) {
      e.printStackTrace();
    }
  }

}
