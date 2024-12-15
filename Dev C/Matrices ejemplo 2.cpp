#include <iostream>
using namespace std;
int a[3][3],i,j,s=0,p,mayor,menor;
int main()
{
	cout<<"\n Ingrese los numeros impares:";
	for(i=0;i<3;i=i+1)	
	{
		for (j=0;j<3;j=j+1)
		{
			do
			{
				cout<<"\n a["<<i<<"]["<<j<<"]";
				cin>>a[i][j];
			}
			while(a[i][j] %2 == 0);
		}
	}
	
	
	for(i=0;i<3;i=i+1)	
	{
		for (j=0;j<3;j=j+1)
		{
			cout<<"\t "<<a[i][j];
			s = s + a[i][j];
		}
		cout<<"\n";
	}
	p = s/9;
	
	mayor= a[0][0];
	for(i=0;i<3;i=i+1)	
	{
		for (j=0;j<3;j=j+1)
		{
			if (a[i][j]>mayor)
			{
				mayor = a[i][j];
			}
		}
	}
	menor= a[0][0];
	for(i=0;i<3;i=i+1)	
	{
		for (j=0;j<3;j=j+1)
		{
			if (a[i][j]<menor)
			{
				menor = a[i][j];
			}
		}
	}
	cout<<"\n El promedio de los numeros es de "<<p;
	cout<<"\n El numero mayor es: "<<mayor;
	cout<<"\n El numero menor es: "<<menor;
}
