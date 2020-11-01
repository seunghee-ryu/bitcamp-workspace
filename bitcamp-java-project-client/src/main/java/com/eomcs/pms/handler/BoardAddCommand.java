package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

// Command 규칙에 따라 클래스를 정의한다.
public class BoardAddCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[게시물 등록]");

    Board board = new Board();
    board.setTitle(Prompt.inputString("제목? "));
    board.setContent(Prompt.inputString("내용? "));
    board.setWriter(Prompt.inputString("작성자? "));


    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "insert into pms_board(title,content,writer) values(?,?,?)"
            );) {

      stmt.setString(1, board.getTitle());
      stmt.setString(2, board.getContent());
      stmt.setString(3, board.getWriter());
      int count = stmt.executeUpdate();

      System.out.println("게시글을 등록하였습니다.");
    }
    catch (Exception e) {
      System.out.println("게시글 등록 실행 중 오류");
      e.printStackTrace();
    }
  }
}

//  create table pms_board(
//      no int not null,
//      title varchar(255) not null,
//      content text not null,
//      writer varchar(30) not null,
//      cdt datetime default now(),
//      vw_cnt int default 0
//      );
//
//  alter table pms_board
//  add constraint pms_board_pk primary key(no);
//
//  alter table pms_board
//  modify column no int not null auto_increment;
//
