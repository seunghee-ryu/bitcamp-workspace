package com.eomcs.oop.ex03;

public class Exam0920 {
 static class Monitor {

   // 초기화 문장?
   // 변수를 선언할 때 값을 설정하는 것을 초기화 문장이라고 부른다.

   int bright = 50;
   int contrast = 50;
   int widthRes = 1920;
   int heightRes = 1080;

   void display() {
     System.out.println("---------------");
     System.out.printf("밝기(%d)\n", this.bright);
     System.out.printf("명암(%d)\n", this.contrast);
     System.out.printf("해상도(%d x %d)\n", this.widthRes, this.heightRes);
     System.out.println("---------------");
   }
 }

 public static void main(String[] args) {
   // 모니터 인스턴스 생성
   Monitor m1 = new Monitor();

   // 출력 결과는 모두 0이다.
   m1.display();

   m1.bright = 40;

   m1.display();

 }

}
