 #include<iostream>
 using namespace std;
 int n,edad,codigo,i,d=0,tf=0,tm=0,tc=0;
 float pd,pf,pm,pc;
 char sexo;
 int main()
 {
 	cout<<"\n programa de claculo de datos estadistios de accidentes";
 	cout<<"\n Ingrese el numero de accidentes a ingresar";
 	cin>>n;
 	
 	for(i=1;i<=n;i+1)
 	{
 		cout<<"\n Ingrese la edad del conductor "<<i<<":"	;
 		cin>>edad;
 		cout<<"\n Ingrese el sexo (f=femenino, m=masculino)  " <<i<<":";
 		cout<<"\n Ingrese el codifo de seguridad (1=capital, 2=provincia)   " <<i<<":" ;
 		cin>>codigo;
 		
 		if (edad < 25)
 		{
 			d=d+1;
		}
		if(sexo=='f')
		{
			tf=tf+1;
		}
		if(sexo=='m'&& edad>=17 && edad<=25)
		{
			tm=tm+1;
		}
		if(codigo==1)
		{
			tc=tc+1;
		}
	}
	pd=(d*100)/n;;
	pf=(tf*100)/n;
	pm=(tm*100)/n;
	pc=(tc*100)/n;
	
	cout<<"\n Reporte de accidentes";
	cout<<"\n El porcentaje de conductores menores a 25 años es: "<<pd<<"%";
	cout<<"\n El porcentaje de mujeres es: "<<pf<<"%";
	cout<<"\n El porcentaje de hombres que tienen entre 18 y 25 años es: "<<pm<<"%";
	cout<<"\n El porcentaje de coductores que son de la capital: "<<pc<<"%";
 }