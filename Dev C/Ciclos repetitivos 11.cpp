#include<iostream>
using namespace std;
int n, r, i;
bool p=true;
int main()
{
	do
	{
		cout<<"\n --------------BiENVENIDOS AL SIGUIENTE MENU DE OPCIONES--------------";
		cout<<"\n Ingrese la opcion deseada: ";
		cout<<"\n \t1. El numero es primo";
		cout<<"\n \t2. El numero es par o impar";
		cout<<"\n \t3. El numero es negativo, neutral, o neutro";
		cout<<"\n \t4. Salir del menu de opciones ";
		cout<<"\n";
		cin>>r;
		cout<<"\n Ingrese un numero: ";
		cin>>n;
		cout<<" \n ";
		switch (r)
		{
			case 1:
				for(i=2; i<n;i++)
				{
					if(n%i==0)p=false;
				}
				if(p==true)
				{
					cout<<"\n- El numero es primo";
				}
				else
					cout<<"- El numero no es primo";
					break;
		case 2: 
				if(n%2==0)
				{
					cout<<"Es PAR";
				}
				else
				{
					cout<<"Es IMPAR";
				}
				break;
			case 3:
				if(n==0)
				{
					cout<<"\n El numero es neutro";
				}
				else
				if (n<0)
				{
					cout<<"\n El numero es negativo";
				}
				else
					cout<<"\n El numero es positivo";
					break;
		}
	}
	while (n !=4);
}


