// 로컬 변수 선언

package com.eomcs.basic.ex04;

public class Exam0810 // 클래스 선언
{// 클래스 블럭 -> 클래스 정의

  static int x;


  public static void main(String[] args) // 메서드 선언
  {// 메서드 블럭 -> 메서드 정의

    int a;

    int x; // 같은 메서드 블록에 소속된 로컬 변수가 아니라면 같은 이름으로 변수를 선언할 수 있다.
           // static int x; 와 int x;는 다른 변수

    // int a; // 컴파일 오류 -> 문법오류
    // 같은 블록에 이름이 같은 변수를 중복 선언할 수 없다.


    { // 로컬 블럭

      // int a; //바깥 블럭에 선언된 변수와 같은 이름을 가질 수 없다.

      int b;

      {
        // int b; // 바깥 블럭에 선언된 변수와 같은 이름을 가질 수 없다.
        // int a;
        int c; // 블럭 안에 선언된 변수를 블럭을 나가는 순간 자동 삭제된다.
        int d;
      }

      // c = 100; // 컴파일 오류
      // 블럭 안에 선언된 변수는 블럭을 나가는 순간 자동 삭제되기 때문에
      // c = 100;이 컴파일 오류가 난다.

      b = 100; // 같은 블럭 안

      int c; // 따라서 이 c 변수는 위에서 선언한 하위 블록의 c 변수와 다르다.

      {
        int d; // 이전 블럭에서 만든 d 변수는 이미 삭제되었기 때문에
               // 이 블럭에서 같은 이름으로 변수를 만들 수 있다.
      }

      a = 100;
      b = 200;
      c = 300;
      // d = 400; // 컴파일 오류



      {
        {
          // 로컬 블럭 안에 언제든지 하위 블럭을 만들 수 있다.

        }
      }
    }


    int i;
    for (i = 0; i < 10; i++) {
      System.out.println(i);
    }

    System.out.println(i); // int i가 for 문 밖에서 선언되었기 때문에 접근 가능


    for (int k = 0; k < 10; k++) { // for 문 안에서 int k를 선언했기 때문에
      System.out.println(k);
    }

    // System.out.println(k); // k에 접근할 수 없다.

    // int age = 20;
    // int m;

    // if (age > 19) {
    // m = 200;
    // int n= 300;


    // System.out.println(m); // m이 초기화되지 않아서 문법 오류가 난다.


    int age = 20;
    int m = 0;

    if (age > 19) {
      m = 200;
      int n = 300;
    }

    System.out.println(m); // m이 초기화되어 있다.
    // System.out.println(n); // 컴파일 오류 // n이 선언된 블럭이 종료되었기 때문에

  }



}

