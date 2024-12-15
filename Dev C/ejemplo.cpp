#include<iostream>
using namespace std;
int i, n, suma;
int main()
{
	for(i=1;i<=5;i++)
	{
		cout<<"\n Ingrese un numero: ";
		cin>>n;
		suma=suma+n;
	}
	cout<<"\n La suma total es de "<<suma;
}
