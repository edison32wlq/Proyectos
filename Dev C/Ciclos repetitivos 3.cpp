#include<iostream>
using namespace std;
int i=1, s,x=1;
int main()
{
	while(i<=100)
	{
		if (x%2 == 0)
		{
			cout<<x<<" ";
			s = s+x;
			i = i+1;
		}
		x = x+1;
	}
	cout<<"\n ";
	cout<<"\nLa suma total de los primero 100 numero impares es de: "<<s;
}