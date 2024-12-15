#include<iostream>
using namespace std;
int a[10],i,par=0;
int main ()
{
	cout<<"\n---------NUMEROS PARES----------\n";
	for(i=0;i<10;i++)
	{
		par=par+2;
		a[i]=par;
	}
	for(i=0;i<10;i++)
	{
		cout<<"\n"<<a[i];
	}
}