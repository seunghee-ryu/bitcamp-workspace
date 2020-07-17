// Exam0100.java
// 주제 : 리터럴

package com.eomcs.basic.ex03;

class Exam0100 { 
    public static void main(String[] args) {
        //출력명령문
        // -System.out.println(값);  

        //[숫자]
        // 정수
        // - 10진수 : 코드에서 일반적으로 정수값을 표현할 때 사용한다
        System.out.println(78); 
        System.out.println(+78);
        System.out.println(-78);
        
        // - 8진수 : 코드를 작성할 때 잘 사용하지 않는다.
        //        0으로 시작해야 한다.
        System.out.println(0116); 
        
        // - 16진수 : 2진수를 간결하게 표현하기 위해 사용한다.
        //         0x 또는 0X로 표현한다.
        //         숫자 앞에 0이 있어도 된다.
        System.out.println(0x4e); 
        System.out.println(0X04e);

        // - 2진수 : 메모리의 상태를 직설적으로 보여주고 싶을 때 사용한다.
        //        0b 또는 0B로 표현한다.
        //        숫자 앞에 0이 있어도 된다.
        System.out.println(0b1001110); 
        System.out.println(0B01001110);

        //정수 리터럴 자릿수 표시
        // - 정수를 읽기 쉽도록 밑줄(ungerscore; _)을 
        //   숫자 사이에 삽입할 수 있다.
        //   숫자 맨 앞 또는 맨 뒤에는 넣을 수 없다.

        System.out.println(12_3456_78);
        //System.out.println(_12345678);
        //System.out.println(12345678_);
        //System.out.println(0b_01001110);
        //System.out.println(0B_01001110_);
        //System.out.println(0x_42);
        //System.out.println(0X042_);



        // 부동소수점(실수)
        System.out.println(3.14);
        System.out.println(31.4e-1);
        System.out.println(314e-2);
        System.out.println(0.0314e2);


        //[논리]
        // - 참 / 거짓
        System.out.println(true);
        System.out.println(false);


        //[문자]
        // 문자
        System.out.println('A');
        System.out.println('가');
        // 문자열
        System.out.println("A");
        System.out.println("가");
        System.out.println("");
        System.out.println("ABC");
        System.out.println("가나다");
    }    
}
