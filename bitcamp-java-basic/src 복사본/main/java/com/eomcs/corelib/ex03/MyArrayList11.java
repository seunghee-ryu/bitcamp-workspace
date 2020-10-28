package com.eomcs.corelib.ex03;

// test1 - MyArrayListTest
// 1) 인스턴스/객체(의 주소)를 담을 레퍼런스 배열을 준비한다.
// 2) 인스턴스를 추가하는 add() 메서드 정의한다.
// 3) 특정 인덱스의 인스턴스를 리턴하는 get() 메서드 정의한다.
// 4) 인스턴스를 특정 위치에 삽입하는 add(int, Object)메서드 추가한다.
// 5) 특정 위치의 항목을 다른 인스턴스로 교체하는 set(int, Object) 메서드를 추가한다.
// 6) 특정 위치의 하목을 제거하는 remove(int) 메서드를 정의한다.

// test2 - MyArrayListTest2
// 7) add()할 때 배열의 크기를 넘는 경우, 배열의 크기를 늘린다.
//    새 배열을 만들고 기존 배열을 새 배열에 복사한 뒤 주소를 변경해준다.
// 8) add(int, Object)로 임의의 위치에 삽입할 때 배열의 크기가 작으면 늘린다.
//    인덱스가 유효하지 않으면 예외를 발생시킨다.
// 9) get(int)으로 유효하지 않은 인덱스의 값을 꺼낼 때 예외를 발생시킨다.
// 10) remove()를 수행한 다음에 맨 끝에 남아있는 주소를 null로 설정하여
//    인스턴스의 레퍼런스 카운트를 한 개 줄인다.
// 11) set()을 호출할 때 인덱스가 유효하지 않으면 예외를 발생시킨다.

public class MyArrayList11 {

  static Object[] elementData = new Object[5];
  static int size;

  static public boolean add(Object e) {
    if (size == elementData.length) { //7
     grow();
    }
    elementData[size++] = e;
    return true;
  }

  static private void grow() {
    System.out.println("오호라! 배열을 늘리자!");
    Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
    for (int i = 0; i < elementData.length; i++) {
      newArray[i] = elementData[i]; // 반복문을 돌면서 복사를 한다.
    }
    elementData = newArray; // 복사가 끝나면 새 주소로 교체
  }

//  static public void add(int index, Object element) {
//    for (int i = size; i > index; i--) {
//      elementData[i] = elementData[i - 1];
//    }
//
//    elementData[index] = element;
//    size++;
//  }

  static public Object get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    return elementData[index];
    }

  static public Object set(int index, Object element) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Object old = elementData[index];
    elementData[index] = element;
    return old;
  }

  static public Object remove(int index) {
    Object old = elementData[index];

    for (int i = index; i < size -1; i++) {
      elementData[i] = elementData[i +1];
    }

    size--;
    elementData[size] = null; // 10
    // 쓰지않는 인스턴스의 주소를 제거하여
    // 가비지가 될 수 있게 한다.
    return old;
  }

  static public void add(int index, Object element) { // 8
    if (size == elementData.length) {
     grow();
    }
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    for (int i = size; i > index ; i --) {
      elementData[i] = elementData[i - 1];
    }
    elementData[index] = element;
    size++;
  }

}
