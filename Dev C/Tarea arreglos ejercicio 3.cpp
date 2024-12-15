#include<stdio.h>

int n,i;
 int main()
 {
 	printf("Ingrese el numero de elementos que desea: ");
 	scanf("%i",&n);
 	int v[n];
	 i=1;
 	
 	while(i<=n)
	{
		if(i%3==0)
		{
			printf("%i.\n",i);
		}
		i++;
	}
	return 0;
}