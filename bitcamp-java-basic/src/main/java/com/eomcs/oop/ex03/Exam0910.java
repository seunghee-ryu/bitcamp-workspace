package com.eomcs.oop.ex03;

public class Exam0910 {
 static class Monitor {

   // 인스턴스 변수(클래스 변수 포함)가 생성되면 0으로 자동 초기화 된다.
   // 로컬 변수는 자동 초기화되지 않는다.

   int bright;
   int contrast;
   int widthRes;
   int heightRes;

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

   m1.bright = 50;
   m1.contrast = 50;
   m1.widthRes = 1920;
   m1.heightRes = 1080;

   m1.display();

 }

}
