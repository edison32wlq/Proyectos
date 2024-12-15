#include <iostream>
using namespace std;
int a[3][3],i,j,s;
int mat(int a[3][3]);
int main ()
{
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=3;j++)
		{
			cout<<"\nIngresar un numero "<<"["<<i<<"]"<<"["<<i<<"]"<<"\n";
			cin>>a[i][j];
		}
	}
	cout<<"\nLa suma de la diagonal mayor es de "<<s;
	return (0);
}

int mat(int a[3][3])
{
	s = a[1][1] + a[2][2] + a[3][3];
	return (s);
}