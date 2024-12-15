#include <iostream>
using namespace std;

float media2 (float n1, float n2);
float r,n1,n2;
int main()
{
	cout<<"\nIngresar un numero: ";
	cin>>n1;
	cout<<"\nIngresar otro numero: ";
	cin>>n2;
	r = media2(n1,n2); 
	cout<<"\nLa media es: "<<r;
}
float media2 (float n1, float n2)
{
	r = (n1+n2) /2;
	return (r);
}