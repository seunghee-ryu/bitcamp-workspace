package com.eomcs.util;

import java.lang.reflect.Array;

public class LinkedList<E> extends AbstractList<E> {

  // 값을 찾을 때는 첫 번째 노드부터 따라간다.
  private Node<E> first;

  // 값을 추가할 때는 마지막 노드에 연결한다.
  private Node<E> last;

  // 용도?
  // - Node 클래스는 목록에서 각 항목의 값을 보관하는 객체로 역할을 수행한다.
  // 스태틱 클래스?
  // - 여러 개의 MyLinkedList 객체가 공유하는 클래스이므로
  //   스태틱으로 Node 클래스를 설계한다.
  static class Node<E> {
    E value;
    Node<E> next;

    public Node() {}

    public Node(E value) {
      this.value = value;
    }
  }

  @Override
  public boolean add(E e) {
    Node<E> node = new Node<>();
    node.value = e;

    if (first == null) {
      first = node;
    } else {
      last.next = node;
    }
    last = node;

    size++;

    return true;
  }

  @Override
  public E get(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node<E> cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

  @Override
  public void add(int index, E element) {
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node<E> node = new Node<>(element);

    size++;

    if (index == 0) {
      node.next = first;
      first = node;
      return;
    }

    Node<E> cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {
      cursor = cursor.next;
    }

    node.next = cursor.next;
    cursor.next = node;

    if (node.next == null) {
      last = node;
    }
  }

  @Override
  public E remove(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    size--;

    if (index == 0) {
      Node<E> old = first;
      first = old.next;
      old.next = null; // 가비지가 다른 인스턴스를 가리키지 않게 한다.
      return old.value;
    }

    Node<E> cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {
      cursor = cursor.next;
    }

    Node<E> old = cursor.next;
    cursor.next = old.next;
    old.next = null; // 가비지가 다른 인스턴스를 가리키지 않게 한다.

    if (cursor.next == null) {
      last = cursor;
    }

    return old.value;
  }

  @Override
  public E set(int index, E element) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node<E> cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }

    E old = cursor.value;
    cursor.value = element;

    return old;
  }

  @Override
  public Object[] toArray() {
    Object[] arr = new Object[this.size];

    int i = 0;
    Node<E> cursor = first;

    while (cursor != null) {
      arr[i++] = cursor.value;
      cursor = cursor.next;
    }

    return arr;
  }

  @Override
  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {

    if (arr.length < this.size) {
      arr = (E[]) Array.newInstance(arr.getClass().getComponentType(), size);
    }

    Node<E> cursor = first;
    for (int i = 0; i <size; i++) {
      arr[i] = cursor.value;
      cursor = cursor.next;
    }

    return arr;
  }

//  // Object.clone()의 'shallow copy' 이용하여 스택 객체 복사하기
//  // => 객체의 인스턴스 변수를 그대로 복제한다.
//  // => 인스턴스 변수가 가리키는 객체는 복제하지 않는다.
//  //
//  // 문제점?
//  // => 따라서 Node 객체들을 공유하기 때문에 Node 객체의 상태가 변경되면 원본 연결 리스트도 영향을 받는다.
//  //
//  @SuppressWarnings("unchecked")
//  @Override
//  public LinkedList<E> clone() throws CloneNotSupportedException {
//    return (LinkedList<E>) super.clone();
//  }

  // Object.clone()을 오버라이딩 할 때 'deep copy' 이용하여 스택 객체 복사하기
  // => 새 연결 리스트를 만들어 원본에 보관된 값을 복사한다.
  // => 따라서 복사본의 Node 객체는 원본의 Node 객체와 다르다.
  //    복사본의 상태 변경에 원본은 영향 받지 않는다.
  //
  @SuppressWarnings("unchecked")
  @Override
  public LinkedList<E> clone() throws CloneNotSupportedException {
    LinkedList<E> newList = new LinkedList<>();
    Object[] values = this.toArray();
    for (Object value : values) {
      newList.add((E) value);
    }
    return newList;
  }



}





