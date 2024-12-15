#include <stdio.h>
int main ()
{
	int sueldo, aumento, sueldototal;
	printf("\n Ingrese su sueldo  ");
	scanf("%d",&sueldo);
	if(sueldo<100000)
	{
		aumento=(sueldo*0,15);
	}
	else
	{
			if(sueldo>=100000&&sueldo<=1000000)
			{
				aumento=sueldo*0.08;
			}
			else
				aumento=sueldo*0.03;
	}
	sueldototal=sueldo+aumento;
	printf("\n Su sueldo es de: %d \n",sueldo);
	printf("\n Su aumento es de:  %d \n",aumento);
	printf("\n Su total es de: %d \n",sueldototal);
}