
#include <stdio.h>
int e;
char s;
int main ()
{

	printf("\n Ingrese su edad: ");
	scanf("%d",&e );
	printf("\n Ingrese su sexo masculino(m), femenino(f): ");
	scanf("%f",&s);
	if (s=='m' && e>=60)
		printf("\n Ya se puede jubilar ");
	else 
		if (s=='f' && e>54)
			printf("\n Ya se puede jubilar");
		else 
		{
			printf("\n No se puede jubilar");
		}
}
