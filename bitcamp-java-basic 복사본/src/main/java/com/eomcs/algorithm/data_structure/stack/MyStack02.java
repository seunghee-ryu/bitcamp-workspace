package com.eomcs.algorithm.data_structure.stack;

// 1) stack을 구현하기 위해 기존에 작성한 MyLinkedlist를 상속받는다.
// 2) stack에 값을 추가하는 push() 메서드를 정의한다.

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

public class MyStack02 extends MyLinkedList {

  public Object push(Object item) {
    add(item);
    return item;
  }


}
