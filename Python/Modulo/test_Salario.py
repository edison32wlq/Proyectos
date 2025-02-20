## El cliente necesita saber el nombre de sus trabajadores, junto con cuantas horas extras a trabajado
## y el sueldo total que debe pagar a sus trabajadores

import Mod_salario

print("Bienvenido a la calculadora de sueldos")
nombre = input("Ingrese su nombre: ")
apellido = input("Ingrese su apellido: ")
edad = input("Ingrese su edad: ")
print("\n-----------------------------------------------------------\n")
while True:
    try:
        horas = float(input("Ingrese cuántas horas trabaja al mes (máximo permitido: 300 horas): "))
        if horas < 0 or horas > 300:
            print("Debe ser entre 0 y 300")
            continue  
        break  
    except ValueError:
        print("Ingrese un numero valido")

while True:
    try:
        pago = float(input("Ingrese cuánto le pagan por hora (máximo permitido: 10): "))
        if pago < 1 or pago > 10:
            print("Debe ser entre 1 y 10")
            continue  
        break 
    except ValueError:
        print("Ingrese un numero valido")
sueldo = Mod_salario.salario(horas,pago)

if isinstance(sueldo, str):  
    print(sueldo)
else:
    total = Mod_salario.horas_extras(horas, pago)
    sueldoTotal = Mod_salario.salario_Total(sueldo, total)

    resultado = Mod_salario.edison_Ludena(nombre, apellido, edad, horas, sueldo, total, sueldoTotal)
    print(resultado)