numeros = [9,8,1,4,5,3]

numeros.sort()

print(len(numeros))

numeros.reverse()

print(numeros.count(3))
print(numeros)

for elemento in numeros:
    print(elemento)

# Iterar sirve para dar un mismo proceso a todo el contenido de la lista pero encapsulado
cuadrado = [x+1 for x in range(6)] 
print(cuadrado)