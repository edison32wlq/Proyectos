#include <iostream>
using namespace std;
int main()
{
float matriz[5][6];
int f=0,c=0, fila=0;
int may0=0,may1=0,may2=0,may3=0,may4=0,may5=0;
int aux0=0,aux1=0,aux2=0,aux3=0,aux4=0,aux5=5;
int men0=0,men1=0,men2=0,men3=0,men4=0,men5=0;
float total0=0,total1=0,total2=0,total3=0,total4=0,total5=0;
float prom0=0, prom1=0,prom2=0,prom3=0,prom4=0,prom5=0;

cout<<"********************INTRODUCIR LOS SIGIENTES DATOS********************";

for (f=0; f<5; f++)
{
	cout<<"\nCONTEO DE LLAMADAS: ";
	cout<<"\nLLAMADA :"<<f;
	cout<<"\nCANTIDAD DE MINUTOS:";
	cin>>matriz[f][0] ;
	cout<<"\nTIPO DE LLAMADA:";
	cout<<"\nPRESIONE:";
	cout<<"\nLOCAL= 1";
	cout<<"\nCELULAR= 2";
	cout<<"\nINTERNACIONAL= 3";
	cin>>matriz[f][1] ;
	cout<<"TARIFA DE LLAMADA:";
	if( matriz[f][1]==1)
	{
		matriz[f][2]= 0.40;
		cout<<matriz[f][2];
	}
	else if ( matriz[f][1]==2 )
	{
		matriz[f][2]= 3.50;
		cout<<matriz[f][2];
	}
	else
	{
		matriz[f][2]= 5.00;
		cout<<matriz[f][2];
	}
	 cout<<endl<<"\nCOSTO DE LA LLAMADA:";
	if( matriz[f][1]==1)
	{
		matriz[f][3]= ( matriz[f][1]* 0.40 );
		cout<<matriz[f][3];
	}
	else if ( matriz[f][1]==2 )
	{
		matriz[f][3]=(matriz[f][1]*3.50 );
		cout<<matriz[f][3];
	}
	else
	{
		matriz[f][3]=( matriz[f][1]*5.00 );
		cout<<matriz[f][3];
	}
	cout<<"MONTO DEL IMPUESTO:";
	if( matriz[f][1]==1)
	{
		matriz[f][4]=(( matriz[f][1]* 0.40 )* 0.07);
		cout<<endl<<matriz[f][4]<<endl;
	}
	else if ( matriz[f][1]==2 )
	{
		matriz[f][4]=((matriz[f][1]*3.50 )* 0.07);
		cout<<endl<<matriz[f][4]<<endl;
	}
	else
	{
		matriz[f][4]=((matriz[f][1]*5.00 )*0.07);
		cout<<endl<<matriz[f][4]<<endl;
	}
	cout<<endl<<"*** MONTO FINAL A PAGAR ***"<<endl;
	if( matriz[f][1]==1)
	{
		matriz[f][5]= ( matriz[f][1]*0.40 )* 0.07 +  ( matriz[f][1]*0.40 ) ;
		cout<<endl<<matriz[f][5]<<endl;
	}
	else if ( matriz[f][1]==2 )
	{
		matriz[f][5]=(matriz[f][1]*3.50)*0.07 + (matriz[f][1]*3.50);
		cout<<endl<<matriz[f][5]<<endl;
	}
	else
	{
		matriz[f][5]=( matriz[f][1]*5.00 )* 0.07 +  ( matriz[f][1]*5.00 );
		cout<<endl<<matriz[f][5]<<endl;
	}
	cout<<endl<<"                           *** NEXT ALL ***"<<endl<<endl;
	total0= total0 + matriz [f][0];
	total1= total1 + matriz [f][1];
	total2= total2 + matriz [f][2];
	total3= total3 + matriz [f][3];
	total4= total4 + matriz [f][4];
	total5= total5 + matriz [f][5];
	}
	for (f=0; f<5; f++)
	{
		if (matriz[f][0]>may0)
		{
			may0=matriz[f][0];
			aux0=matriz[f][0];
		}
		if (matriz[f][1]>may1)
		{
			may1=matriz[f][1];
			aux1=matriz[f][1];
		}
		if (matriz[f][2]>may2)
		{
			may2=matriz[f][2];
			aux2=matriz[f][2];
		}
		if (matriz[f][3]>may3)
		{
			may3=matriz[f][3];
			aux3=matriz[f][3];
		}
		if (matriz[f][4]>may4)
		{
			may4=matriz[f][4];
			aux4=matriz[f][4];
		}
		if (matriz[f][5]>may5)
		{
			may5=matriz[f][5];
			aux5=matriz[f][5];
		}

	}
	for (f=0; f<5; f++)
	{
		if (matriz[f][0]<aux0)
		{
			men0=matriz[f][0];
			aux0=matriz[f][0];
		}
		if (matriz[f][1]<aux1)
		{
			men1=matriz[f][1];
			aux1=matriz[f][1];
		}
		if (matriz[f][2]<aux2)
		{
			men2=matriz[f][2];
			aux2=matriz[f][2];
		}
		if (matriz[f][3]<aux3)
		{
			men3=matriz[f][3];
			aux3=matriz[f][3];
		}
		if (matriz[f][4]<aux4)
		{
			men4=matriz[f][4];
			aux4=matriz[f][4];
		}
		if (matriz[f][5]<aux5)
		{
			men5=matriz[f][5];
			aux5=matriz[f][5];
		}
	}
	prom0= total0/5;
	prom2= total2/5;
	prom3= total3/5;
	prom4= total4/5;
	prom5= total5=5;
	cout<<"\n********************TOTAL DEL MINUTOS********************";
	cout<<"\nTOTAL DE MINUTOS: "<<total0;
	cout<<"\nTOTAL DE MONTO:  "<<total3;
	cout<<"\nTOTAL DE MONTOS CON IMPUESTO : "<<total4;
	cout<<"\nTOTALES A PAGAR:  "<<total5<<endl<<endl;
	cout<<"\n********************LOS PROMEDIOS SON********************";
	cout<<"\nPROMEDIO DE MINUTOS: "<<prom0;
	cout<<"\nPROMEDIO DE MONTO: "<<prom3<<endl;
	cout<<"\nPROMEDIO DE MONTO CON IMPUESTO "<<prom4<<endl,
	cout<<"\nPROMEDIO DE PAGOS:  "<<prom5<<endl<<endl;
	cout<<"\n********************LOS MAXIMOS SON********************";	
	cout<<"\nMAYOR CANTIDAD DE MINUTOS: "<<may0<<endl,
	cout<<"\nMAYOR MONTO: "<<may3<<endl;
	cout<<"\nMAYOR MONTO CON IMPUESTO: "<<may4<<endl,
	cout<<"\nMAYOR PAGO:  "<<may5<<endl;
	cout<<"\n********************LOS MENORES SON********************";
	cout<<"\nMENOR CANTIDAD DE MINUTOS: "<<men0<<endl,
	cout<<"\nMENOR MONTO:  "<<men3<<endl;
	cout<<"\nMENOR MONTO CON IMPUESTO: "<<men4<<endl;
	cout<<"\nMENOR PAGO: "<<men5<<endl<<endl;

}