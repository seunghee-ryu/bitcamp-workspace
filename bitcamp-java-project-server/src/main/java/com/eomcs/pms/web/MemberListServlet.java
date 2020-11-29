package com.eomcs.pms.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

@WebServlet("/member/list")
public class MemberListServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ServletContext ctx = request.getServletContext();
    MemberService memberService =
        (MemberService) ctx.getAttribute("memberService");

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head><title>회원목록</title></head>");
    out.println("<body>");
    try {
      out.println("<h1>회원 목록</h1>");

      out.println("<tr>");
      out.println("[회원 목록]");
      out.println("</tr>");

      out.println("<a href='form.html'>새 회원</a><br>");

      List<Member> list = memberService.list();

      out.println("<table border='1'>");

      out.println("<thead><tr>" // table row
          + "<th>번호</th>"
          + "<th>이름</th>"
          + "<th>이메일</th>"
          + "<th>전화</th>"
          + "<th>등록일</th>"
          + "</tr></thead>");

      out.println("<tbody>");


      for (Member member : list) {

        out.printf("<tr>"
            + "<td>%d</td>"
            + "<td><img src='../upload/%s' alt='[%2$s]' height='30px'>%s</td>"
            + "<td>%s</td>"
            + "<td>%s</td>"
            + "<td>%s</td>"
            + "</tr>\n",
            member.getNo(),
            member.getPhoto(),
            member.getName(),
            member.getEmail(),
            member.getTel(),
            member.getRegisteredDate());
        // 만약 getNo를 두개 안 쓰고 싶다면 <a href='detail?no=%1$d'>
      }
      out.println("</tbody>");
      out.println("</table>");

    } catch (Exception e)  {
      out.printf("<p>게시글 목록 조회 중 오류 발생 -%s</p>\n", e.getMessage());

      StringWriter errOut = new StringWriter();
      e.printStackTrace(new PrintWriter(errOut));

      out.printf("<pre?%s</pre>\n", errOut.toString());
    }
    out.println("</body>");
    out.println("</html>");
  }
}
