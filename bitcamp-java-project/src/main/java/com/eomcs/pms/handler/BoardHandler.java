package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Board;
//import com.eomcs.pms.handler.BoardList.Board; // 중첩클래스 임포트
import com.eomcs.util.Prompt;

public class BoardHandler {

  // 보드 핸들러가 사용할 보드리스트 객체를 준비한다.

  BoardList boardlist = new BoardList();

  public void add() {
    System.out.println("[게시물 등록]");

    Board board = new Board();
    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    board.writer = Prompt.inputString("작성자? ");
    board.registeredDate = new Date(System.currentTimeMillis());
    board.viewCount = 0;

    boardlist.add(board);

    System.out.println("게시글을 등록하였습니다.");
  }

  public void list() {
    System.out.println("[게시물 목록]");

    Board[] boards = boardlist.toArray();
    for (Board board : boards) {
      System.out.printf("%d, %s, %s, %s, %d\n",
          board.no,
          board.title,
          board.writer,
          board.registeredDate,
          board.viewCount);
    }
  }
}
