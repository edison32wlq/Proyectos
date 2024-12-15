#include<iostream>
using namespace std;
int a[10],i=0,par=0, impar=-1;
int main ()
{
	for(i=0;i<10;i++)
	{
		if(i%2==0)
		{
			par=par+2;
			a[i]=par;	
		}
		else
		{
			impar=impar+2;
			a[i]=impar;
		}
	}
	cout<<"\n";
	for(i=0;i<10;i++)
	{
		cout<<"\n"<<a[i];
	}
}