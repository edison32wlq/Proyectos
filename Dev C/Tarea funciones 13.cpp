#include <iostream>
using namespace std;
float multiplicacion(float n1, float n2, float n3, float n4);
int n1, n2, n3, n4, r;
int main ()
{
	int s;
	s = multiplicacion(n1,n2,n3,n4);
	cout<<"\nLa multiplicacion de los numero ingresados es "<<s;
	
	return (0);
	
}

float multiplicacion(float n1, float n2, float n3, float n4)
{
	cout<<"\nIngresar un numero real ";
	cin>>n1;
	cout<<"\nIngresar un numero real ";
	cin>>n2;
	cout<<"\nIngresar un numero real ";
	cin>>n3;
	cout<<"\nIngresar un numero real ";
	cin>>n4;
	r = n1*n2*n3*n4;
	
}