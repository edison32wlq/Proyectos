print ("Hola Mundo")

def suma(a,b):
    sum = a+b
    return print (sum)

suma(3,5)


q = 5 
w = 6.354852
s = "Hola"

Comp = True
print (q,w)

print(f"El valor de x es: {q} El valor de y es {w}")

x = 5
y= 7

z = 5 + 6
#valor x valor y valor z
print (f"La suma de: {x} + {y} = {z}")
print(x,y,z, sep = " valor ")

#Aqui imprime A B C y la suma 
print ("A","B","C", sep ="-", end =" ")
#Aqui imprime el resultado de la suma
print (z)
print("")

# El texto esta en una sola cadena de texto
print("PRESENTACION: \nEdison Ludeña \n20 años \nsegui la carrera por que me gusta programar y tener el control del codigo que creo\n")

#variable con el nombre
nombre = "Edison"
#variable con el apellido
apellido = "Ludeña"
#variable con la edad
edad = "20 años"
#variable que explica por que escogio la carrera
carrera = "segui la carrera por que me gusta programar y tener el control del codigo que creo "
#este print presenta la informacion de las varibles
print(f"Mi nombre es {nombre} {apellido}, tengo {edad}, {carrera}")
print("")

# a + b =  resultado
# cuando es mayor a 10

n = int(input("Ingrese el primer valor: "))
m = int(input("Ingrese el segundo valor: "))

p = m+n

print("Su resultado es: ",p)
if p > 10:
    print("El numero es mayor a 10")
else:
    print("El numero es menor a 10")


