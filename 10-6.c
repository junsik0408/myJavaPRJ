#include <stdio.h>

int a = 100; // 전역 변수 a를 선언하고 초기값을 대입함

void func1()
{
	int a = 200; // 지역 변수 a를 선언하고 초기값을 대입함
	printf ("func1()에서 a의 값==> %d\n", a);
}

void main()
{	
	func1();
	printf("main() 에서 a의 값==> %d\n" , a);
}
