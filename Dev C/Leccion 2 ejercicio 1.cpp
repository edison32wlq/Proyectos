#include <iostream>
using namespace std;
int fact(int n);
int n,s, f=1;
int main ()
{
	cout<<"\nIngrese un numero ";
	cin>>n;
	s= fact(n);
	cout<<"\n El factorial de "<<n<<" es "<<f;
	return (0);
}

int fact(int n)
{
	for(int i=1;i<=n;i++)
	{
		f=f*i;
	}
	return(f);
}