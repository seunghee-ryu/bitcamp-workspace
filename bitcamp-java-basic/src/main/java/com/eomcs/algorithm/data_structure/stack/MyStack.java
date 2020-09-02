package com.eomcs.algorithm.data_structure.stack;

import java.util.EmptyStackException;
import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

public class MyStack<E> extends MyLinkedList<E> implements Cloneable {

  public E push(E item) {
    add(item);
    return item;
  }

  public E pop() {
    if (size() == 0) {
      throw new EmptyStackException();
    }
    return remove(size() - 1);
  }

  public E peek() {
    if (size() == 0) {
      throw new EmptyStackException();
    }
    return get(size() - 1);
  }

  public boolean empty() {
    return this.size() == 0;
  }

  @SuppressWarnings("unchecked")
  @Override
  public MyStack<E> clone() throws CloneNotSupportedException {
    // 새 스택을 만든다.
    MyStack<E> newStack = new MyStack<E>();

    // 기존 스택의 값을 가져온다.
    Object[] values = this.toArray();

    for (Object value : values) {
      newStack.push((E)value);
    }
    return newStack;
  }


}
