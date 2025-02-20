import random
print("Vas a jugar piedra papel o tijera contra el computador")
print("Para PIEDRA digita 1")
print("Para PAPEL digita 2")
print("Para TIJERA digita 3")

while True:
    miEleccion = int(input("Escoga una opcion: "))

    if miEleccion == 1:
        print("\nELEGISTE PRIEDRA\n")
        break
    elif miEleccion == 2:
        print("\nELEGISTE PAPEL\n")
        break
    elif miEleccion == 3:
        print("\nELEGISTE TIJERA\n")
        break
    else:
        print("\n============ DEBE ELEGIR UN NUMERO ENTRE 1 Y 3 ============\n")

eleccionCompu = random.randint(1,3)

if eleccionCompu == 1:
    print("LA COMPU ELIGIO PIEDRA\n")
elif eleccionCompu == 2:
    print("LA COMPU ELIGIO PAPEL\n")
elif eleccionCompu == 3:
    print("LA COMPU ELIGIO TIJERA\n")

if miEleccion == 1 and eleccionCompu == 1:
    print("NADIE GANA\n")
elif miEleccion == 1 and eleccionCompu == 2:
    print("TE GANO LA COMPU XD\n")
elif miEleccion == 1 and eleccionCompu == 3:
    print("FELICIDADES LE GANASTE A LA COMPU\n")
elif miEleccion == 2 and eleccionCompu == 1:
    print("FELICIDADES LE GANASTE A LA COMPU\n")
elif miEleccion == 2 and eleccionCompu == 2:
    print("NADIE GANA\n")
elif miEleccion == 2 and eleccionCompu == 3:
    print("TE GANO LA COMPU XD\n")
elif miEleccion == 3 and eleccionCompu == 1:
    print("TE GANO LA COMPU XD\n")
elif miEleccion == 3 and eleccionCompu == 2:
    print("FELICIDADES LE GANASTE A LA COMPU\n")
elif miEleccion == 3 and eleccionCompu == 3:
    print("NADIE GANA\n")

