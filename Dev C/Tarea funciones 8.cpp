#include <iostream>
using namespace std;
float salario(int ht, int vh);
int ht,vh,r;
int main()
{
	cout<<"\nIngrese el numero de horas trabajadas ";
	cin>>ht;
	cout<<"\nIngrese el valor por hora ";
	cin>>vh;
	salario(ht,vh);
	cout<<"\nSu salario es de "<<r<<" dolares.";
	return(0);
}

float salario(int ht, int vh)
{
	r = (ht * vh);
	return (r);
}