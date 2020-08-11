package com.eomcs.oop.ex04;

public class Exam0220 {
  public static void main(String[] args) throws Exception {
    Integer i1 = Integer.valueOf(100);
    Integer i2 = Integer.valueOf(200);
    Integer i3 = Integer.valueOf(300);

    System.out.println(i2.compareTo(i1));
    System.out.println(i2.compareTo(i3));

    int v1 = i2.intValue();
    System.out.println(v1);

    int v2 = Integer.parseInt("1280");
    String s1 = Integer.toBinaryString(77);
    String s2 = Integer.toOctalString(77);
    String s3 = Integer.toHexString(77);
    System.out.printf("77 = %s, %s, $s\n", s1, s2, s3);

    Integer x1 = Integer.valueOf("44");
    Integer x2 = Integer.valueOf("44", 16);
    System.out.printf("%d, %d\n", x1, x2);

    float f = Float.parseFloat("3.14f");
    boolean b = Boolean.parseBoolean("true");
    System.out.printf("%f, %b\n", f, b);

  }

}
