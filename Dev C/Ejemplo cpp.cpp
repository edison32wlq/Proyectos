// ingresar dos numeros y realizar las operaciones basicas

#include<stdio.h>
float n1, n2, s, r, m, d;
int main()
{
	printf("\n Ingrese un numero: ");
	scanf("%f",&n1);
	
	printf("\n Ingrese segundo numero: ");
	scanf("%f",&n2);
	
	s=n1+n2;
	r=n1-n2;
	m=n1*n2;
	d=n1/n2;
	printf("\n el resultado de la suma es: %.2f",s);
	printf("\n el resultado de la resta es: %.2f",r);
	printf("\n el resultado de la multiplicacion es: %.2f",m);
	printf("\n el resultado de la division es: %.2f",d);
}