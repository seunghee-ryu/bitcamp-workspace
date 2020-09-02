package com.eomcs.util;

// 1) Queue를 구현하기 위해 기존에 작성한 MyLinkedList를 상속받는다.
// 2) Queue에서 값을 추가하는 offer(Object)를 정의한다.
// 3) Queue에서 값을 꺼내는 poll()을 정의한다.
// 4) Queue에서 제일 앞에 있는 값을 조회하는 peek을 정의한다.


public class Queue<E> extends LinkedList<E> implements Cloneable {

  public boolean offer(E e) {
    // 마이큐가 마이링크드리스트에서 사용할 수 있는것은 퍼블릭으로 선언된 것
    // 내장변수this를 사용해서 add 인스턴스 변수를 호출해야 한다.
    // 인스턴스 메소드나 인스턴스 필드는 인스턴스 주소를 앞에 꼭 붙여야 한다.
    // this는 생략 가능
    return this.add(e);

  }

  public E poll() {
    if (size() == 0) {
      return null;
    }
    return (E) remove(0);

  }

  public E peek() {
    if (size() == 0) {
      return null;
    }
    return get(0);
  }

  @SuppressWarnings("unchecked")
  @Override
  public Queue<E> clone() throws CloneNotSupportedException {
    Queue<E> newQueue = new Queue<>();
    Object[] values = this.toArray();
    for (Object value : values) {
      newQueue.offer((E)value);
    }
    return newQueue;
  }






}