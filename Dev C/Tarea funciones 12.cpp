#include <iostream>
using namespace std;
int fact(int n);
int n,s, f=1;
int main ()
{
	s = fact(n);
	cout<<"\nEl factorial es "<<f;
	return (0);
}
int fact(int n)
{
	cout<<"\nIngrese un numero ";
	cin>>n;
	for(int i=1;i<=n;i++)
	{
		f = f*i;
	}
	
}