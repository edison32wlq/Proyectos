def comparacion():
    a = int(input("Ingrese el primer numero: "))
    b = int(input("Ingrese el segundo numero: "))

    if a > b:
        print("El primer numero es mayor al segundo")
    elif b > a:
        print("El segundo numero es mayor al primero")
    else:
        print("Los numeros son iguales")
comparacion()
def area():
    radio = float(input("Ingrese el radio del circulo"))
    totalArea = ((radio * radio)* 3.14)
    print(f"El area del ciculo es: {totalArea}")
area()
def saludo():
    print("Hola como estas")
saludo()
def parImpar():
    num = int(input("Ingrese un numero"))
    if num %2 == 0:
        print("El numero es par ")
    else:
        print("El numero es impar ")
parImpar()
def grados():
    temp = int(input("Ingrese la temperatura en grados Celsius: /n"))
    fahrenheit = (temp * (9/5) + 32)
    print(f"La temperatura en grados Fahrenheit es: {fahrenheit}")
grados()