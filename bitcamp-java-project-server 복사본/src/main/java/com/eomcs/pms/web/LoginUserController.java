package com.eomcs.pms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("/auth/loginUser")
public class LoginUserController  implements Controller {

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    return "/auth/loginUser.jsp";
  }
}
