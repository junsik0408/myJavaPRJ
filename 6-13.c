#include <stdio.h>

void main()
{
	int i,k;

	for ( i = 2 ; i <= 9 ; i ++ ) // 2~9�ܱ��� �ݺ��� 
	{
		for (k = 1 ; k <= 9 ; k ++ ) // �� ���� ���ڸ��� 1~9�� �ݺ���
		{

			printf(" %d X %d = %d \n" , i , k , i*k);
		}
	printf("\n");
	}
}	


