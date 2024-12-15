#include<iostream>
using namespace std;
int a,s,e,t,p,co,cc;
int tam,taf;
int main()
{
	do
	{
		cout<<"\nIngresar el sexo 1(masculino), 2(femenino)\n";
		cin>>s;
		cout<<"\nIngresar la edad del estudiante";
		cin>>e;
		cout<<"\nIngresar el peso en kilos del estudiante";
		cin>>p;
		cout<<"\nIngresar la altura en metros del estudiante";
		cin>>t;
		cout<<"\nIngrese el color de cabello del estudiante (1-castaño, 2-rubio, 3-otro)";
		cin>>cc;
		cout<<"\nIngrese el color de ojos del estudiante (1-azul, 2-castaño, 3-otro) ";
		cin>>co;
		switch (s)
		{
			case 1:
				if(co=2&& t>=1.70&&p>60&&p<=70)
				{
				}
				tam=tam+1;
				cout<<"\nEl total de alumnos hombres que cumplen los estandares son: "<<tam;
				break;
			case 2:
				if(co=1 && cc=2 && t>=1.65 && t<1.75 )
				{
				}
				taf=taf+1;
				cout<<"\nEl total de mujeres que cumplen con los estandares es de: "<<taf;
			
			default
			cout<<"No cumple con los estandares";
		}
		
		
	}while(s)
}