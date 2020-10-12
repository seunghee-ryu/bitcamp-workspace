package com.eomcs.pms.listener;

import com.eomcs.context.ApplicationContextListener;

public class AppInitListener implements ApplicationContextListener {

  @Override
  public void contextInitialized() {
    System.out.println("프로젝트 관리 시스템(PMS)에 오신 것을 환영합니다.");
  }

  @Override
  public void contextDestroyed() {
    System.out.println("프로젝트 관리 시스템(PMS)를 종료합니다.");
  }



}
