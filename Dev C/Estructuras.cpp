#include <iostream>
using namespace std;
//definicion de mi estructura
struct discos
{
	char titulo[35];
	char artista[25];
	int n_canciones;
	float precio;
	char fecha[20];
};
struct discos cd[2]; //variables para la estructura
int i;
int main()
{
	for(i=1;i<=2;i++)
	{
	cout<<"\n Llenando datos del disco N#: "<<i;
	fflush(stdin);
	cout<<"\n Ingrese el titulo del disco: ";
	gets(cd[i].titulo);
	fflush(stdin);
	cout<<"\n Ingrese el artista: ";
	gets(cd[i].artista);
	fflush(stdin);
	cout<<"\n Ingrese numero de canciones que tiene el disco: ";
	fflush(stdin);
	cin>>cd[i].n_canciones;
	fflush(stdin);
	cout<<"\n Precio: ";
	cin>>cd[i].precio;
	fflush(stdin);
	cout<<"\n Ingrese la fecha de compra: ";
	gets(cd[i].fecha);
	fflush(stdin);
	}
	
		//Presentacion de datos de la estructura
	for(i=1;i<=2;i++)
{
	cout<<"\n Presentacion de datos del cd N#: "<<i;
	cout<<"\n"<<cd[i].titulo;
	cout<<"\n"<<cd[i].artista;
	cout<<"\n"<<cd[i].n_canciones;
	cout<<"\n"<<cd[i].precio;
	cout<<"\n"<<cd[i].fecha;
}
	
	
	
	
	
}