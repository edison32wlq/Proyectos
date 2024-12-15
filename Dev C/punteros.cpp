/* ejemplo de funcion con retorno y argumentos o parametros de tipo puntero (pao por referencia) de la suma de dos numeros*/
#include <iostream>
using namespace std;

int suma (int *pn1, int *pn2);
int *pn1, *pn2;
int n1,n2,r=0;

int main ()
{
	cout<<"\nIngrese el valor para la variable 1: ";
	cin>>n1;
	cout<<"\nIngrese el valor para la variable 2: ";
	cin>>n2;
	r=suma(&n1,&n2);
	cout<<"\nEl resultado es: "<<r;
	cout<<"\n"<<n1;
	cout<<"\n"<<&n1;
	cout<<"\n"<<n2;
	cout<<"\n"<<&n2;
	
}

int suma(int *pn1, int *pn2)
{
	int s=0;
	cout<<"\n"<<pn1;
	cout<<"\n"<<&pn1;
	cout<<"\n"<<*pn1;
	
	cout<<"\n"<<pn2;
	cout<<"\n"<<&pn2;
	cout<<"\n"<<*pn2;
	s=*pn1+*pn2;
	
	return (s);
}