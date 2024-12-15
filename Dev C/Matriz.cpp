#include<iostream>
using namespace std;

int a[2][3],f,c;

int main ()
{
	//Llenando la matriz
	cout<<"\nIngrese datos para la matriz en el elemento: ";
	for(f=0;f<2;f=f+1)	
	{
		for (c=0;c<3;c=c+1)
		{
			cout<<"\n a["<<f<<"]["<<c<<"]";
			cin>>a[f][c];
		}
	}
	//PRESENTAR DATOS DE MATRIZ
	cout<<"\n \n";
	for(f=0;f<2;f=f+1)	
	{
		for (c=0;c<3;c=c+1)
		{
			cout<<"\t"<<a[f][c];
		}
		cout<<"\n";
		
	}
	
}