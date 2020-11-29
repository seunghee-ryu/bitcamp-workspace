package com.eomcs.pms.web;

import java.io.BufferedReader;
import java.io.PrintWriter;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;
import com.eomcs.util.Prompt;

@CommandAnno("/member/delete")
public class MemberDeleteCommand implements Command {

  MemberService memberService;

  public MemberDeleteCommand(MemberService memberService) {
    this.memberService = memberService;
  }

  @Override
  public void execute(Request request) {

    PrintWriter out = request.getWriter();
    BufferedReader in = request.getReader();

    try {
      out.println("[회원 삭제]");
      int no = Prompt.inputInt("번호? ", out, in);
      Member member = memberService.get(no);

      if (member == null) {
        out.println("해당 번호의 회원이 없습니다.");
        return;
      }

      String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ", out, in);
      if (!response.equalsIgnoreCase("y")) {
        out.println("회원 삭제를 취소하였습니다.");
        return;
      }

      memberService.delete(no);
      out.println("회원을 삭제하였습니다.");

    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }
}