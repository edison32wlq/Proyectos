#include <iostream>
using namespace std;
int numerom(int n1, int n2);
int n1,n2,r;
int main()
{
	cout<<"\nIngrese un numero entero ";
	cin>>n1;
	cout<<"\nIngrese un numero entero ";
	cin>>n2;
	r = numerom(n1,n2);
	if (r == 1)
	{
		cout<<n1<<" Es menor que "<<n2;
	}
	else
	{
		cout<<n2<<" Es menor que "<<n1;
	}
}
int numerom(int n1, int n2)
{
	if (n1<n2)
	{
		return(1);
	}
	else
	{
		return (0);
	}
}
