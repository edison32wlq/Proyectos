compras = []
for i in range(3):
    a = input("Ingrese el producto que desea:\n")
    compras.append(a)
print("------------LISTA DE PRODUCTOS---------------------")
for elementos in compras:
    print(elementos)
print("---------------LISTA DE PRODUCTOS------------------")
compras.pop()
for elementos in compras:
    print(elementos)