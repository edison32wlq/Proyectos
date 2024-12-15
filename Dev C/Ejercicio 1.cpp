#include <stdio.h>
int a,r,i;
int main ()
{
	printf("\n Ingrese los años que lleva trabajando en la empresa");
	scanf ("%d",&a);
	
	i = 40000;
	if (a<3)
	{
		r = (i * (3%100));
		{
			if (a>5 && a<3)
			{
			r = (i * (5%100)) ;
			}
			if (a>5 && a>3)
			{
				r = (i *(7%100)); 
			}
			if (a>10)             
				{       
					r = (i * (10%100)); 
				}
			
		} 
	}
	printf ("\n el sueldo que recibira es de %d euros \n", (r + i));  
}
	
	
	
	
	