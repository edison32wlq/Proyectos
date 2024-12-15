#include<stdio.h>
#include<conio.h>
int main()
{
	char sex;
	int ed=0, cod=0, Na=0, cg=0, ced=0, cf=0, b=0, cap=0;
	float pa=0, pb=0, pc=0, pd=0;
	printf("Compania de Seguros");
	do
	{
		printf("\nNro. de accidentes:");
		scanf("%d",Na);
	}while(Na<1);
	printf("\n\nInstrucciones:");
	printf ("\n- Digite la edad correspondiente al accidentado");
	printf("\n- Digite 'm' para sexo masculino p 'F'para sexo femenino");
	printf("\n/Para elegir el codigo de seguridad digite:");
	printf("\n1 Para los quer son de la capital\n2.Para los que son de provincia");
	
	while (cg<Na)
	{
		cg++;
		printf("\n\nAccidente N.%d",cg);
		do
		{
			printf("\nEdad");
			scanf("%d",&ed);
		}while (ed<1);
		if (ed<25);
		ced++;
		do
		{
			printf("\nSexo>");
			sex=getche();
		}while (sex !='M'&&sex!='F');
		if(sex=='F')
		cf++;
		if(sex=='M'&&ed>=18&&ed<25)
		b++;
		do
		{
			printf("\nCod de seg>");
			scanf("%d",&cod);
		}while (cod<1 || cod >2);
		if(cod==1);
		cap++;
		pa=(float)ced/cg*100;
		pb=(float)cf/cg*100;
		pc=(float)b/cg*100;
		pd=(float)cap/cg*100;
		printf("\nPorc de cond. menores de 25 es: %.2f%",pa);
		printf("\nPorc de cond. de sex femenino es>: %.2f%",pb);
		printf("\nPorc de cond. de sex M entre 18 y 25 es: %.2f%",pc);
		printf("\nPorc de cond. de la capital es: %.2f%",pd);
		getch();
	}
}
 		
 
 	


	
 	
 	