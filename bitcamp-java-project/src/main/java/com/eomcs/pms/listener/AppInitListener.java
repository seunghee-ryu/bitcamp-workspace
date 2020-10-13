package com.eomcs.pms.listener;

import java.util.Map;
import com.eomcs.context.ApplicationContextListener;

// 게시물, 회원, 프로젝트, 작업 데이터를 파일에서 로딩하고 파일로 저장하는 일을 한다.
public class AppInitListener implements ApplicationContextListener {

  @Override
  public void contextInitialized(Map<String,Object> context) {
    System.out.println("프로젝트 관리 시스템(PMS)에 오신 것을 환영합니다.");
  }


  @Override
  public void contextDestroyed(Map<String,Object> context) {
    System.out.println("프로젝트 관리 시스템(PMS)를 종료합니다.");
  }



}
