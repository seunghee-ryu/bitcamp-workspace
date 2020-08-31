package com.eomcs.pms.handler;

import java.util.Arrays;
import com.eomcs.pms.domain.Member;

public class MemberList {


  static final int DEFAULT_CAPACITY = 100;

  Member[] list = new Member[DEFAULT_CAPACITY]; // list로 이름을 바꾼다.
  int size = 0;

  public MemberList() {
    list = new Member[DEFAULT_CAPACITY];
  }

  public MemberList(int initialCapacity) {
    if (initialCapacity <= DEFAULT_CAPACITY) {
      list = new Member[DEFAULT_CAPACITY];
    } else {
      list = new Member[initialCapacity];
    }
  }

  public void add(Member member) {
    if (size == list.length) {
      int oldCapacity = list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      list = Arrays.copyOf(list, newCapacity);
    }
    list[size++] = member;
  }

  public Member[] toArray() {
    return Arrays.copyOf(list, size);
  }



}
