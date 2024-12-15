#include <iostream>
using namespace std;
void tabla(int n);
int n,i=0;
int main ()
{
	cout<<"\nIngrese un numero entero ";
	cin>>n;
	cout<<"\nTabla del "<<n<<"\n";
	tabla(n);
	return (0);
}
void tabla(int n)
{
	for (i=0;i<=10;i++)
	{
	cout << n << " x " << i << " = " << i * n<<"\n";
	}
}