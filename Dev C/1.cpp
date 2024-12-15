// 6.	Una compañía de seguros ha reunido datos concernientes a todos los accidentes de tránsito ocurridos durante el año. Los datos que se tiene de cada conductor comprendido en un accidente son los siguientes:
// Edad del conductor
// Sexo                                   
//Código de seguridad (1 – capital, 2 - provincia) 
//Diseñar un programa que lea los datos e imprima los siguientes valores estadísticos de los conductores que han participado en accidentes:
//Porcentaje de conductores menores de 25 años.
//Porcentaje de conductores de sexo femenino.
//Porcentaje de conductores de sexo masculino con edades comprendidas entre 18 y 25 años.
//Porcentaje de conductores que son de la capital

#include<iostream>
using namespace std;
int i,ec,sc,cs;
int main()
{
	cout<<"\n----------BIENVENIDOS A NUESTRO MENU DE ACCIDENTES DE TRANSITO----------";
	cout<<"\n";
	do
	{
		cout<<"\n1. Ingresar una nueva encuesta";
		cout<<"\n2. Salir del menu\n";
		cin>>i;
// No se como hacer para que se detenga en el caso de que quiera salir del menu
// No se como guardar en una variable el numero de veces que se repite 
//  No se como regresar al principio una vez termine para realizar una nueva encuesta 

	}while (i==1);
	if (i==2)
		cout<<"\nGracias por su participacion";
cout<<"--------------------INGRESAR LOS SIGUIENTES DATOS--------------------";
		cout<<"\n";
		cout<<"\n";
		cout<<"\n1. Edad del conductor\n";
		cin>>ec;
		cout<<"\n2. Sexo del conductor, masculino(1), femenino(2)\n";
		cin>>sc;
		cout<<"\n3. Ingresar el codigo de seguridad, capital(1), provincia(2)\n";
		cin>>cs;
}