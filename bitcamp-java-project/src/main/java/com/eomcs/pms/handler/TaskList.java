package com.eomcs.pms.handler;

import java.util.Arrays;
import com.eomcs.pms.domain.Task;

public class TaskList {
  static final int DEFAULT_CAPACITY = 100; // TLENGTH 를 LENGTH 로 변경한다.

  Task[] list = new Task[DEFAULT_CAPACITY]; // tasks 를 list 로 변경한다.
  int size = 0;

  public TaskList() {
    list = new Task[DEFAULT_CAPACITY];
  }

  public TaskList(int initialCapacity) {
    if (initialCapacity <= DEFAULT_CAPACITY) {
      list = new Task[DEFAULT_CAPACITY];
    } else {
      list = new Task[initialCapacity];
    }
  }

  public void add(Task task) {
    if (size == list.length) {
      int oldCapacity = list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      list = Arrays.copyOf(list, newCapacity);
    }
    list[size++] = task;
  }

  public Task[] toArray() {
    return Arrays.copyOf(list, size);
  }

}
