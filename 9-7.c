#include <stdio.h>

void main()
{	

	char ch;
	char* p;   // ������ ������ ���� p�� q�� ����
	char* q;

	ch = 'A';
	p= &ch;   // ch�� �ּҰ��� p�� ������

	q = p; // p�� ���� q�� ������

	*q = 'Z';  //Q�� ����Ű�� ���� ���� ���� ������

	printf("ch�� ������ �ִ� ��: ch ==> %c \n\n" , ch) ;
}	

