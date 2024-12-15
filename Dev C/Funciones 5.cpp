	#include <iostream>
	using namespace std;
 
 void par(int n1);
 int n1,r;
 int main()
 {
 	cout<<"\nIngresar un numero";
 	cin>>n1;
 	r = par(n1);
 	if (r==1)
 	{
 	 cout<<"\nNumero Par";	
	}
	else
	{
		cout<<"\nNumero Impar";
	}
 
 int par (int n1)
{
 	if ((n1%2)==0)
 	{
 		return (1);
	}
	else
	{
		return (0);
	}
 }