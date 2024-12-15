//Escriba un programa interactivo para la compañía ABC que haga procesar e imprimir la información de la nomina de sus 10 empleados. 
//Para cada uno el programa debe imprimir el nombre, las horas de trabajo, la base de pago y edad. Por ejemplo, un grupo típico de datos podría ser:
//Pérez Juan – 50  – $5 – 57
//El pago total de un empleado se calcula con la base de sueldo por las primeras cuarenta horas y 1.5 veces el sueldo normal por cada hora por 
//encima de la cuarenta. Así un empleado que trabajó 50 horas a $5 por hora, tendrá un pago total de $275. Se le retiene un impuesto 
//de la manera siguiente: 10% de los primeros $200 y 20% de la cantidad adicional.
//La primera parte de la impresión debe ser la información relevante de cada empleado.
//Déjese a la salida el siguiente formato:
//Pérez Juan – Horas trabajadas 50 – Sueldo base $5 – Edad 57 – Total $275 – Impuesto $35 – Neto $240
//La segunda parte debe informar sobre:
//El pago promedio para los empleados de al menos 55 años.
//El pago total promedio para los empleados de menos de 55 años.
//El nombre y el pago para el empleado con máximo pago total. 	


#include<iostream>
using namespace std;
int t,ht,bp,et;
char n;

int main()
{
	cout<<"\n----------BIENVENIDOS AL MENU DE LA COMPANIA----------";
	cout<<"\n";
	do 
	{
		cout<<"\n1. Ingresar una nuevo trabajador";
		cout<<"\n2. Salir del menu\n";
		cin>>t;
	}while(t==2);
	if (t==2)
	 cout<<"Gracias por su participacion";
	 //No se como hacer que pare de funcionar en salir del menu y como guardar variables 
	 else
	 	cout<<"--------------------INGRESAR LOS SIGUIENTES DATOS--------------------";
		cout<<"\n";
		cout<<"\n";
		cout<<"\n1. Nombre del trabajador\n";
		cin>>n;
		//Si escribo un nombre no me deja escribir mas y si le pongo un numero si me deja seguir escribiendo varibles
		cout<<"\n2. Horas trabajadas\n";
		cin>>ht;
		cout<<"\n3. Ingresar la base de pago\n";
		cin>>bp;
		cout<<"\n4. Ingresar edad del trabajador\n";
		cin>>et;
		//despues deberia realizar las operaciones para poder mostrar lo que pide, pero necesito que las variables contengan varios datos acumulados
		//para poder realizar los promedios de las personas totales.
		
}
