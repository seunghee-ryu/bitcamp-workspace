package com.eomcs.basic.ex07;

// call by value vs. call by reference

public class Exam0310 {
  static void swap(int a, int b) {
    System.out.printf("swap(): a=%d, b=%d\n", a, b);
    int temp = a;
    a = b;
    b = temp;
    System.out.printf("swap(): a=%d, b=%d\n", a, b);
  }

  public static void main(String[] args) {
    int a = 100;
    int b = 200;

    // swap() 호출할 때 a 변수의 값과 b 변수의 값을 넘긴다.
    // 그래서 call by value라고 불린다
    // 비록 swap()에서 a와 b라는 이름의 변수가 있지만,
    // 이 변수는 main()에 있는 변수와 다른 변수이다.
    // 자바에서는 메모리(변수) 주소를 넘기는 방법이 없다.


    swap(a, b);
    System.out.printf("main(): a=%d, b=%d\b", a, b);
  }


}

  /*
  static class Person { // 새로운 타입의 메모리를 설계
    String name;
    int age;
    boolean working;
  }


  public static void main(String[] args) {
    int a = 200;

    m1(a); // call by value

    System.out.println(a); // a 는 local 변수, 메소드 호출이 끝나면 사라진다.

    a = 300;

    m1(a);

    System.out.println(a);

    int[] arr = new int[3]; // new 명령어로 만드는 모든 변수는 Heap이라는 곳에 만들어진다.
    arr[0] = 100;
    arr[1] = 200;
    arr[2] = 300;

    m2(arr); // call by reference

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    System.out.println("----------------------");

    Person p;
    p = new Person(); // Heap에 class 에 설계된 변수의 메모리가 만들어진다.

    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);

    m3(p); // call by reference

    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working); // 값이 바뀐다.

  }

  static void m1(int a) {
    a = 100;
  }

  static void m2(int[] arr) {
    arr[0] *= 2;
    arr[1] *= 3;
    arr[2] *= 4;

  }

  static void m3(Person p) {

    p.name = "홍길동";
    p.age = 20;
    p.working = true;

  }

}


// 시험지 :
// 1. 다음 계산을 수행하라.
//   a 변수에 100을 넣어라.
//   b 변수에 200을 넣어라.
//   a 와 b 를 더해 그 결과를 출력하라.

// 풀이 종이:
//
//
//
//

// 시험지와 풀이 종이의 메모리는 다른 것이다.
// 시험지의 명령어를 수행하는 동안 사용하는 메모리를 stack 이라고 한다.
 *
 */
