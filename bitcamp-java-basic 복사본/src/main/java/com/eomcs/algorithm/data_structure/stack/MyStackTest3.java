package com.eomcs.algorithm.data_structure.stack;

public class MyStackTest3 {
  static public void main(String[] args) throws Exception {
    MyStack<String> stack = new MyStack<>();
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");
    stack.push("ddd");
    stack.push("eee");
//    stack.push(new Integer(100));
    print(stack);

    MyStack<String> stack2 = stack.clone();
    print(stack2);

    System.out.println(stack2.pop()); // eee
    System.out.println(stack2.pop()); // bbb
    System.out.println(stack2.pop()); // ccc
    print(stack2);

    System.out.println("--------------");
    print(stack);

  }

  static void print(MyStack<?> stack) {
    for (int i = 0; i < stack.size(); i++) {
      // stack.get()은 검사를 하지 않기 때문에 <?>을 해도 된다.
      System.out.print(stack.get(i) + ", ");
    }
    System.out.println();
  }

}
