import random

print("Bienvenido al juego de dados")

while True:
    name1 = input("Ingrese el nombre del jugador 1: ")
    if name1:
        break
    print("Debe ingresar un nombre")

while True:    
    name2 = input("Ingrese el nombre de jugador 2: ")
    if name2:
        break
    print("Debe ingresar un nombre")

print("_____________________________________________________")
print("Jugador 1 aplaste enter para lanzar el dado: ")
input()
lanzamientoJugador1 = random.randint(1,6)
print(f"{name1} sacaste {lanzamientoJugador1}\n")

print("_____________________________________________________")
print("Jugador 2 aplaste enter para lanzar el dado: ")
input()
lanzamientoJugador2 = random.randint(1,6)
print(f"{name2} sacaste {lanzamientoJugador2}")
print("_____________________________________________________\n")

if lanzamientoJugador1 > lanzamientoJugador2:
    print(f"El ganador es {name1}\n")
elif lanzamientoJugador2 > lanzamientoJugador1:
    print(f"El ganador es {name2}\n")
else:
    print(f"{name1} y {name2} empataron\n")



