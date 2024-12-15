#include<iostream>
using namespace std;
int i,f=1,n;
int main(void)
{
	cout<<"Ingrese un numero: ";
	cin>>n;
	if(n<0)
	{
		f=0;5
	}
	else
	if(n==0)
	{
		f=1;
	}
	else
	{
		for(i=1;i<=n;i++)
		{
			f= f*i;
		}
	}
	cout<<"	El factorial de "<<n<<" es: "<<f;
}