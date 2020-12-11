package com.eomcs.pms.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

@RequestMapping("/auth/login")
public class LoginController implements Controller {

  MemberService memberService;

  public LoginController(MemberService memberService) {
    this.memberService = memberService;
  }

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response)
      throws Exception {

    // 클라이언트로 데이터를 출력할 때 사용할 스트림 준비
    response.setContentType("text/html;charset=UTF-8");

    System.out.println("LoginServlet 실행!");
    if (request.getMethod().equals("GET")) {
      // 웹브라우저가 쿠키로 이메일을 보냈으면 꺼낸다.
      String email = "";

      Cookie[] cookies = request.getCookies();
      if (cookies != null) {
        for (Cookie cookie : cookies) {
          if (cookie.getName().equals("email")) {
            email = cookie.getValue();
            break;
          }
        }
      }

      request.setAttribute("email", email);
      return "/auth/form.jsp";
    }

    // 클라이언트 전용 보관소(세션)를 준비한다.
    HttpSession session = request.getSession();

    // 클라이언트가 보낸 데이터를 꺼낸다.
    String email = request.getParameter("email");
    String password = request.getParameter("password");

    // 클라이언트에게 보낼 email 쿠키를 준비한다.
    Cookie emailCookie = new Cookie("email", email);

    if (request.getParameter("saveEmail") != null) {
      // => 이 쿠키는 로그인폼에서만 사용할 것이기 때문에
      //    사용 범위를 현재 서블릿의 URL에 한정한다.
      // => 사용 범위를 지정하지 않으면 자동으로 현재 URL에 한정된다.
      //    즉 사용범위를 지정할 필요가 없다.
      // => 대신 웹브라우저를 종료하거나 컴퓨터를 종료한 후에서 유지해야 하기 때문에
      //    유효기간을 설정한다.
      emailCookie.setMaxAge(60 * 60 * 24 * 7);
    } else {
      emailCookie.setMaxAge(0); // 유효기간이 0이면 삭제하라는 의미다.
    }

    // 응답헤더에 email 쿠키를 포함시킨다.
    response.addCookie(emailCookie);

    Member member = memberService.get(email, password);
    if (member == null) {
      return "/auth/loginError.jsp";
    }

    session.setAttribute("loginUser", member);
    return "redirect:../../index.html";

  }
}

