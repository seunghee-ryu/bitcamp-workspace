package com.eomcs.basic.ex07;

public class Exam0420 {
  static int[] getArray() {
    int[] arr = new int[] {100, 200, 300};
    return arr;
  }

  public static void main(String[] args) {
    int[] arr;
    arr = getArray();
    System.out.println(arr[1]); //200
  }

}

/*
 *
 * 1) 메인() 호출
 *      스택에 args, arr 변수 생성
 *
 * 2) getArray() 호출
 *      스택에 arr 변수 생성
 *      힙에 new int[] 배열 생성
 *
 * 3) getArray() 호출 끝
 *      Stack : getArray() 관련 메모리(arr 변수) 제거
 *      new int[] 배열 주소 리턴
 *
 * 4) 메인() 호출 끝
 *      Stack : 메인() 관련 메모리 제거
 *
 * 5) 종료
 *      모든 사용 메모리 반납
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
