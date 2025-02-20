from math import pi,sqrt
import datetime as dt

numero = 10
raiz__cuadrada = sqrt(numero)
print(f"la raiz de {numero} es: {raiz__cuadrada}")


def saludar(nombre):
    return f"hola", {nombre}

def suma(a,b):
    return a+b

print(f"El valor de pi es : {pi}")
print(f"La raiz del numero {sqrt(16)}")

fecha_actual= dt.datetime.now
print(f"La fecha actual es: {fecha_actual}")