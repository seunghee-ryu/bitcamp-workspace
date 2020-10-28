package com.eomcs.corelib.ex03;

import java.util.ArrayList;

public class MyArrayListTest4 {
  public static void main(String[] args) {
    // aaa, bbb, ccc, ddd, eee

    ArrayList list1 = new ArrayList();
    list1.add("aaa"); // aaa
    list1.add("bbb"); // aaa, bbb
    list1.add("ccc"); // aaa, bbb, ccc
    list1.add("ddd");
    list1.add("eee");
    list1.add("fff");
    list1.add("ggg");

    System.out.println("-----");

    // eee, fff, ggg, hhh, iii
    ArrayList list2 = new ArrayList();
    list2.add("fff");
    list2.add("ggg");
    list2.add("hhh");
    list2.add("iii");
    list2.add("jjj");
    list2.add("kkk");
    list2.add("lll");

    print(list1);
    System.out.println("-----");
    print(list2);

  }

  static void print(ArrayList list) {
    for (int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.print(str + ", ");
    }
    System.out.println();
  }

}
