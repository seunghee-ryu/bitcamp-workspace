package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Member;

public class MemberList {

  static final int DEFALUT_CAPACITY = 100;

  Member[] list;
  int size = 0;

  public MemberList() {
    list = new Member[DEFALUT_CAPACITY];
  }

  public MemberList(int initialCapacity) {
    if (initialCapacity <= DEFALUT_CAPACITY ) {
      list = new Member[DEFALUT_CAPACITY ];
    } else {
      list = new Member[initialCapacity];
    }
  }

  public void add(Member member) {
    list[size++] = member;
  }

  public Member[] toArray() {
    Member[] arr = new Member[size];
    for (int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }

}
