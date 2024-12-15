#include <iostream>
using namespace std;
int par(int numero);
int numero, resultado;
int main ()
{
	cout<<"\nIngrese un numero: ";
	cin>>numero;
	resultado = par(numero);
	if (resultado==1)
	{
		cout<<"\nEs par";
	}
	else
	{
		cout<<"\nEs impar";
	}
	return(0);
	 
}
int par(int numero)
	{
		if((numero%2)==0)
		{
			return (1);
		}
		else
		{
			return(0);
		}
	}