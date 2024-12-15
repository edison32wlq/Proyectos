#include<iostream>
using namespace std;
int v[100],i,n,par=0;
float s=0,p;
int main ()
{
	cout<<"\n Ingresar el numero de elementos que se desean: ";
	cin>>n;
	for (i=0;i<n;i++)
	{
		cout<<"\n Ingrese el valor: ";
		cin>>v[i];
	}
	for (i=0;i<n;i++)
	{	
	if(i%2==0)
			cout<<v[i]<<endl;
			
		                 
		if (par %2==0)
		{
			par = v[i];
			s = s + par;
		}
			
	} 
	p = s/n;
	cout<<"\n El promedio de los numeros en posiciones pares es de: "<<p;
}