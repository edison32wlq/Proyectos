# include <iostream>
using namespace std;
int a[2][2], b[2][2], c[2][2];
int main ()
{
    cout<<"\n Ingresar los elementos para A ";
	for(i=0;i<2;i=i+1)	
	{
		for (j=0;j<2;j=j+1)
		{
			cout<<"\n a["<<i<<"]["<<j<<"]";
			cin>>a[i][j];
		}
	}
	cout<<"\n Ingresar los elementos para B ";
	for(i=0;i<2;i=i+1)	
	{
		for (j=0;j<2;j=j+1)
		{
			cout<<"\n a["<<i<<"]["<<j<<"]";
			cin>>b[i][j];
		}
	}
	cout<<"\n Resta de a - b:";
	for(i=0;i<2;i=i+1)	
	{
		for (j=0;j<2;j=j+1)
		{
			c[i][j]=a[i][j] - b[i][j];
			cout<<" \t"<<c[i][j];
		}
		cout<<"\n \t";
	}
	cout<<"\n Resta de b - a :";
	for(i=0;i<2;i=i+1)	
	{
		for (j=0;j<2;j=j+1)
		{
			c[i][j]=b[i][j] - a[i][j];
			cout<<" \t"<<c[i][j];
		}
		cout<<"\n \t";
	}
	cout<<"\n Suma de 2a + 3b :";
	for(i=0;i<2;i=i+1)	
	{
		for (j=0;j<2;j=j+1)
		{
			c[i][j]=(2*a[i][j]) - (3*b[i][j]);
			cout<<" \t"<<c[i][j];
		}
		cout<<"\n \t";
	}
}