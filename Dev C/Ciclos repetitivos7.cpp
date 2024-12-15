#include<iostream>
#include<string.h>
using namespace std;
int a,s,e,t,p,co,cc;
int tam,taf;
int main()
{
	do
 	{
 	cout<<"\n--------------BIENVENIDOS A NUESTRO SISTEMA DE REGISTRO DE ACCIDENTES DE TRANSITO--------------";
 	cout<<"\n1. Registrar nuevo estudiante\n";
 	cout<<"\n2. Salir del menu\n\n";
 	cin>>a;
 	switch (a)
 	{
 	case 1:
 	cout<<"\n--------------BIENVENIDOS AL LISTADO DE ESTUDIANTES--------------";
 	cout<<"\n1. Ingresar el sexo 1(masculino), 2(femenino)\n";
 	cin>>s; 
 	cout<<"\n2. Ingresar edad del estudiante\n";
 	cin>>e;
 	cout<<"\n3. Ingresar estatura del estudiante\n";
 	cin>>t;
 	cout<<"\n4. Ingresar peso del estudiante\n";
 	cin>>p;
 	cout<<"\n5. Color de ojos del estudiante 1(azul), 2(castanos), 3(otro)\n";
 	cin>>co;
 	cout<<"\n6. Color del cabello del estudiante 1(castano), 2(rubio), 3(otro)\n";
 	cin>>cc;	
	}
	switch (s)
		{
			case 1:
				if(co=2&&t>=1.70&&p>60&&p<=70)
				{
				}
				tam=tam+1;
				cout<<"\nEl total de alumnos hombres que cumplen los estandares son: "<<tam;
				break;
			case 2:
				if(co=1&&cc=2&&p<55 && t>1.65 && t<1.75)
				{
				}
				taf=taf+1;
				cout<<"\nEl total de mujeres que cumplen con los estandares es de: "<<taf;
			
			default:	
			cout<<"No cumple con los estandares";
 	}
	}while (a==1);
}