#include <iostream>
using namespace std;
void prim(int n);
int n,x=1,c=0;
int main ()
{
	cout<<"\nIngresar un numero ";
	cin>>n;
	return (0);
}
void prim(int n)
{
	while (x<=n)
	{
		if(n%x==0)
		{
			c++;
		}
		x++;
	}
	if (c ==2)
	{
		cout<<"\nEl numero es primo ";
	}
	else
	{
		cout<<"\El numero no es primo ";
	}
	cout<<"\n";
}