package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Project;

public class ProjectList {


  static final int DEFALUT_CAPACITY = 100;

  Project[] list;
  int size = 0;

  public ProjectList() {
    list = new Project[DEFALUT_CAPACITY ];
  }

  public ProjectList(int initialCapacity) {
    if (initialCapacity <= DEFALUT_CAPACITY ) {
      list = new Project[DEFALUT_CAPACITY];
    } else {
      list = new Project[initialCapacity];
    }
  }

  public void add(Project project) {
    list[size++] = project;
  }

  public Project[] toArray() {
    Project[] arr = new Project[size];
    for (int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }

}


