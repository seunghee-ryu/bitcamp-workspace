package com.eomcs.basic.ex04;

public class Exam0412 {
  public static void main(String[] args) {
    byte b;
    short s;
    
    b = 127; 
    //1바이트의 수용범위 내의 숫자라면 4바이트 리터럴이라도 표현가능
    s = 32767;
    //2바이트의 수용범위 내의 숫자라면 4바이트 리터럴이라도 표현가
    
    
    //b = 127L;
    
    //8바이트 정수 리터럴인 경우 값의 크기와 상관없이 컴파일 오류가 뜬다
    //8바이트 정수 리터럴은 임시 메모리에 저장되는 순간 8바이트가 되기 때문?
    
    
  }
}

