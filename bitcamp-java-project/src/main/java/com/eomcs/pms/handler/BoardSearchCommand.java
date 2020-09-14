package com.eomcs.pms.handler;

import java.util.List;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardSearchCommand implements Command {

  List<Board> boardList;

  public BoardSearchCommand(List<Board> list) {
    this.boardList = list;
  }
  @Override
  public void execute() {
    String keyword = Prompt.inputString("검색어? ");
    System.out.printf("입력하신 검색어는 %s 입니다.\n", keyword);

  }

}
