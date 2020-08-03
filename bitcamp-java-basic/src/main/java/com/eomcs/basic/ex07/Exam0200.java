package com.eomcs.basic.ex07;

public class Exam0200 {
  public static void main(String[] args) {


    // m1          ();
    // 메소드      아규먼트
    // static   void        m1           ()
    //          리턴 타입   메소드명     파라미터(아규먼트 값을 받는 변수)

    // void 는 아무것도 받지 않고 아무것도 리턴하지 않는다.


    // 1)
    m1();
    // m1("홍길동");
    // int r = m1();


    // 2)
    m2("홍길동");
    //m2();
    //m2(100);
    //int r = m2("홍길동");


    // 3)
    String message = m3();
    System.out.println(message);

    message = m3();
    m3();

    //int r = m3();
    // message = m3(100);


    // 4)
    message = m4("홍길동");
    System.out.println(message);


    // 5)
    message = m5("홍길동", 20, false);
    System.out.println(message);


    // 6) 가변 파라미터
    m6("홍길동", 100, 90, 80);
    // int aver = m6("홍길동");


    // 7) 가변 파라미터
    m7("홍길동", new int[] {100, 90, 80, 70, 60}); // 배열의 주소가 들어간다.
    m7("홍길동", new int[] {100, 90, 80});
    m7("홍길동", new int[] {100, 90});
    m7("홍길동", new int[] {});

    System.out.println("--------------------");

    // 파라미터의 갯수가 변할 수 있다 = 가변 파라미터
    // 메소드 안에서는 배열로 다룬다.
    m8("홍길동", 100, 90, 80, 70, 60);
    m8("홍길동", 100, 90, 80);
    m8("홍길동", 100, 90);
    m8("홍길동", 100);
    m8("홍길동");


    m10(new int[] {100, 90, 80}, new String[] {"국어", "영어", "수학"}, "홍길동");







  }

  static void m1() { //
    System.out.println("Hello!");
  }

  static void m2(String name) {
    System.out.println(name + "님 반갑습니다.");
  }

  static String m3() {
    return "안녕";
  }

  static String m4(String name) {
    return name + "님 반갑습니다.^^";
  }

  static String m5(String name, int age, boolean working) {
    return age + "살 " + name + "님은 현재 재직 상태가" + working + "입니다.";
  }

  static void m6(String name, int a, int b, int c) {
    int sum = a + b + c;
    int aver = sum / 3;
    System.out.printf("%s: %d(%d)\n", name, sum, aver);
  }

  static void m7(String name, int[] scores) {
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }

    int aver = 0;
    if (scores.length > 0) {
      aver = sum / scores.length;
    }
    System.out.printf("%s: %d(%d)\n", name, sum, aver);
  }

  static void m8(String name, int... scores) {
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }

    int aver = 0;
    if (scores.length > 0) {
      aver = sum / scores.length;
    }
    System.out.printf("%s: %d(%d)\n", name, sum, aver);

  }
  /*
  //가변 파라미터는 무조건 맨 끝에 와야한다.
  static void m9(int...scores, String name) {
  }



  //가변 파라미터는 여러개를 선언할 수 없다.
  static void m9(int...scores, int... scores2) {
  }
  // m9(100, 90, 80); 일때 어디까지가 scores고 어디부터가 scores2 인지 알 수 없다.



  //가변 파라미터 중간에 다른 타입의 변수가 오더라도
  //가변 파라미터를 한 개 초과하여 둘 수 없다.
  static void m9(String...titles, String name, int...scores2) {
  }
  // m9("국어", "수학", "홍길동", 100, 90);
  */

  //배열은 정확한 주소를 넘기기 때문에 마음대로 위치를 바꿀 수 있지만
  //가변 파라미터는 맨 끝에 하나만 올 수 있다.


  static void m10(int[] scores, String[] titles, String name) {
    if (scores.length != titles.length) {
      System.out.println("과목수와 점수의 개수가 다릅니다.");
      return;
    }

    System.out.println(name + "님 점수");
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%s = %d 점\n", titles[i], scores[i]);
    }
  }


}
