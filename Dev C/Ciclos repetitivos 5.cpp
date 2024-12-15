#include<iostream>
using namespace std;
int i,n,ht,sh,st,he,x;
int main()
{

	cout<<"\n Ingresar el numero de trabajadores (El numero de trabajadores sera el numero de veces que se repita): ";
	cin>>n;
	for(i=1;i<=n;i++)
	{
	cout<<"\n";
	cout<<"Ingresar el numero de horas trabajadas ";
	cin>>ht;
	
	cout<<"Ingresar el sueldo por hora ";
	cin>>sh;
	
	if(ht>40)
	{
		he=ht-40;
		x = he*0.5;
		st=(he*sh)+(x*sh)+(40*5);
	}
	else 
		st=ht*5;
	cout<<"\n El sueldo total del trabajador es de: "<<st<<"\n";
	}
}