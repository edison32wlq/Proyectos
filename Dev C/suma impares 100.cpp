#include<iostream>
using namespace std;
int i=0,r=0, par;
int main()
{
	for (par=2;par<=100;par=par+2)
	{
		r=r+par;
	}
	cout<<"La suma de los numeros es de "<< r;
}