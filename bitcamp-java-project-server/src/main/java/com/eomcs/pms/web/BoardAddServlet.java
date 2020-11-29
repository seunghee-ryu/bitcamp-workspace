package com.eomcs.pms.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.BoardService;

@WebServlet("/board/add")
public class BoardAddServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ServletContext ctx = request.getServletContext();
    BoardService boardService =
        (BoardService) ctx.getAttribute("boardService");

    // 클라이언트가 POST 요청할 때 보낸 데이터를 읽는다.
    request.setCharacterEncoding("UTF-8");

    Board board = new Board();
    board.setTitle(request.getParameter("title"));
    board.setContent(request.getParameter("content"));

    // 회원 정보가 들어있는 세션 객체를 얻는다.
    HttpSession session = request.getSession();

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta http-equiv='Refresh' content='1;url=list'>");
    out.println("<title>게시글등록</title></head>");
    out.println("<body>");
    try {
      out.println("<h1>게시물 등록</h1>");

      Member loginUser = (Member) session.getAttribute("loginUser");

      board.setWriter(loginUser);

      boardService.add(board);

      out.println("<p>게시글을 등록하였습니다.</p>");

    } catch (Exception e) {
      out.println("<h2>작업 처리 중 오류 발생!</h2>");
      out.printf("<pre>%s</pre>\n", e.getMessage());

      StringWriter errOut = new StringWriter();
      e.printStackTrace(new PrintWriter(errOut));
      out.println("<h3>상세 오류 내용</h3>");
      out.printf("<pre>%s</pre>\n", errOut.toString());
    }

    out.println("</body>");
    out.println("</html>");
  }
}


//package com.eomcs.pms.web;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.StringWriter;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import com.eomcs.pms.domain.Board;
//import com.eomcs.pms.domain.Member;
//import com.eomcs.pms.service.BoardService;
//
//// Command 규칙에 따라 클래스를 정의한다.
//@WebServlet("/board/add")
//public class BoardAddServlet extends HttpServlet {
//
//  private static final long serialVersionUID = 1L;
//  BoardService boardService;
//
//  @Override
//  protected void doPost(HttpServletRequest request, HttpServletResponse response)
//      throws ServletException, IOException {
//
//    ServletContext ctx = request.getServletContext();
//    BoardService boardService =
//        (BoardService) ctx.getAttribute("boardService");
//
//    // 클라이언트가 post 요청할 때 보낸 데이터를 읽는다.
//    request.setCharacterEncoding("UTF-8");
//
//    // 보드를 만들어서 그 보드에 담는다.
//    Board board = new Board();
//    board.setTitle(request.getParameter("title"));
//    board.setContent(request.getParameter("content"));
//
//    // 로그인 할 회원의 정보가 들어있는 세션 객체를 얻는다.
//    HttpSession session = request.getSession();
//
//    response.setContentType("text/html;charset=UTF-8");
//    PrintWriter out = response.getWriter();
//
//    out.println("<!DOCTYPE html>");
//    out.println("<html>");
//    out.println("<head>");
//    out.println("<meta http-equiv='Refresh' content='1;list'>");
//    out.println("<title>게시글 등록</title></head>");
//    out.println("<body>");
//    try {
//      out.println("<h1>게시물 등록</h1>");
//
//      Member loginUser = (Member) session.getAttribute("loginUser");
//
//      board.setWriter(loginUser);
//
//      boardService.add(board);
//
//      out.println("게시글을 등록하였습니다.");
//
//    } catch (Exception e) {
//      out.printf("<h2>작업 처리 중 오류 발생!</h2>");
//      out.printf("<pre>%s</pre>\n", e.getMessage());
//
//      StringWriter errOut = new StringWriter();
//      e.printStackTrace(new PrintWriter(errOut));
//
//      out.printf("<h3>상세 오류 내용</h3>");
//      out.printf("<pre>%s</pre>\n", errOut.toString());
//    }
//
//    out.println("</body>");
//    out.println("</html>");
//  }
//}
//
