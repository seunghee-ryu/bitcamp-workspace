package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import com.eomcs.pms.service.BoardService;
import com.eomcs.util.Prompt;

@CommandAnno("/board/delete")
public class BoardDeleteCommand implements Command {

  BoardService boardService;

  public BoardDeleteCommand(BoardService boardService) {
    this.boardService = boardService;
  }

  @Override
  public void execute(Request request) {

    PrintWriter out = request.getWriter();
    BufferedReader in = request.getReader();

    out.println("[게시물 삭제]");
    int no;
    try {
      no = Prompt.inputInt("번호? ", out, in);

      String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ", out, in);
      if (!response.equalsIgnoreCase("y")) {
        out.printf("게시글 삭제를 취소하였습니다.\n");
        return;
      }

      try {
        int count = boardService.delete(no);
        if (count == 0) {
          out.printf("해당 번호의 게시물이 존재하지 않습니다.\n", out, in);
        } else {
          out.printf("게시글을 삭제하였습니다.\n");
        }
      } catch (Exception e) {
        out.println("게시글 삭제 중 오류 발생!");
        e.printStackTrace();
      }
    } catch (Exception e) {

    }
  }
}