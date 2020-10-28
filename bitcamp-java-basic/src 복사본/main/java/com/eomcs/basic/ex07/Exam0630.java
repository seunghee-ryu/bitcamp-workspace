package com.eomcs.basic.ex07;

public class Exam0630 {
  public static void main(String[] args) {
    // 기본으로 설정된 프로퍼티를 모두 출력

    java.util.Properties props = System.getProperties();
    java.util.Set keySet = props.keySet();

    for (Object key : keySet) {
      String value = System.getProperty((String) key);
      System.out.printf("%s = %s\n", key, value);
    }

  }

}
