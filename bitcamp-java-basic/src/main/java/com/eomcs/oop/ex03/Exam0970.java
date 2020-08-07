package com.eomcs.oop.ex03;

public class Exam0970 {
 static class Monitor {

   int bright;
   int contrast = 50;
   int widthRes;
   int heightRes = 1080;

   Monitor() {
     this(50, 50, 2560, 1200);
     System.out.println("Monitor()");
   }

   Monitor(int bright, int contrast) {
     this(bright, contrast, 2560, 1200);
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
   System.out.println("---------------");
   Monitor m2 = new Monitor(50, 50);
   System.out.println("---------------");
   Monitor m3 = new Monitor(50, 50, 1920, 1080);
   System.out.println("---------------");

   m1.display();
   m2.display();
   m3.display();
 }

}
