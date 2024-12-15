#include <iostream>
using namespace std;
float media2(float n1, float n2);
float n1, n2, r;
int main ()
{
	cout<<"\nIngrese un numero real: ";
	cin>>n1;
	cout<<"\nIngrese otro numero real: ";
	cin>>n2;
	
	r = media2(n1, n2);
	cout<<"\nLa media es: "<<r;
	return(0);
}

float media2(float n1, float n2)
{
	float r;
	r = (n1+n2)/2;
	return(r);
}