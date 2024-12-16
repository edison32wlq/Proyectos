# Solicitar el tamaño del bucle
limite = int(input("Ingrese cuantos numeros quieres ingresar\n")) # Aqui ingreso el valor del bucle

tipo = input("Ingrese si quiere PAR (p) o IMPAR (ip)\n") # Aqui solicito si quiere PAR o IMPAR

# Inicializar con 0 la suma 
suma = 0



# Crear el bucle
for i in range(limite):
    n = int(input(f"{i +1}. ingrese un numero : "))
    if tipo == "p" and n%2 == 0:
        suma += n
        print(f"{suma - n} + {n} = {suma}")
    elif tipo == "ip" and n%2 != 0:
        suma += n
        print(f"{suma - n} + {n} = {suma}")


print(f"El valor de la suma es: {suma}\n")

