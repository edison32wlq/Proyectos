 #include <iostream>
 using namespace std; 
 float a[3][3], b[3][3],c[3][3];
 int i,j;
 int main ()
 {
 	cout<<"\n Ingresar los elementos para A ";
	for(i=0;i<3;i=i+1)	
	{
		for (j=0;j<3;j=j+1)
		{
			cout<<"\n a["<<i<<"]["<<j<<"]";
			cin>>a[i][j];
		}
	}
	cout<<"\n Ingresar los elementos para B ";
	for(i=0;i<3;i=i+1)	
	{
		for (j=0;j<3;j=j+1)
		{
			cout<<"\n a["<<i<<"]["<<j<<"]";
			cin>>b[i][j];
		}
	}
	cout<<"\n Resta de a - b";
	for(i=0;i<3;i=i+1)	
	{
		for (j=0;j<3;j=j+1)
		{
			c[i] [j]= a[i][j]-b[i][j];
			cout<<" \t"<<c[i][j];
		}
		cout<<"\n \t";
 	}
 	cout<<"\n Resta de b - a";
	for(i=0;i<3;i=i+1)	
	{
		for (j=0;j<3;j=j+1)
		{
			c[i] [j]= b[i][j] - a[i][j];
			cout<<" \t"<<c[i][j];
		}
		cout<<"\n \t";
 	}
 	cout<<"\n Suma de 2a - 3b";
	for(i=0;i<3;i=i+1)	
	{
		for (j=0;j<3;j=j+1)
		{
			c[i] [j]= (2*a[i][j])-(3*b[i][j]);
			cout<<" \t"<<c[i][j];
		}
		cout<<"\n \t";
 	}
 	cout<<"\n 3 multiplicado por b";
	for(i=0;i<3;i=i+1)	
	{
		for (j=0;j<3;j=j+1)
		{
			c[i] [j]=(3*b[i][j]);
			cout<<" \t"<<c[i][j];
		}
		cout<<"\n \t";
 	}
 	cout<<"\n Resta de 4a - 3b";
	for(i=0;i<3;i=i+1)	
	{
		for (j=0;j<3;j=j+1)
		{
			c[i] [j]= (4*a[i][j])-(3*b[i][j]);
			cout<<" \t"<<c[i][j];
		}
		cout<<"\n \t";
 	}
 }