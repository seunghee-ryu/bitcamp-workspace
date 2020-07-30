package com.eomcs.basic.ex06;

public class Exam0231 {
  public static void main(String[] args) {

    int x = 1, y = 300;
    switch (x) {
      case 1 * 300: // ok
        //case 1 * y: 컴파일 오류
        //y 는 변수이지 상수가 아니기 때문에.
        //case 값으로 상수만 올 수 있고 변수는 올 수 없
    }
  }

}
