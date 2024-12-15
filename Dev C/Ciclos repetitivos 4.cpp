#include<iostream>
using namespace std;
int i,s=0;
int main()
{
	for(i=1;i<=100;i++)
	{
		s= s+(i*i);
	}
	cout<<"La suma de los cuadrados de los primero 100 numeros es de:  "<<s;
}