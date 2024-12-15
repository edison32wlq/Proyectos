//Cada equipo de béisbol de la liga mexicana del Pacífico tiene un cuadro de 30 jugadores. Supóngase que cada equipo de la liga prepara un listado, donde por cada jugador aparecen los datos siguientes: Nombre del jugador, apellido, peso y edad.
//Los datos correspondientes a los diez equipos de la liga se recopilan y se envían a la sede central para su posterior análisis. Se tiene un paquete que contiene los datos de 30 jugadores del equipo 1, del equipo 2 y así sucesivamente. Elabore un programa para leer los datos y que sirva para proporcionar:
//Peso y edades promedio de los jugadores de cada uno de los diez equipos.
//Peso y edades promedio de todos los jugadores.


#include<iostream>
using namespace std;
int e,aj,pj,ej,i=0;
char nj;
//no estoy seguro de como guardar nombres en variables
int main()
{
	do
	{
	cout<<"\n----------BIENVENIDOS AL MENU DE EQUIPOS DE FUTBOL----------";
	cout<<"\n";
	cout<<"\n1. Equipo 1";
	cout<<"\n2. Equipo 2";
	cout<<"\n3. Equipo 3";
	cout<<"\n4. Equipo 4";
	cout<<"\n5. Equipo 5";
	cout<<"\n6. Equipo 6";
	cout<<"\n7. Equipo 7";
	cout<<"\n8. Equipo 8";
	cout<<"\n9. Equipo 9";
	cout<<"\n10. Equipo 10";
	cout<<"\n11. Salir del menu";
	cin>>e;
	}while(e||11);
	if (e==11)
	 cout<<"Gracias por su participacion";
	 else
	 //necesito guardar la informacion de 30 jugadores por equipo y realizar la estadistica y no se como guardarla en una variable
	 //de la misma manera no se como hacer que se repita el menu para que ellos escogan a que equipo quieren ingresar la informacion
	 // tambien me faltaria una opcion mas para que ingresen a las estadisticas
	for(i=1;i<=30;i++);
	{
	cout<<"--------------------INGRESAR LOS SIGUIENTES DATOS--------------------";
		cout<<"\n";
		cout<<"\n";
		cout<<"\nNombre del jugador\n";
		cin>>nj;
		cout<<"\nApellido del jugador\n";
		cin>>aj;
		cout<<"\nPeso del jugador\n";
		cin>>pj;
		cout<<"\nEdad del jugador\n";
		cin>>ej;
	}
		
		
		
}