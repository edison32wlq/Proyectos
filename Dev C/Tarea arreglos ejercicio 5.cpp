#include<iostream>
using namespace std;
int v[100], n,i,may=0 ;
int main()
{
	cout<<"\n Ingresar el numero de elementos que se desean: ";
	cin>>n;
	for (i=0;i<n;i++)
	{
	cout<<"\n Ingrese el valor: ";
	cin>>v[i];
	if( v[i]> may)
	{
		may= v[i];
	}
	}
	cout<<"\n El mayor elemento es: "<<may;
	cout<<"\n y se encuentra en la siguientes posiciones: ";
	for ( int i=0; i<n; i++)
	{
		if(may==v[i])
		{
			cout<<i<<endl<<"\n";
			cout<<"\nNOTA: las posiciones empiezan desde el numero 0.";
			
		}
	}
	cout<<endl;
	return 0;
	
}
 