package com.eomcs.oop.ex03;

public class Exam0930 {
 static class Monitor {

   // 초기화 문장?
   // 변수를 선언할 때 값을 설정하는 것을 초기화 문장이라고 부른다.

   int bright;
   int contrast;
   int widthRes;
   int heightRes;

   {
     this.bright = 50;

     if (this.bright < 50)
       this.contrast = 70;
     else
       this.contrast = 40;

     this.widthRes = 1920;
     this.heightRes = 1080;
   }

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

   m1.display();

   m1.bright = 40;

   m1.display();

 }

}
