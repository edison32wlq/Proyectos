#include <iostream>
using namespace std;
void media3(float n1, float n2, float n3);
float n1,n2,n3;
int main () {
	cout<<"\nIngrese un numero real: ";
	cin>>n1;
	cout<<"\nIngrese un numero real: ";
	cin>>n2;
	cout<<"\nIngrese un numero real: ";;
	cin>>n3;
	media3(n1,n2,n3);
	return (0);
}

void media3(float n1, float n2, float n3) 
{
	float r;
	r = (n1+n2+n3)/3;
	cout<<"\nLa media es: "<<r;
}