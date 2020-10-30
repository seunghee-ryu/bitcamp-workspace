package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0220 {
  public static void main(String[] args) throws Exception {


    try ( java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb", //jdbcURL
        "study", //username
        "1111" // password
        );) {

      System.out.println("DBMS와 연결됨");

    }
    System.out.println("DBMS와 연결 해제됨");
  }
}


