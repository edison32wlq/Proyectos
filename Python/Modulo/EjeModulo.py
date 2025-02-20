# Crear un aplicativo matematico que el usuario pueda utilizar funciones especificas

import math
#raiz, algo con pi, redondear
#que el esuario ingrese el valor que quiere para las operaciones
#interfaz con usuario
#hacerlo que funcione

print("Bienvenido a Mates divertidas")
print("porfavor sekecciona que deseas realizar")
print("1. La raiz")
print("2. El valor con pi")
print("3. El poder redondear")
valor1= float(input("Ingrese un valor: "))
raiz = math.sqrt(valor1)
print(f"La raiz de {valor1} es: {raiz}\n")


print("Ahora vamos a multiplicar un valor por pi")
valor2 = float(input("Ingrese un valor: "))
pi= round(math.pi,2)
mult = pi * valor2
multiplicacion = round(mult,2)

print(f"El valor de la multiplicacion entre {valor2} y {pi} redondeado a dos decimales eses: {multiplicacion}\n")


valor3 = int(input("Ingrese el valor para redondear eulear a decimales: "))
redond=round(math.e,valor3)
print(f"El valor  de redond es: {redond}\n")