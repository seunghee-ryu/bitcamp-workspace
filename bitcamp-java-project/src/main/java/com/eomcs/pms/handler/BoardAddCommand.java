package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardAddCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[게시물 등록]");

    Board board = new Board();
    board.setTitle(Prompt.inputString("제목? "));
    board.setContent(Prompt.inputString("내용? "));
    board.setWriter(Prompt.inputString("작성자? "));

    // DriverManager 클래스를 통해 데이터 원본에 JDBC 드라이버를 통하여
    // 커넥션을 만드는 역할을 한다.

    // Connection 인터페이스가 구현된 Connection 객체를 사용해서 SQL문을
    // 정의하고 실행시킬 수 있는 Statement 객체를 생성한다.

    // Statement 객체는 Connection 객체에 의해 리턴되는 객체에 의해 구현되는
    // 일종의 메서드 집합.
    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        Statement stmt = con.createStatement()) {

      String sql = String.format(
          "insert into pms_board(title,content,writer) values('%s','%s','%s')",
          board.getTitle(), board.getContent(), board.getWriter());
      stmt.executeUpdate(sql);

      System.out.println("게시글을 등록하였습니다.");

    } catch (Exception e) {
      System.out.println("게시글 등록 중 오류 발생");
      e.printStackTrace();
    }
  }
}
