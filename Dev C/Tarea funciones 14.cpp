#include <iostream>
using namespace std;
float pes(int n);
int n,r,p,c;
int main ()
{
	cout<<"\nIngresar Euros ";
	cin>>n;
	c = pes(n);
	cout<<"\nLa conversion en pesos es de "<<c;
}

float pes(int n)
{
	p = n * 709;
	return (p);
}