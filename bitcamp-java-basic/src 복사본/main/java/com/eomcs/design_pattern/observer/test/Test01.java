package com.eomcs.design_pattern.observer.test;

public class Test01 {

  public static void main(String[] args) {
    Car car = new Car();

    car.addCarObserver(new SafeBeltCarObserver());

    car.addCarObserver(new EnginOilCarObserver());

    car.addCarObserver(new SunRoofCloseCarObserver());

    car.addCarObserver(new BrakeOilCarObserver());

    car.addCarObserver(new LightOffCarObserver());

    car.start();

    car.run();

    car.stop();

  }

}


