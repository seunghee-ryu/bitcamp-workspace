// 변수선언
// -데이터를 저장할 메모리를 확보하는 명령
// 
package com.eomcs.basic.ex04;

public class Exam0110 {
  public static void main(String[] args) {
    int i;
    int i2;
    int i3;
    
    int x, y, z;
    
    i = 100; //값 
    x = i; //변수
    y = i * x; //표현식
    
    
    byte b1;
    byte b2;
    
    b1 = 10; // [00001010]
    b2 = 12; // [00001100]
    b1 = b2; //b1 => [00001100] 로 바
    
    i = b1; // [00000000 00000000 00000000 00001100]
    
    //b2 = i; 큰 값을 작은 값에 넣으려고 하면 에러가 난다
    
    b2 = (byte)i; //강제로 명령어를 주면 가능은 하다.
    
    int a = 100; // 자바 버추얼 머신아, 정수값을 담을 4바이트 모리를 준비해
                 // 그 메모리의 이름은 a고 a에 100을 넣어라
    int b = 200; // 자바 버추얼 머신아, 정수값을 담을 4바이트의 메모리를 준비하고 
                 // 그 메모리의 이름은 b고,b에 200을 넣어라
    
    int aa, bb = 100, cc = 200, dd;
    
    byte xx = 10; // 00001010
    xx = 12; // 00001100
    xx = 78; // 01001110 
    
    int h;
    
    int h1;
    int h2;
    int h3;
    
    int d1, d2, d3;
    
    int age;
    age = 20;
    
    int age1 = 20;
    
    int b1 = 100, b2 = 200;
    
    int c1, c2 = 100, c3, c4 = 400, a5;
    
    int age2;
    age2 = 20;
    age2 = 30;
    
    int age3;
    int weight;
    int height;
    
    age3 = 20;
    weight = 100;
    height = 200;
    
    count = 50;
    int count;
    count = 50;
    
    int age4;
    int age4;
    
    int age5;
    System.out.println(age5);
    
    int age6 = 20;
    int age7 = age6;
    
    age6 = 30;
    
    System.out.println(age6);
    System.out.println(age7);
    
    
    
    
    //0110~0150?
    
    /* 
     * package com.eomcs.basic.ex04;
     * public class Exam0110 {
     *  public static void main(String[] args) {
     *    int i;
     *    
     *    int = 값을 저장할 메모리의 종류. 데이터 타입
     *    i = 메모리를 가리키는 이름. 변수
     *    
     *  }
     *}
     *
     *package com.eomcs.basic.ex04;
     *public class Exam0120 {
     *  public static void main(String[] args) {
     *  int i1;
     *  int i2;
     *  int i3;
     *  
     *  int j1, j2, j3;
     *  
     *  한번에 한개씩 변수를 선언할 수도 있고 콤마를 이용해 여러개를 선언할 수도 있다
     *  }
     *}
     *
     *package com.eomcs.basic.ex04;
     *public class Exam0130 {
     *  public static void main(String[] args) {
     *    int age;
     *    age = 20;
     *    
     *    변수명 = 변수 또는 리터럴
     *    
     *  }
     *}
     *
     *package com.eomcs.basic.ex04;
     *public class Exam0140 {
     *  public static void main(String[] args) {
     *    int age = 20;
     *    변수 선언과 값 저장을 한번에 하는 것을 변수 초기화 문장이라고 한다
     *    
     *  }
     *}
     *
     *package com.eomcs.basic.ex04;
     *public class Exam0150 {
     *  public static void main(String[] args) {
     *    int a = 100, a2 = 200;
     *    여러개의 변수를 선언하고 값을 동시에 저장할 수 있다
     *  }
     *}
     *
     *package com.eomcs.basic.ex04;
     *public class Exam0160 {
     *  public static void main(String[] args) {
     *    int a1, a2 = 200, a3, a4 = 400, a5;
     *    모든 변수를 다 초기화시킬 필요는 없다
     *  }
     *}
     *
     *package com.eomcs.basic.ex04;
     *public class Exam0170 {
     *  public static void main(String[] args) {
     *    int age;
     *    age = 20;
     *    age = 30; <할당연산자를 사용하면 언제든지 해당 메모리에 다른 값을
     *               지정할 수 있다
     *  }
     *}
     *
     *package com.eomcs.basic.ex04;
     *public class Exam0210 {
     *  public static void main(String[] args) {
     *    int age; <변수를 시작지점에 미리 선언해도 된다
     *    int weight;
     *    int height;
     *    
     *    age = 20;
     *    weight = 100;
     *    height = 200;
     *    
     *    int score; <변수가 필요할 때 중간 부분에 언제든 선언 가능
     *    score = 100;
     *  }
     *}
     *
     *package com.eomcs.basic.ex04;
     *public class Exam0220 {
     *  public static void main(String[] args) {
     *    count = 50; <변수값을 미리 지정할 수는 없다
     *    
     *    
     *    int count; <변수선언을 한 다음 변수값을 지정해야 한다
     *    count = 50;
     *  }
     *}
     *
     *package com.eomcs.basic.ex04;
     *public class Exam0230 {
     *  public static void main(String[] args) {
     *  int age;
     *  int age; < 문법오류
     *  }
     *}
     *package com.eomcs.basic.ex04;
     *public class Exam0310 {
     *  public static void main(String[] args) {
     *    int age = 20;
     *    System.out.println(age);
     *    
     *    println 은 메서드(도구)
     *    -콘솔로 값을 출력할 때 사용하는 도구이다
     *    -즉 JVM의 표준 출력 장치로 값을 출력한다
     *    -System.out.println(리터럴 또는 변수, 결과가 생성되는 명령문)
     *    
     *    
     *package com.eomcs.basic.ex04;
     *public class Exam0320 {
     *  public static void main(String[] args) {
     *    int age1 = 20;
     *    int age2 = age1;
     *    
     *    r-value 자리에 변수를 놓을 수 있다
     *    age1에 저장된 값을 age2에 복사하라
     *    age1과 age2는 같은 메모리가 아니다
     *    이것을 증명하기 위해 age1의 값을 변경한다
     *    age1 = 30;
     *    
     *    System.out.println(age1);
     *    System.out.println(age2);
     *  }
     *}
     *    
     *    
     *    
     *    
     *    
     *    
     *    
     *    
     * 
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}

