package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.eomcs.util.Prompt;

public class BoardUpdateCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[게시물 변경]");
    int no = Prompt.inputInt("번호? ");

    // 타이틀과 컨텐트 변수를 준비한다.
    String title = null;
    String content = null;

    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        Statement stmt = con.createStatement()) {

      String sql = String.format(
          "select title, content from pms_board where no = %d", no);

      // 변경 전 게시글 내용을 가져온다.
      try (ResultSet rs = stmt.executeQuery(sql)) {
        if (rs.next()) {
          title = rs.getString("title");
          content = rs.getString("content");
        } else {
          System.out.println("해당 번호의 게시글이 존재하지 않습니다.");
          return;
        }
      }
    } catch (Exception e) {
      System.out.println("게시글 조회 중 오류 발생");
      e.printStackTrace();
    }

    // title 과 content에 새로운 정보를 입력받는다.
    title = Prompt.inputString(String.format("제목(%s)? ", title));
    content = Prompt.inputString(String.format("내용(%s)? ", content));

    String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (!response.equalsIgnoreCase("y")) {
      System.out.println("게시글 변경을 취소하였습니다.");
      return;
    }

    // 다시 데이터 베이스에 접속한다.
    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        Statement stmt = con.createStatement()) {

      // sql 문을 이용하여 title과 content의 변경 내용을 저장한다.
      String sql = String.format(
          "update pms_board set title = '%s', content = '%s' where no = %d",
          title, content, no);

      int count = stmt.executeUpdate(sql);

      if (count == 0) {
        System.out.println("해당 번호의 게시물일 존재하지 않습니다.");
      } else {
        System.out.println("게시글을 변경하였습니다.");
      }
    } catch (Exception e) {
      System.out.println("게시글 변경 중 오류 발생");
      e.printStackTrace();
    }
  }
}
