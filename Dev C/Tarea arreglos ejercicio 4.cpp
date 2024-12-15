#include<iostream>
using namespace std;
int x[3];
int p,q,r,a,b,c,i,s1=0,s2=0,s3=0;
int main ()
{
	cout<<"\n Ingresar el numero de elementos para A: ";
	cin>>p;
	int A[a];
	for (i=0;i<p;i++)
	{
	cout<<"\n Ingrese el valor: ";
	cin>>a;
	s1= s1 + a;
	A[a]= s1;
	}
	cout<<"\n Ingresar el numero de elementos para B: ";
	cin>>q;
	int B[b];
	for(i=0;i<q;i++)
	{
	cout<<"\n Ingrese el valor: ";
	cin>>b;
	s2= s2 + b;
	B[b]= s2;
	}
	cout<<"\n Ingresar el numero de elementos para C: ";
	cin>>r;
	int C[c];
	for (i=0;i<r;i++)
	{
		cout<<"\n Ingrese el valor: ";
	cin>>c;
	s3= s3 + c;
	C[c]= s3;
	}
	cout<<"\n El primer elemento de X es: "<<A[a];
	cout<<"\n El segundo elemento de X es: "<<B[b];
	cout<<"\n El tercer elemento de x es: "<<C[c];
}





