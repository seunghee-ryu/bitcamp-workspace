package com.eomcs.oop.ex06.a;

public class Exam0512 {
  public static void main(String[] args) {
    Vehicle v = new Sedan();

    System.out.println(v.getClass() == Sedan.class);
    System.out.println(v.getClass() == Car.class);
    System.out.println(v.getClass() == Vehicle.class);
    System.out.println(v.getClass() == Truck.class);
    System.out.println(v.getClass() == Bike.class);

  }

}
