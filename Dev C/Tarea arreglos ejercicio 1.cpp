#include<iostream>
using namespace std;
int vector[21] = {-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10}, z[10],x[11],i;
int neg=-11, pos=-1;
int main ()
{
	cout<<"\n Arreglo z";
	for(i=-10;i<0;i++)
	{
		if(i<0)
		{
			neg=neg+1;
			z[i]=neg;
			cout<<"\n"<<z[i];
		}
	}
	cout<<"\n";
	cout<<"\n Arreglo x";
	for(i=-1;i<=10;i++)
	{
		if(i>=0)
		{
			pos=pos+1;
			x[i]=pos;
			cout<<"\n"<<x[i];
		}
	}
}
