#include <iostream>
#include <stdlib.h>
using namespace std;
int x1,x2,y1,y2,r1,r2,m,a,b,c,d,e;
int l1,l2,l3,k1,k2,k3,h1,h2,h3,j,q,x;
int o1,o2,o3,o4,p1,p2,p3,p4;
int u,i;
int main (){
	cout<<"\n---------------BIENVENIDOS AL PROGRAMA PARA RESOLVER SISTEMAS DE ECUACIONES LINEALES---------------\n";
	cout<<"\nA continuacion se propondra 3 problemas los cuales tendra que plantear";
	cout<<"\ncomo como sistema de ecuaciones lineales\n";
	cout<<"\n1. Se analiza la cantidad de personas que entran y salen de unos bares.";
	cout<<" En el primer bar entran 2 grupos y salen 3 grupos de personas dejando con una personas menos de las que habian al inicio."	;
	cout<<" En el segundo entran 3 grupos y salen 4 grupos que dando el bar vacio. Calcular el numero de personas";
	cout<<" que entran y el numero de personas que salen en cada bar.\n\n";
	cout<<"\n2. Compran entre dos personas 1 manzana y 3 peras, pagan mitad cada uno y les sale por 5 dolares.";
	cout<<" Otra persona compra 3 manzanas y vende 2 peras, el precio de esto es 5 veces el precio de la pera.";
	cout<<" Calcular el precio de la manzana y la pera.\n\n";
	cout<<"\n3. Se vende 3 fundas de panes y de 2 galletas dando un resultado 7 dolares,";
	cout<<" mas tarde se venden 4 fundas de panes y son devueltas 3 funas de galletas dando como perdida 2 dolares.";
	cout<<" Calcular el precio de la funda de panes y la funda de galletas.";
	cout<<"\n INGRESAR LOS DATOS DEL SISTEMA ESCOGIDO";
	cout<<"\nPrimera ecuacion";
	cout<<"\nx= ";
	cin>>x1;
	cout<<"\ny= ";
	cin>>y1;
	cout<<"\nr= ";
	cin>>r1;
	cout<<"\nSegunda ecuacion";
	cout<<"\nx= ";
	cin>>x2;
	cout<<"\ny= ";
	cin>>y2;
	cout<<"\nr= ";
	cin>>r2;
	cout<<"\n========ESCOGER EL METODO QUE DESEA UTILIZAR PARA RESOLVER EL SISTEMA DE ECUACIONES LINEALES=========";
	do{
		cout<<"\n1. Metodo de Sustitucion";
		cout<<"\n2. Metodo de Reduccion";
		cout<<"\n3. Metodo de Igualacion";
		cout<<"\n4. Metodo Grafico";
		cout<<"\n5. Salir del Menu\n";
		cin>>a;
		switch (a){
		case 1:
			cout<<"\nSe resolvera con el Metodo de Sustitucion";
			m=(r1-y1)/x1;
			c=((x2*m)*2);
			y2=y2*2;
			r2=r2*2;
			y2=r2-c;
			if(y2<0)
			{
				y2=y2*(-1);
			}
			else
			{
				y2=y2;
			}
			d=y1*y2;
			e=(r1+d)/x1;
			cout<<"x= "<<e;
			cout<<"\ny= "<<y2;
			
			break;
		case 2:
			cout<<"\nSe resolvera con el Metodo de Reduccion";
			l1=x1*x2;
			l2=y1*x2;
			l3=r1*x2;
			k1=x2*x1;
			k2=y2*x1;
			k3=r2*x1;
			h1=l1-k1;
			h2=l2-k2;
			h3=l3-k3;
			j=h3/h2;
			if(j<0)
				j=j*(-1);
			else
			{
				j=j;
			}
			q=y1-j;
			x=(r1-j)/x1;
			cout<<"\nx= "<<x;
			cout<<"\ny= "<<j;
			break;
		case 3:
			cout<<"\nSe resolvera con el Metodo de Igualacion";
			o1=r1*x1;
			o2=(-y1)
			o3=p1-o1;
			p1=r2*x2;
			p2=(-y2)*x2;
			p3=(p1+o3)/o2;
			if(p3<0)
				p3=p3*(-1);
			else
			{
				p3=p3;
			}
			o4=(r1-p4)/x1;
			break;
		case 4:
			cout<<"\nSe resolvera con el Metodo Grafico";
			u=(r2-x2)/y1;
			i=(r2-x2)/y2
			break;
		case 5:
			cout<<"\nSeguro que desea salir..??      SI O NO \n";
			cout<<"\nSi";
			cout<<"\nNo";
			cin>>b;
			if(b=1){
				return 0;
			}
			break;
		default:
			return main();
			break;
		}
	}while(a != 5);
	system("pause");
	return main();
}
