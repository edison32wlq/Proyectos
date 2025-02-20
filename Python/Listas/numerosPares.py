numeros = [1,2,3,4,5,6,7,8,9,10] #lista con numeros del 1 al 10
for numero in numeros: #bucle que imprime numeros pares
    if numero % 2 == 0:
        print(numero)

numeros.append(12) # Agregar numero 12 a las lista
print("-----------------------------------")
for numero in numeros: #imprimir
    if numero % 2 == 0:
        print(numero)