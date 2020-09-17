package com.eomcs.basic.ex05;

public class Exam0220t {
  public static void main(String[] args) {
    
    double d1 = 987.6543;
    double d2 = 1.111111;
    System.out.println((d1 + d2) == 988.765411);
    // 결과는 false
    // 부동소수점 연산에서 왜곡이 발생하여
    // d1 + d2는 988.7654110000001이 된다.
    System.out.println(d1 + d2);
    
    
    double x = 234.765411;
    double y = 754.0;
    System.out.println((x + y) == 988.765411);
    System.out.println(x + y);
    
    System.out.println((d1 + d2) == (x + y));
    // false
    
    double EPSILON = 0.00001;
    System.out.println(Math.abs((d1 + d2) - (x + y)) < EPSILON);
    
    System.out.println(Math.abs(-100));
    System.out.println(Math.abs(+100));
    
    
    
    
  }

}
