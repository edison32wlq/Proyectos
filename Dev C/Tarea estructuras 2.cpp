#include <iostream>
using namespace std;
struct facturacion_de_clientes
{
	char nombre[20];
	int num_uni;
	int pre_uni;
	int estado;
};
struct facturacion_de_clientes cl[20];
int i;
int in;
int main ()
{
	do 
	{
	cout<<"\nIngresar nombre: ";
	gets(cl[i].nombre);
	cout<<"\nIngresar numero de unidades solicitadas: ";
	cin>>cl[i].num_uni;
	cout<<"\n Ingresar el precio de cada unidad: ";
	cin>>cl[i].pre_uni;
	cout<<"\nIngresar el estado de entrega ";
	cout<<"\nMoroso(1), Atrasado(2 ), y Pagado(3): ";
	cin>>cl[i].estado;
	cout<<"\n Ingresar  un nuevo cliente SI(1), NO(2)\n";
	cin>>in;
	}while(in==1);
}