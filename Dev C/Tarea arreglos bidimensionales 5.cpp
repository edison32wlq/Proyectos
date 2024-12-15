#include <iostream>
using namespace std;
int main ()
{
	int a[12],b[5],l=0,c=0,st=0,sd=0,vl=0,n,h,velo=0;
    int z[12][5],j=0,i=0;
    char mes[12][12]={"ENE","FEB","MAR","ABR","MAY","JUN","JUL","AGO","SEP","OCT","NOV","DIC"};
    char suc[5][12]={"Lomas","Vallejo","Perisur","Del Valle","Oriente"};
    int w;
    float prom=0;
    cout<<"\nPrograma automotriz";
    for(n=0;n<=4;n++)
    {
    	for(h=0;h<=11;h++)
        {
        	cout<<"\nIngrese las ventas de la sucursal"<<suc[n],mes[h];
        	cin>>z[h][n];
		}
		cout<<"\n \t";
	}
	for(h=0;h<=11;h++)
    {
    	cout<<"\n"<<mes[h];
	}
	cout<<"\n\n";
	for(n=0;n<=4;n++)
     {
        cout<<"\n"<<suc[n];
        for(h=0;h<=11;h++)
            {           
     			cout<<"\n"<<z[h][n];
     		}
     	cout<<"\n";	
     }
     
    fflush(stdin);
    getchar();
}