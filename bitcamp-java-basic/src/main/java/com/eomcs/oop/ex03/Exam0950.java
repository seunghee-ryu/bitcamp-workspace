package com.eomcs.oop.ex03;

public class Exam0950 {
 static class Monitor {

   int bright;
   int contrast = 50;
   int widthRes;
   int heightRes = 1080;

   Monitor(int bright, int contrast) {
     this.bright = bright;
     this.contrast = contrast;
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
   Monitor m = new Monitor(50, 50);
   m.display();
 }

}
