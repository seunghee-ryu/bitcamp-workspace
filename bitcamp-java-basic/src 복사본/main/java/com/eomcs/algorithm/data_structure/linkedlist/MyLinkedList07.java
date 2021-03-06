package com.eomcs.algorithm.data_structure.linkedlist;

// 01) LinkedList 클래스 정의
// 02) 값을 담을 노드 클래스를 설계한다.
// 03) 첫번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
// 목록 크기를 저장할 필드를 추가한다.
// 04) 목록에 값을 추가하는 add() 메서드를 정의한다.
// 05) 목록에서 값을 조회하는 get() 메서드를 정의한다.
// 06) 목록에서 특정 인덱스 위치에 값을 삽입하는 add(int, Object) 메서드를 정의한다.
// - Node의 생성자를 추가한다.
// 07) 목록에서 특정 인덱스의 값을 제거하는 remove(int) 메서드를 정의한다.


public class MyLinkedList07 {

  // 3) 값을 찾을 때는 첫번째 노드부터 따라간다.
  Node first;

  // 3) 값을 추가할 때는 마지막 노드에 연결한다.
  Node last;

  // 3) MyLinkedList 목록 크기를 보관한다.
  int size;

  // 용도?
  // - Node 클래스는 목록에서 각 항목의 값을 보관하는 객체로 역할을 수행한다.
  // 스태틱 클래스?
  // - 여러개의 MyLinkedList 객체가 공유하는 클래스이기 때문에
  // - static으로 node 클래스를 설계한다.
  static class Node {
    Object value;
    Node next;

    public Node() {}

    public Node(Object value) {
      this.value = value;
    }
  }



  // 04)
  public boolean add(Object e) {
    Node node = new Node();
    node.value = e;

    if (first == null) { // first 변수가 null이면
      first = node; // first 변수에 node 주소를 넣고
    } else { // first가 null이 아니면
      last.next = node; // last 변수의 next 부분에 node 주소를 넣는다.
    }
    last = node; // last 변수의 next 부분에 node 주소를 넣는다.

    size++;
    return true;
  }

  public Object get(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next; // 오른쪽부터 실행함. cursor.next 변수의 주소값을 cursor에 넣는다.
    }
    return cursor.value;
  }

  public void add(int index, Object element) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Node node = new Node(element);

    size++;

    if (index == 0) {
      node.next = first;
      first = node;
      return;
    }

    Node cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {
      cursor = cursor.next; // 커서는 인덱스 바로 전까지 움직인다.
    }

    node.next = cursor.next;
    cursor.next = node;

    if (node.next == null) { // 마지막에 삽입한 후 last를 바꿔줘야 한다.
      last = node;
    }
  }

  public Object remove(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    size--;

    if (index == 0) {
      Node old = first;
      first = old.next;
      old.next = null; // 가비지가 다른 인스턴스를 가리키지 않게 한다.
      return old.value;

    }

    Node cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {
      cursor = cursor.next; // 커서는 인덱스 바로 전까지 움직인다.
    }

    Node old = cursor.next;
    cursor.next = old.next;
    old.next = null; // 가비지가 다른 인스턴스를 가리키지 않게 한다.


    if (cursor.next == null) {
      last = cursor;
    }


    return old.value;
  }
}
