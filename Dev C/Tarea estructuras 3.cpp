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
int in, a=0, t;
int main ()
{
	do 
	{
	cout<<"\nIngresar nombre: ";
	gets(cl[i].nombre);
	fflush(stdin);
	cout<<"\nIngresar numero de unidades solicitadas: ";
	cin>>cl[i].num_uni;
	fflush(stdin);
	cout<<"\n Ingresar el precio de cada unidad: ";
	cin>>cl[i].pre_uni;
	fflush(stdin);
	if (cl[i].estado==3)
	{
		t= cl[i].num_uni + cl[i].pre_uni;
		if ( t < 5000)
			{
				t++;
			}
	}
	fflush(stdin);
	cout<<"\nIngresar el estado de entrega ";
	cout<<"\nMoroso(1), Atrasado(2 ), y Pagado(3): ";
	cin>>cl[i].estado;
	fflush(stdin);
	cout<<"\n Ingresar  un nuevo cliente SI(1), NO(2)\n";
	cin>>in;
	fflush(stdin);
	if (cl[i].estado==1)
	{
		a= a + 1 ;
	}
	}while(in==1);
	
	cout<<"\nNumero de clientes en estado moroso: "<<a++;
	cout<<"\nNumero de clientes con facturas pagadas mayor a 5000 dolares: "<<t++;
	
}