#include <iostream>
using namespace std;
int triple(int n);
int n,m;
int main ()
{
	cout<<"\nIngrese un numero entero ";
	cin>>n;
	triple(n);
	cout<<"\nEl triple de "<<n<<" es "<<m;
	
}

int triple(int n)
{
	m = n*3;
	return (m);
}