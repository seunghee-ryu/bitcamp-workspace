package com.eomcs.util;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ArrayList<E> {
  // <E>로 변수를 선언하라

  private static final int DEFAULT_CAPACITY = 5;
  private Object[] elementData;
  private int size;

  public ArrayList() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(int initialCapacity) {
    if (initialCapacity < DEFAULT_CAPACITY) {
      elementData = new Object[DEFAULT_CAPACITY];
    } else {
      elementData = new Object[initialCapacity];
    }
  }

  public boolean add(E e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
    return true;
  }

  private void grow() {
    //System.out.println("오호라! 배열을 늘리자.");
    int newCapacity = elementData.length + (elementData.length >> 1);
    elementData = Arrays.copyOf(elementData, newCapacity);
    /*
    Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
    for (int i = 0; i < elementData.length; i++) {
      newArray[i] = elementData[i];
    }
    elementData = newArray;
     */
  }


  public void add(int index, E element) {
    if (size == elementData.length) {
      grow();
    }
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    for (int i = size; i > index ; i--) {
      elementData[i] = elementData[i - 1];
    }
    elementData[index] = element;
    size++;
  }

  @SuppressWarnings("unchecked")
  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    return (E) elementData[index];
  }

  @SuppressWarnings("unchecked")
  public E set(int index, E element) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Object old = elementData[index];
    elementData[index] = element;
    return (E) old;
  }

  @SuppressWarnings("unchecked")
  public E remove(int index) {
    Object old = elementData[index];

    System.arraycopy(
        elementData, // 복사 대상
        index + 1, // 복사할 항목의 시작 인덱스
        elementData, // 목적지
        index, // 복사 목적지 인덱스
        this.size - (index + 1) // 복사할 항목의 개수
        );
    /*
    for (int i = index; i < size - 1; i++) {
      elementData[i] = elementData[i + 1];
    }
     */

    size--;
    elementData[size] = null;
    // 쓰지 않는 인스턴스의 주소를 제거하여
    // 가비지 될 수 있게 한다.

    return (E) old;
  }

  public int size() {
    return this.size;
  }

  public Object[] toArray() {
    Object[] arr = Arrays.copyOf(elementData, this.size);
    //System.out.println(elementData == arr); //false
    return arr;
    /*
    Object[] arr = new Object[this.size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = elementData[i];
    }
    return arr;
     */
  }

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    if (arr.length < size) {
      // 새 배열을 만든다.
      // 배열 항목의 클래스 정보를 알려줘야 한다.
      arr = (E[]) Array.newInstance(arr.getClass().getComponentType(), this.size);
    }
    System.arraycopy(this.elementData,
        0,
        arr, //
        0, // 배열의 목적지
        this.size); // 최대 size만큼

    return arr;
  }
}





//public class ArrayList<E> {
//
//  static final int DEFAULT_CAPACITY = 3;
//  Object[] list;
//  int size = 0;
//
//  public ArrayList() {
//    list = new Object[DEFAULT_CAPACITY];
//  }
//
//  public ArrayList(int initialCapacity) {
//    if (initialCapacity <= DEFAULT_CAPACITY) {
//      list = new Object[DEFAULT_CAPACITY];
//    } else {
//      list = new Object[initialCapacity];
//    }
//  }
//
//  public void add(E obj) {
//    if (size == list.length) {
//      // 현재 배열에 객체가 꽉 찼으면, 배열을 늘린다.
//      int oldCapacity = list.length;
//      int newCapacity = oldCapacity + (oldCapacity >> 1);
//      list = Arrays.copyOf(list, newCapacity);
//    }
//    list[size++] = obj;
//  }
//
//  public E[] toArray(Class<E[]> arrayType) {
//    //    Object[] arr = new Object[size];
//    //    for (int i = 0; i < size; i++) {
//    //      arr[i] = list[i];
//    //    }
//    //    return arr;
//
//    return Arrays.copyOf(list, size, arrayType);
//  }
//}
//
//
//
//
