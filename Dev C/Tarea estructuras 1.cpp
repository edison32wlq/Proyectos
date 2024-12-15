#include <iostream>
using namespace std;
struct inventario
{
	char titulo[25];
	char fechasub[20];
	char autor [30];
	int num;
	int pedido;
	float precio_venta;	
};
struct inventario libro[100];
int i;
char res;
int main()
{
	for (i=0;i<100;i++)
	{
		cout<<"\n Llenando datos del Libro N#: "<<i;
		cout<<"\nTitulo del Libro";
		gets(libro[i].titulo);
		fflush(stdin);
		cout<<"\nFecha";
		gets(libro[i].fechasub);
		fflush(stdin);
		cout<<"\nNombre del Autor ";
		gets(libro[i].autor);
		fflush(stdin);
		cout<<"\nCuantos libro hay";
		cin>>libro[i].num;
		fflush(stdin);
		cout<<"\nNumero de Pedido";
		cin>>libro[i].pedido;
		cout<<"\nPrecio de Venta ";
		cin>>libro[i].precio_venta;
		cout<<"\nDesea ingresar un libro mas (s/n)";
		cin>>res;
	}

}