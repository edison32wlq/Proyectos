#include <stdio.h>
int n;
int main ()
{
	printf("\n Ingrese su nota  ");
	scanf("%d", &n);
	if (n == 10)
	{
	printf ("\n matricula de honor ");
	}
		else
		if (n>=9 && n<10)  
			{
			printf("\n sobresaliente");
			}
			else
			if(n>=8 && n<9)
			{
			printf("\n muy bueno");
			}
				else
				if (n>=(13/2) && n<8)
				{
				printf("\n bueno");
				}
					else
					if (n>=5 && n<(13/2))
					printf("\n regular");
						if(n<5)
						printf("\n reprobado");
						

}