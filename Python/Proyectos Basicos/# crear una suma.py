# crear una suma 
# que el resultado me diga si es mayor a 20
# que el usuario ingrese los valores
# quiero que la suma sea de 10 numeros ingresados por el usuario
# que imprima la sumatoria total acumulada

print ("---------- Bienvenido a la calculador de suma ----------")
print ("--------------------------------------------------------")
name = str(input("Ingresa tu nombre: \n"))
print("----------------------------------------------------------\n")
print("A continuacion deberas ingresar 10 numeros enteros para la suma \n")

suma = 0 

for i in range (10):
    n = int(input(f"{i +1}. ingrese un numero : "))
    suma = suma + n
    #print (suma)

print (f"El valor de la suma es: {suma}\n")

if suma >20: 
    print("La suma es mayor a 20")
elif suma < 20:
    print ("La suma es menor a 20")
else:
    print("Es el numero 20")
print("\n-----------------------------------------------\n")
print(f"Gracias {name} por usar nuestra aplicacion\n")