package com.eomcs.basic.ex07;

public class Exam0414 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) throws Exception {

    Score s = new Score();

    Score s2;
    s2 = createObject();

  }

  // - Score 설계도에 따라 Heap에 생성한 메모리의 주소를 리턴
  // == Score 클래스에 따라 Heap에 생성한 인스턴스 주소를 리턴
  // == Score 클래스의 인스턴스를 생성한 후 그 주소를 리턴
  // == Score 클래스의 인스턴스를 리턴
  // == Score 의 인스턴스를 리턴
  // == Score 객체를 리턴
  // 주고받는 것은 주소지 객체나 배열을 주고받을 수 없다.(원시타입만 직접 값을 주고받을 수 있다.)

  static Score createObject() {
    Score s = new Score();
    return s;

  }

}


// heap이 가득 차서 오류가 난다.
// new 라는 명령은 heap에 메모리를 만든다.

