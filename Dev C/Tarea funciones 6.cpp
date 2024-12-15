#include <iostream>
using namespace std;
float area(float n1, float n2);
float perimetro(float n1, float n2);
float n1,n2,ra,rp;
int main ()
{
	cout<<"\nIngrese la base del triangulo ";
	cin>>n1;
	cout<<"\nIngrese la altura del rectangulo ";
	cin>>n2;
	
	perimetro(n1,n2);
	cout<<"\n El perimetro del rectangulo es de: "<<rp;
	area(n1,n2);
	cout<<"\n El area del rectangulo es de: "<<ra;
	
}
float area(float n1, float n2)
{
	ra = (n1*n2);
	return (ra);
}

float perimetro(float n1, float n2)
{
	rp = ((n1*2)+(n2*2));
	return (rp);
}
