package com.eomcs.basic.ex03;

//프로젝트 익스플로러에서 복사 붙여넣기를 하면 클래스 이름이 자동으로 맞춰진다.

//#문자 리터럴
public class Exam0420 {
  private static final String A = null;
  private static char[] ch1;

  public static void main(String[] args) {
    System.out.println(0x41);
    System.out.println(65);
    
    System.out.println((char)0x41);
    System.out.println((char)65);
    System.out.println((char)0xd5d0);
    
    System.out.println('A'); // 'A' => (char)0x41

    
    //do it 예제
    
    char ch1 = 'A';
    System.out.println(ch1);
    System.out.println((int)ch1);
    
    char ch2 = 66;
    System.out.println(ch2);
    
    int ch3 = 67;
    System.out.println(ch3);
    System.out.println((char)ch3);
    

    
    
    
  }
}

// single quatation('') 연산자의 역할은?
// => 문자의 코드 값을 리턴해주는 일을 한다.

