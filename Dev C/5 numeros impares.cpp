#include<iostream>
using namespace std;
int i, n;
int main()
{
	for (i=0; i<5;i++)
	{
	cout<<"\n Ingrese un numero";
	cin>>n;
	if(n%2==0)
	{
		cout<< "El numero es Par";
	}
	else
	{
		cout<< " El numero es Impar";
	}
	}
}