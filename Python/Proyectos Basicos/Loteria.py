print("---------------------- Bienvenido al juego de LuckyLotery------------------------")
print("A continuación vamos a jugar")
print("Deberan coincidir tus numeros con los ganadores")
print("\n4 aciertos, PREMIO MAYOR ")
print("2 aciertos, PREMIO MEDIANO")
print("1 cierto, PREMIO PEQUEÑO")
print("")
print("Si ganas el premio mayor no tendras mas intentos\n")
print("Tendras 3 intentos, usalos bien")
print("----------------------------------------------------------------\nIngrese 4 números del 1 al 150")


ganador = [1, 7, 13, 19, 26, 29, 31, 35, 44, 48, 53, 59, 61, 66, 70, 77, 81, 88, 95, 100, 104, 125, 134, 141, 149]
repetir = True

while repetir:
    intentos = 0
    aciertos = []  

    while intentos < 3:
        numeros = []
        print(f"\n--------------------------- Intento {intentos + 1} de 3 -----------------------------")

        while len(numeros) < 4:
            try:
                n = int(input("Ingrese un número: "))
                if 0 < n < 151:
                    if n not in numeros and n not in aciertos:  
                        numeros.append(n)
                    elif n in aciertos:
                        print("Ya acertaste este número en un intento anterior. Intenta con otro.")
                    else:
                        print("Ya ingresaste ese número en este intento, intenta con otro.")
                else:
                    print("Número fuera del rango, ingrese un número válido.")
            except ValueError:
                print("Ingrese un numero valido")

        igual = []
        for num in numeros:
            if num in ganador:
                igual.append(num)

        for acierto in igual:
            if acierto not in aciertos:
                aciertos.append(acierto)

        coincidencias = len(igual)

        if coincidencias >= 4:
            print(f"\n¡Felicidades! Coincidencias: {coincidencias}. Premio mayor\nTE HAS GANADO UN CARRO")
  
            intentos = 3 
            break
        elif coincidencias == 2:
            print("\n¡Ganaste un premio mediano\nGANASTE $10 DOLARES")
        elif coincidencias == 1:
            print("\nGanaste un premio pequeño\nGANASTE $1 DOLAR ")
        else:
            print("No has ganado nada")
        
        print(f"\nNúmeros acertados en este intento: {igual}")
        print(f"Números acertados en todos los intentos: {len(aciertos)}\n")
        intentos += 1

    while True: 
        respuesta = input("¿Deseas volver a jugar? (si/no): ").strip().lower()
        if respuesta == "si":
            repetir = True   
            break  
        elif respuesta == "no":
            repetir = False
            print("\n------------------------------------------------------------------")
            print("Gracias por jugar. ¡Hasta la próxima!")
            print("------------------------------------------------------------------")
            break 
        else:
            print("Por favor, responde con 'si' o 'no'.")  
