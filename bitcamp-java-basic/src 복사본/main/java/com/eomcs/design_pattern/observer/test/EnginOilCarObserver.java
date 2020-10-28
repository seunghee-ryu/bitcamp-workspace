package com.eomcs.design_pattern.observer.test;

public class EnginOilCarObserver extends AbstractCarObserver {

  @Override
  public void carStarted() {
    System.out.println("엔진 오일 유무 검사");

  }

}
