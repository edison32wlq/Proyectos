

i = 0
j = 0
k = 0 
while  i <=3 :  
    i+=1
    j+=1
    k+=1  
    while j <= 3:
        print(i," ",j," ",k)
        break
  
#####################################################################################################+

filas = 3
columnas = 3
matriz = [[0] * columnas for _ in range(filas)]  # Crear una matriz vacía de 3x4
contador = 1

m = 0
while m < columnas:
    n = 0
    while n < filas:
        matriz[n][m] = contador
        contador += 1
        n += 1
    m += 1

for fila in matriz:
    print(fila)