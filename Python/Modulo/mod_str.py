print("Bienvenido")
nombre = input("Por favor ingrese su nombre: ").upper()
accion = input("Por favor ingrese su accion: ").lower()

vocales = "aeiouAEIOU"
contador = 0
for letra in nombre:
    if letra in vocales:
        contador += 1
print(f"{nombre} / {accion} / {contador}")
