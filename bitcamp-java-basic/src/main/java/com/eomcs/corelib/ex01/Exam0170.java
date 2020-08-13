// Object 클래스 - clone() 사용법 I
package com.eomcs.corelib.ex01;

// clone()은 인스턴스를 복제할 때 호출하는 메서드이다.

public class Exam0170 {

  static class Score {

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    public Score() {}

    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
    }

    @Override
    public String toString() {
      return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng
          + ", sum=" + sum + ", aver=" + aver + "]";
    }
  }

  public static void main(String[] args) {

    Score s1 = new Score("홍길동", 100, 100, 100);
    System.out.println(s1);

    Score s2 = new Score(s1.name, s1.kor, s1.eng, s1.math);
    System.out.println(s1 == s2);

    System.out.println(s1);
    System.out.println(s2);
  }


}

//  static class Score {
//
//    String name;
//    int kor;
//    int eng;
//    int math;
//    int sum;
//    float aver;
//
//    public Score() {}
//
//    public Score(String name, int kor, int eng, int math) {
//      this.name = name;
//      this.kor = kor;
//      this.eng = eng;
//      this.math = math;
//      this.sum = this.kor + this.eng + this.math;
//      this.aver = this.sum / 3f;
//    }
//
//    @Override // 오브젝트에서 상속받은 투스트링을 오버라이딩 안하면 해시코드 값을 내놓는다.
//    public String toString() {
//      return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
//          + sum + ", aver=" + aver + "]";
//    }
//  }
//
//  public static void main(String[] args) {
//
//    Score s1 = new Score("홍길동", 100, 100, 100);
//    System.out.println(s1);
//
//    // 인스턴스 복제
//    // 방법1:
//    // => 직접 복제한다. 즉 새 객체를 만들어 기존 객체의 값을 저장한다.
//    Score s2 = new Score(s1.name, s1.kor, s1.eng, s1.math); // 빈 객체 생성
//
//    // s1과 s2는 서로 다른 인스턴스이다.
//    System.out.println(s1 == s2);
//
//    // s1과 s2에 들어 있는 값은 같다.
//    System.out.println(s1);
//    System.out.println(s2);
//
//    // 방법2:
//    // Object에서 상속 받은 clone()을 호출한다.
//    // Score s3 = s1.clone(); // 컴파일 오류! // 자기 것이 아니라 스코어 것이라서 호출이 안된다.
//
//    // Object에서 상속 받은 clone()은 protected 이다.
//    // 따라서 같은 패키지에 소속된 클래스이거나 상속 받은 서브 클래스가 아니면 호출할 수 없다.
//
//    // 해결책:
//    // => Object에서 상속 받은 clone()을 오버라이딩 하라!
//    // => Test0171.java 를 살펴보라!
//  }
//
////  void m() throws Exception{
////    this.clone(); // 자기 것으로 클론을 호출하기 때문에 에러가 안 난다.
////  }
//}






