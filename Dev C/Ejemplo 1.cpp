// presentar la suma de dos numeros enteros ingresados por teclado
#include<stdio.h>

int a,b,suma; //declaracion de variable a usar ///////>globales

 int main ()  // funcion principal an c
{
	printf("\n Ingrese el primer numoer");  // funcion qu presenta mensajes y contenido de variables por pantalla
	scanf("%d",&a);
	printf("\n Ingrese el segundo numero");
	scanf("%d",&b);
	suma=a+b;
	printf(" La suma de %d + %d = %d ",a,b,suma);
	
}