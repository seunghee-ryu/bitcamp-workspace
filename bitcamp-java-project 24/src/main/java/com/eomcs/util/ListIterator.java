package com.eomcs.util;

import java.util.NoSuchElementException;

public class ListIterator<E> implements Iterator<E> {

  // List 객체에서 값을 꺼내는 클래스를 정의한다.
  // => 이터레이터 계약에 따라 동작하는 클래스다.
  // => 인터페이스를 구현하는 클래스를 보통 그 인터페이스의 구현체라 부른다.
  // => 즉 다음 클래스는 이터레이터의 구현체이다.

  List<E> list;
  int cursor; // 데이터 목록에서 값을 꺼낼 위치를 가리킨다.(인덱스)

  public ListIterator(List<E> list) {
    this.list = list;
  }

  @Override
  public boolean hasNext() {
    /*
     * if (cursor < list.size())
     *
     *
     */
    return cursor < list.size();
  }

  @Override
  public E next() {
    if (cursor == list.size())
      throw new NoSuchElementException();
    return list.get(cursor++); // 순차적으로 조회하기 때문에 다음 것을 꺼내기 위해 ++이 붙는다.
  }

}
