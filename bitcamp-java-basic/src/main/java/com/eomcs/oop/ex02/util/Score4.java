package com.eomcs.oop.ex02.util;

public class Score4 {

  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum;
  public float aver;

  public void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }

  public Score4(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;

    this.compute();
  }

}

/*

public class Score4 { // 118

  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum;
  public float aver;

  public void compute() {

    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }

  //생성자 리턴 타입은 적지 않고 이름을 클래스와 같이 한다
  //인스턴스가 생성될 때 호출되는 메소드

  public Score4(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;

    this.compute();


  }

}
*/
