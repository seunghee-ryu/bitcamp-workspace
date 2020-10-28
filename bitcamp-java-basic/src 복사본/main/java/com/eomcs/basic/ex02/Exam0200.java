// Exam0200.java
// 주제 : javadoc 주석 (/** */은 메뉴얼을 만들 때 사용하는 주석)
//        이 주석은 도구(javadoc.exe)를 사용해서 추출(.html)하는 것이 가능하다.

package com.eomcs.basic.ex02;


/**
클래스에 대한 설명
클래스에 대한 설명
<p>중간에 html 태그를 넣을 수 있다</p>
클래스에 대한 설명

@author 홍길동
 */
public class Exam0200 { 
    
    /**
    필드에 대한 설명<br>
    <b>필드</b>에 대한 설명<br>

     */
    int a;

    /**
    메서드에 대한 설명<br>
    <i>메서드</i>에 대한 설명<br>
    메서드에 대한 설명


    @param args 파라미터에 대한 설명
     */

    public static void main(String[] args) {

    }

    /**
    메서드 설명
    메서드 설명...ok
     */
     public void m() {
         //...
     }


}


