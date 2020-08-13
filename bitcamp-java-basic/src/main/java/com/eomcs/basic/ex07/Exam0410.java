package com.eomcs.basic.ex07;

public class Exam0410 {

  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.printf("swap(): a=%d, b=%d\n", a, b);
  }
  public static void main(String[] args) {
    int a = 100;
    int b = 200;
    swap(a, b);
    System.out.printf("main(): a=%d, b=%d\n", a, b);
  }

}

// 실행 순서와 메모리
//
// 1) 클래스 정보를 메소드 영역에 로드한다.
// 2) 메인 호출
//    스택 영역에 메인 메서드가 사용할 로컬 변수를 준비한다.
// 3) 스왑 호출
//    스택 영역에 스왑 메서드가 사용할 로컬 변수를 준비한다.
// 4) 스왑 실행 완료
//    스택 영역에 있던 스왑이 사용한 메모리를 제거한다.
// 5) 메인 실행 완료
//    스택 영역에 있던 메인이 사용한 메모리를 제거한다.
// 6) 실행종료
//    모든 메모리를 os에 반납한다.

// 메모리 영역은 세가지로 나눈다.
// 1) 메소드 영역
//    클래스 명령 코드를 둔다.
//    static 변수를 둔다

// 2) Heap
//    new 명령으로 만든 메모리(인스턴스=객체)를 둔다
//    garbage collector가 관리하는 영역이다.

// 3) Stack
//    스레드 별로 메모리를 따로 관리한다.
//    메서드의 로컬 변수를 둔다.
//    각 메서드마다 프레임 단위로 관리한다.
//    메서드 호출이 끝나면 그 메서드가 사용한 프로엠 메모리가 제거된다.
//    이렇게 메서드가 호출될 때 로컬 변수가 준비되고
//    맨 마지막에 호출한 메서드가 먼저 삭제된다고 해서
//    스택 메모리라고 부른다.
//    스택 = Last In First Out 후입선출이라 부른다.
//    JVM이 종료하면 사용했던 모든 메모리를 OS에 반납한다.
