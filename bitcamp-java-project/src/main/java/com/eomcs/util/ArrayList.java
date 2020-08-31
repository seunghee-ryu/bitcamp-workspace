package com.eomcs.util;

import java.util.Arrays;

public class ArrayList<E> {

  static final int DEFAULT_CAPACITY = 3;
  Object[] list;
  int size = 0;

  public ArrayList() {
    list = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(int initialCapacity) {
    if (initialCapacity <= DEFAULT_CAPACITY) {
      list = new Object[DEFAULT_CAPACITY];
    } else {
      list = new Object[initialCapacity];
    }
  }

  public void add(E obj) {
    if (size == list.length) {
      // 현재 배열에 객체가 꽉 찼으면, 배열을 늘린다.
      int oldCapacity = list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      list = Arrays.copyOf(list, newCapacity);
    }
    list[size++] = obj;
  }

  public E[] toArray(Class<E[]> arrayType) {
    //    Object[] arr = new Object[size];
    //    for (int i = 0; i < size; i++) {
    //      arr[i] = list[i];
    //    }
    //    return arr;

    return Arrays.copyOf(list, size, arrayType);
  }
}




