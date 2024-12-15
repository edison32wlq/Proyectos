#include <iostream>
using namespace std;
struct info_libro
{
	char titulo[50];
	char nombre_del_autor[25];
	char editorial[20];
	char fecha_publicacion[20];
};
struct info_libro lb[3];
int i;
int main()
{
	for(i=1;i<=3;i++)
	{
	cout<<"\n Llenando datos del libro N#: "<<i;
	fflush(stdin);
	cout<<"\n Ingrese el titulo del libro: ";
	gets(lb[i].titulo);
	fflush(stdin);
	cout<<"\n Ingrese el nombre del autor: ";
	gets(lb[i].nombre_del_autor);
	fflush(stdin);
	cout<<"\n Ingrese editorial: ";
	gets(lb[i].editorial);
	fflush(stdin);
	cout<<"\n Ingrese año de publicacion: ";
	gets(lb[i].fecha_publicacion);
	fflush(stdin);
	}
	
	for(i=1;i<=3;i++)
	{
		cout<<"\n Presentacion de datos del cd N#: "<<i;
		cout<<"\n"<<lb[i].titulo;
		cout<<"\n"<<lb[i].nombre_del_autor;
		cout<<"\n"<<lb[i].editorial;
		cout<<"\n"<<lb[i].fecha_publicacion;
	}
}