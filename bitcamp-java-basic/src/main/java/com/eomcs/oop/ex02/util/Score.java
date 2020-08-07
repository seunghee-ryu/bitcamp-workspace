package com.eomcs.oop.ex02.util;

public class Score {

  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum = kor + eng + math;
  public float aver = sum / 3f;

  public void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}


/*
public class Score {

  //변수를 만들라는 설계도
  //데이터
  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum;
  public float aver;

  public void compute() {
    //this.sum은 heap에 있는 변수를 가리킨다.
    //this는 로컬변수
    //데이터를 다루는 연산자(오퍼레이터)
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }

}
*/