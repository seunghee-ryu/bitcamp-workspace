package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0141 {
  public static void main(String[] args) {

    //    System.setProperty("jdbc.drivers", "org.mariadb.jdbc.Driver:com.eomcs.jdbc.ex1.MyDriver");
    System.out.printf("jdbc.drivers=%s\n", System.getProperty("jdbc.drivers"));


    try {


      java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb://");
      System.out.println(driver);

      //      java.sql.Driver driver2 = DriverManager.getDriver("jdbc:oracle:thin://");
      //      System.out.println(driver2);
      //
      //      java.sql.Driver driver3 = DriverManager.getDriver("jdbc:sqlserver://");
      //      System.out.println(driver3);



    }catch (Exception e) {
      e.printStackTrace();
    }
  }

}
