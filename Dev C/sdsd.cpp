#include<iostream>
using namespace std;
int a,b,r,i;
int main ()
{
	cout<<"Ingrese el primer valor";
	cin>>a;
	cout<<"Ingrese el segundo valor";
	cin>>b;
	cout<<"--------------------OPERACIOnES ARITMETICAS ELEMENTALES--------------------";
	cout("1. Si quiere realizar una suma usar");
	cout("2. Si quiere realizar una resta usar");
	cout("3. Si quiere realizar una multiplicacion");
	cout("4. Si quiere realizar una division usar");
	cout("Ingrese alguna de las opciones en base a los numero 1,2,3,4        "
	cin>>i;
	
	switch (i)
	{
		case 1:
		r=a+b	
			break;
		case 2:
		r=a-b
			break;
		case 3:
		r=a*b
			break;
		case 4:
		r=a/b	
	}
}