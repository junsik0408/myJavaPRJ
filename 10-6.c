#include <stdio.h>

int a = 100; // ���� ���� a�� �����ϰ� �ʱⰪ�� ������

void func1()
{
	int a = 200; // ���� ���� a�� �����ϰ� �ʱⰪ�� ������
	printf ("func1()���� a�� ��==> %d\n", a);
}

void main()
{	
	func1();
	printf("main() ���� a�� ��==> %d\n" , a);
}
