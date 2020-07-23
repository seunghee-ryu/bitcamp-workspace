#include <stdio.h>
#include <stdlib.h>

int main() {
    int* p = malloc(4);
    *p = 200;
    printf("i = %d\n", *p);
    return 0;

}

// malloc(4) 4바이트의 메모리를 준비하고 그 주소값을 변수에 넣어라
// *p 는 포인터 변수. 주소를 저장하는 변수.
// 주소도 숫자 = 정수 변수 