package com.eomcs.oop.ex03;

public class Exam0960 {
 static class Monitor {

   int bright;
   int contrast = 50;
   int widthRes;
   int heightRes = 1080;

   Monitor() {
     this.bright = 50;
     this.contrast = 50;
     this.widthRes = 2560;
     this.heightRes = 1200;
     System.out.println("Monitor()");
   }

   Monitor(int bright, int contrast) {
     this.bright = bright;
     this.contrast = contrast;
     System.out.println("Monitor(int, int");
   }

   Monitor(int bright, int contrast, int widthRes, int heightRes) {
     this.bright = bright;
     this.contrast = contrast;
     this.widthRes = widthRes;
     this.heightRes = heightRes;
     System.out.println("Monitor(int, int, int, int)");
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

   Monitor m1 = new Monitor();
   Monitor m2 = new Monitor(50, 50);
   Monitor m3 = new Monitor(50, 50, 1920, 1080);

   m1.display();
   m2.display();
   m3.display();
 }

}
