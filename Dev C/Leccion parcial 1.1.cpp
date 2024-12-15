#include<iostream>
using namespace std;
int a,b,r,i;
int main ()
{
	cout<<"Ingrese el primer valor: ";
	cin>>a;
	cout<<"Ingrese el segundo valor: ";
	cin>>b;
	cout<<"--------------------OPERACIOnES ARITMETICAS ELEMENTALES--------------------";
	cout<<"\n 1. Si quiere realizar una suma usar";
	cout<<"\n 2. Si quiere realizar una resta usar";
	cout<<"\n 3. Si quiere realizar una multiplicacion";
	cout<<"\n 4. Si quiere realizar una division usar";
	cout<<"\n Ingrese alguna de las opciones en base a los numero 1,2,3,4: ";
	cin>>i;
	
		switch (i)
	{
		case 1:
		r=a+b;
			break;
		case 2:
		r=a-b;
			break;
		case 3:
		r=a*b;
			break;
		case 4:
		r=a/b;
		default:
			cout<<"\n La opcion ingresada no existe";
		break;
	}
	cout<<"\n El valor de la operacion es de: " <<r;
}