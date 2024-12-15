
#include <stdio.h>
int n1;
int main ()
{
	printf("\n Ingrese un numero: ");
	scanf("%d",&n1 );

	if (n1 % 2==0 && n1 % 5==0)
	printf("\n Es divisible entre 5 y 2");
	else 
	printf("\n No es divisible entre 5 y 2");
}