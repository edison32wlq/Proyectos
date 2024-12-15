#include<iostream>
using namespace std;
int n,i;
int main()
{
	for (i=0;i<100;i++)
	{
		cout<<"\n Ingrese un numero:  ";
		cin>>n;
		
		if(n%2==0)
		{
			cout<<"Es PAR";
		}
		else
		{
			cout<<"Es IMPAR";
		}
	}
}
