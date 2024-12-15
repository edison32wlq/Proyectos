#include<iostream>
using namespace std;
int sueldo,aumento,sueldototal;
int main ()
{
	cout<<"\n Ingrese su sueldo ";
	cin>>sueldo;
	sueldototal = sueldo + aumento;
	if(sueldo<100000)
	{
		aumento=(sueldo*0,15);
			if (sueldo>=100000&&sueldo<=1000000)
			{
				aumento=(sueldo*(8/100));
			}
					if(sueldo>1000000)
							aumento=(sueldo * (3/100));
	}
	cout<<"Su sueldo total es de "<<sueldototal; 
}