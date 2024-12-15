 #include <iostream>
 using namespace std;
 int M[5][5],i,j, mayor, menor;
 int main()
 {
 	cout<<"\n Ingresar los elementos para M, deben ser impares ";
 	cout<<"\n Ingrese los numeros impares:";
	for(i=0;i<5;i=i+1)	
	{
		for (j=0;j<5;j=j+1)
		{
			do
			{
				cout<<"\n M["<<i<<"]["<<j<<"]";
				cin>>M[i][j];
			}
			while(M[i][j] %2 == 0);
		}
	}
	mayor= M[0][0];
	for(i=0;i<5;i=i+1)	
	{
		for (j=0;j<5;j=j+1)
		{
			if (M[i][j]>mayor)
			{
				mayor = M[i][j];
			}
		}
	}
	menor= M[0][0];
	for(i=0;i<5;i=i+1)	
	{
		for (j=0;j<5;j=j+1)
		{
			if (M[i][j]<menor)
			{
				menor = M[i][j];
			}
		}
	}
	cout<<"\n El numero mayor es: "<<mayor;
	cout<<"\n El numero menor es: "<<menor;
}