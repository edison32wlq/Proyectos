#include <iostream>
using namespace std;
int a[9], b[9], c[9],i;
int p =1, y=1;
int main ()
{
	for(i=0;i<9;i++)
	{
	do
	{
	cout<<"\n Ingresar valor para el primer vector "<<p++<<"  ";
	cin>>a[i];
	}while (a[i]&2!=0);
	
	}
	for(i=0;i<9;i++)
	{
	do
	{
	cout<<"\n Ingresar valor para el segundo vector "<<y++<<"  ";
	cin>>b[i];
	}while (b[i]&2==0);
	}
	c[i]=((3*a[i])+(2*b[i]));
	
	c[i]=((3*(a[i]))+(2*(b[i])));

		cout<<"\n Estos son los valores de el tercer vector "<<c[i]<<"\n";
	}