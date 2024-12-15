#include<stdio.h>
#include<conio.h>
int main()
{
	char nom[50];
	int ed=0,cg=0,j=0, se=0;
	float pe=0, spe=0, ppe=0,ped=0, cge=0, sge=0, cgp=0, sgp=0,pge=0, pgp=0;
	while(cg<1)
	{
		cg++;
		printf("\nEquipo%d\n",cg);
		j=0;
		se=0;spe=0;
		while(j<30)
		{
			printf("\n\nNombre:"); scanf("%s",&nom);
			printf("\nEdad:");scanf("%d",&ed);
			se=se+ed;
			printf("\nPeso:");scanf("%f",&pe);
			spe=spe+pe;
			j++;
		}
		ped= (float)se/j;
		ppe=(float)spe/j;
		printf("\nEquipo%d",cg);
		printf("\n El promedio de las edades es %.2f",ped);
		printf("\nEl promedio del peso de los j es %2.f\n",ppe);
		cge=cge+j;sge=sge+se;
		cgp=cgp+j;sgp=sgp+spe;
	}
	pge=sge/cge;
	pgp=sgp/cgp;
	printf("\n\npromedio general de edades es: %.2f",pge);
	printf("\nEl promedio general de pesos es> %.2f",pgp);
	getch();
	
}

