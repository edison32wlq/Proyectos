#include <iostream>
using namespace std;
int prim(int a[6]);
int i,c,k=0,a[6],q=1;
int main ()
{
	for(int i=1;i<=6;i++)
	{
		do
		{
			cout<<"\nIngresar un numero "<<"["<<i<<"]"<<"\n";
			cin>>a[i];
		}while(a[i]<0);
	}
	int prim(a[6]);
	cout<<c;
	return (0);
}


int prim(int a[6])
{
	while(q<=a[i])
	{
		if(a[i]%q==0)
		{
			k++;	
		}
		q++;
	}
	if(k==2)
	{
		c = a[i];
	}

}