#include <iostream>
using namespace std;
int numero(int n);
int n,p;
int main ()
{
	p = numero(n);
	cout<<"\nEl numero es "<<p;
	
}
int numero(int n)
{
	cout<<"\n Ingrese un numero ";
	cin>>n;
	return (n);
}