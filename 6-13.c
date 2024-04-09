#include <stdio.h>

void main()
{
	int i,k;

	for ( i = 2 ; i <= 9 ; i ++ ) // 2~9단까지 반복함 
	{
		for (k = 1 ; k <= 9 ; k ++ ) // 각 단의 뒷자리는 1~9를 반복함
		{

			printf(" %d X %d = %d \n" , i , k , i*k);
		}
	printf("\n");
	}
}	


