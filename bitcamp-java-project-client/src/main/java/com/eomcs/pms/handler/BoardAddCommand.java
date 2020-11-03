package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class BoardAddCommand implements Command {

  MemberListCommand memberListCommand;

  public BoardAddCommand(MemberListCommand memberListCommand) {
    this.memberListCommand = memberListCommand;
  }

  @Override
  public void execute() {
    System.out.println("[게시물 등록]");

    Board board = new Board();
    board.setTitle(Prompt.inputString("제목? "));
    board.setContent(Prompt.inputString("내용? "));


    while (true) {
      String name = Prompt.inputString("작성자?(취소: 빈 문자열) ");

      if (name.length() == 0) {
        System.out.println("게시글 등록을 취소합니다.");
        return;
      } else {
        Member member = memberListCommand.findByName(name);
        if (member == null) {
          System.out.println("등록된 회원이 아닙니다.");
          continue;
        }
        board.setWriter(member);
        break;
      }
    }

    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "insert into pms_board(title,content,writer) values(?,?,?)")) {

      stmt.setString(1, board.getTitle());
      stmt.setString(2, board.getContent());
      stmt.setInt(3, board.getWriter().getNo());
      stmt.executeUpdate();

      System.out.println("게시글을 등록하였습니다.");

    } catch (Exception e) {
      System.out.println("게시글 등록 중 오류 발생!");
      e.printStackTrace();
    }
  }
}


//create table pms_board(
//    no int not null,
//    title varchar(255) not null,
//    content text not null,
//    writer int not null,
//    cdt datetime default now(),
//    vw_cnt int default 0
//    );
//
//alter table pms_board
//add constraint pms_board_pk primary key(no);
//
//alter table pms_board
//modify column no int not null auto_increment;
//
//alter table pms_board
//add constraint pms_board_fk foreign key(writer) references pms_member(no);