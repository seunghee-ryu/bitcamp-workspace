package com.eomcs.oop.ex06.a;

public class Exam0115 {
  public static void main(String[] args) {

    Car c = new Sedan();

    c.model = "티코";
    c.capacity = 5;
    c.cc = 890;
    c.valve = 16;

//    c.sunroof = true;
//    c.auto = true;

    ((Sedan)c).sunroof = true;
    ((Sedan)c).auto = true;

    Sedan s = (Sedan)c;
    s.sunroof = true;
    s.auto = true;


  }

}
