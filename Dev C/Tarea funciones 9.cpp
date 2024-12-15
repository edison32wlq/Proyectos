#include <iostream>
using namespace std;
float salario(int ht, int vh);
int ht,vh,c,r,he;
int main ()
{
	cout<<"\nIngresar horas trabajadas ";
	cin>>ht;
	cout<<"\nIngresar valor por hora ";
	cin>>vh;
	c = salario(ht,vh);
	if (c==1)
	{
		he = (ht-40); 
		r = ((40*vh)+(he*(vh+(vh*0.5))));
		cout<<"\nSu sueldo es de "<<r<<" dolares";
	}
	else
	{
		r = (ht * vh);
		cout<<"\nSu sueldo es de "<<r<<" dolares";
	}	
	return(0);
}

float salario(int ht, int vh)
{
	if (ht>40) 
	{
		return (1);
	}
	else
	{
		return (0);
	}
}