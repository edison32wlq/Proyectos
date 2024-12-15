#include<iostream>
using namespace std;
int a[5],i;
int main()
{
	//llenando el arreglo
	for(i=0;i<5;i++)
	{
		cout<<"\nIngrese valor: ";
		cin>>a[i];
	}	
	//Presentacion de datos del arreglo
	for(i=0;i<5;i++)
	{
		cout<<"\n"<<a[i];
	}
	cout<<"\n";
	//Presentando los datos de forma descendente
	for(i=4;i>=0;i=i-1)
	{
		cout<<"\n"<<a[i];
	}
	
}