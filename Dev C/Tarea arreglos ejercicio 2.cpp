#include<iostream>
using namespace std;
int v[10],i,my,mn;
float s=0, p, n=0;
int main ()
{
	for(i=0;i<10;i++)
	{
		cout<<"\n Ingresar un numero: ";
		cin>>v[i];
		s= s + v[i];
	}
	p = s/10;
	for (i=0;i<10;i++)
	{
		if(v[i]>p)
		{
			my++;
		}
		if(v[i]<p)
		{
			mn++;
		}
	}
	cout<<"\nEl promedio es de: "<<p;
	cout<<"\n Numeros mayores al promedio: "<<my;
	cout<<"\n Numeros menores al promedio: "<<mn;
	
	
	
}