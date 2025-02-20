import random

usuarios = []

# EDISON
print("\n========== BIENVENIDOS A LA COOPERATIVA DE AHORRO Y CRÉDITO MAEDA ==========")
print("             ¨La mejor cooperativa para guardar tu dinero¨\n")

while True:
    print("1. Registrar usuario")
    print("2. Iniciar sesión")
    print("3. Salir")
    opcion1 = input("Elige una opción: ")
    
    if opcion1 == "1":
        print("\n--- Registro de usuario ---")
        nombreUsuario = input("Elige un nombre de usuario: ")
        
        # Verificar que el nombre de usuario no esté en uso
        nombreExistente = any(usuario["nombre_usuario"] == nombreUsuario for usuario in usuarios)
        if nombreExistente:
            print("Ese nombre de usuario ya está en uso. Intenta con otro.\n")
            continue
        
        nombre = input("Nombre: ")
        apellido = input("Apellido: ")
        while True:
            try:
                edad = int(input("Edad: "))
                if edad < 18:
                    print("No puedes registrarte porque eres menor de edad.\n")
                    exit()  
                break  
            except ValueError:
                print("Por favor, ingresa un número válido para la edad.")
        
        correo = input("Correo electrónico: ")
        
        contraseña = str(random.randint(1000, 9999))
        print("==============================================")
        print(f"Tu contraseña generada es: {contraseña}\n")
        print("==== PODRÁS CAMBIAR TU CONTRASEÑA DESPUÉS ====\n")
        
        usuario = {
            "nombre_usuario": nombreUsuario,
            "nombre": nombre,
            "apellido": apellido,
            "edad": edad,
            "correo": correo,
            "contraseña": contraseña,
            "saldo": 0,  
            "movimientos": [] 
        }
        usuarios.append(usuario)
        print("Usuario registrado exitosamente.\n")
        
    elif opcion1 == "2":
        if not usuarios:
            print("No hay usuarios registrados. Por favor, regístrate primero.\n")
            continue
        
        print("\n--- Iniciar sesión ---")
        nombreUsuario = input("Nombre de usuario: ")
        contraseña = input("Contraseña: ")
        
        encontrado = False
        for usuario in usuarios:
            if usuario["nombre_usuario"] == nombreUsuario and usuario["contraseña"] == contraseña:
                print("¡Inicio de sesión exitoso!\n")
                encontrado = True
                
                while True:

                    print("\n--- Menú de opciones ---")
                    print("1. Modificar datos")
                    print("2. Consultar saldo y movimientos")
                    print("3. Depositar")
                    print("4. Retirar")
                    print("5. Pedir préstamo")
                    print("6. Cerrar sesión")
                    opcion2 = input("Elige una opción: ")
                    
                    # ALEXIS
                    if opcion2 == "1":
                        print("\n========== Datos actuales del usuario ==========")
                        print(f"Nombre: {usuario['nombre']}")
                        print(f"Apellido: {usuario['apellido']}")
                        print(f"Edad: {usuario['edad']}")
                        print(f"Correo electrónico: {usuario['correo']}")
                        print(f"Contraseña: {usuario['contraseña']}\n")
                        print("=================================================")

                        while True:
                            print("¿Qué dato deseas modificar?")
                            print("1. Nombre")
                            print("2. Apellido")
                            print("3. Edad")
                            print("4. Correo electrónico")
                            print("5. Contraseña")
                            print("6. Salir")
                            modificar = input("Elige una opción: ")
                        
                            if modificar == "1":
                                print(f"Nombre actual: {usuario['nombre']}")
                                usuario["nombre"] = input("Nuevo nombre: ")
                            
                            elif modificar == "2":
                                print(f"Apellido actual: {usuario['apellido']}")
                                usuario["apellido"] = input("Nuevo apellido: ")
                            
                            elif modificar == "3":
                                print(f"Edad actual: {usuario['edad']}")
                                
                                while True:
                                    try:
                                        nueva_edad = int(input("Nueva edad: "))
                                        if nueva_edad < 18:
                                            print("Edad no válida. Debes ser mayor de 18 años.\n")
                                        else:
                                            usuario["edad"] = nueva_edad
                                            print("Edad actualizada exitosamente.")
                                            break
                                    except ValueError:
                                        print("Por favor, ingresa un número válido para la edad.")
                            
                            elif modificar == "4":
                                print(f"Correo actual: {usuario['correo']}")
                                usuario["correo"] = input("Nuevo correo electrónico: ")
                           
                            elif modificar == "5":
                                confirmacion = input("¿Deseas cambiar la contraseña? (si/no): ").lower()
                                if confirmacion == "si":
                                    usuario["contraseña"] = input("Ingrese su nueva contraseña: ")
                                    print(f"Nueva contraseña: {usuario['contraseña']}")
                                else:
                                    print("La contraseña no se ha cambiado.")
                            
                            elif modificar == "6":
                                break
                           
                            else:
                                print("Opción no válida.")
                            print("\n========== Datos actualizados del usuario ==========")
                            print(f"Nombre: {usuario['nombre']}")
                            print(f"Apellido: {usuario['apellido']}")
                            print(f"Edad: {usuario['edad']}")
                            print(f"Correo electrónico: {usuario['correo']}")
                            print(f"Contraseña: {usuario['contraseña']}")
                            print("=====================================================\n")

                    # MARTIN
                    elif opcion2 == "2":
                        print(f"\nTu saldo actual es: ${usuario['saldo']:}")
                        if usuario["movimientos"]:
                            while True:
                                print("==========================================")
                                print("Opciones de filtrado")
                                print("1. Ver todos los movimientos")
                                print("2. Filtrar por tipo")
                                print("3. Volver al menú principal")
                                print("==========================================")
                                opcion_filtrar = input("Elige una opción: ")
                                
                                if opcion_filtrar == "1":
                                    print("==========================================")
                                    for movimiento in usuario["movimientos"]:
                                        tipo = movimiento['tipo']
                                        monto = movimiento['monto']
                                        print(f"{tipo}: ${monto:}")
                                    break
                                
                                elif opcion_filtrar == "2":
                                    print("==========================================")
                                    print("Tipos de movimientos:")
                                    print("1. Depósito")
                                    print("2. Retiro")
                                    print("3. Préstamo")
                                    print("==========================================")
                                    tipo_filtrado = input("Elige un tipo de movimiento: ")

                                    if tipo_filtrado == "1":
                                        print("==========================================")
                                        tipo = "Depósito"
                                        print("==========================================")
                                    elif tipo_filtrado == "2":
                                        print("==========================================")
                                        tipo = "Retiro"
                                        print("==========================================")
                                    elif tipo_filtrado == "3":
                                        print("==========================================")
                                        tipo = "Préstamo"
                                        print("==========================================")
                                    else:
                                        print("Opción no válida.")
                                        continue

                                    print(f"\nMovimientos de tipo {tipo}:")
                                    for movimiento in usuario["movimientos"]:
                                        if movimiento['tipo'] == tipo:
                                            monto = movimiento['monto']
                                            print(f"{tipo}: ${monto:}")
                                    break

                                elif opcion_filtrar == "3":
                                    break

                                else:
                                    print("==========================================")
                                    print("Opción no válida.\n")
                        else:
                            print("==========================================")
                            print("No hay movimientos registrados.\n")

                    # ALEYDA
                    elif opcion2 == "3":
                        try:
                            monto = float(input("Monto a depositar: $"))
                            if monto > 0:
                                usuario["saldo"] += monto
                                usuario["movimientos"].append({
                                    "tipo": "Depósito",
                                    "monto": monto
                                })
                                print(f"Depósito exitoso. Nuevo saldo: ${usuario['saldo']:.2f}\n")
                            else:
                                print("El monto debe ser mayor a cero.\n")
                        except ValueError:
                            print("Error: ---- Debes ingresar un número válido. ----\n")

                    elif opcion2 == "4":
                        try:
                            monto = float(input("Monto a retirar: $"))
                            if 0 < monto <= usuario["saldo"]:
                                usuario["saldo"] -= monto
                                usuario["movimientos"].append({
                                    "tipo": "Retiro",
                                    "monto": monto
                                })
                                print(f"Retiro exitoso. Nuevo saldo: ${usuario['saldo']:.2f}\n")
                            else:
                                print("Monto inválido o saldo insuficiente.\n")
                        except ValueError:
                            print("Error: ---- Debes ingresar un número válido. ----\n")

                    # DAVID
                    elif opcion2 == "5":
                        print("Ingresa el valor del préstamo, debe ser mínimo de $500 y máximo de $2000")
                        try:
                            monto = float(input("Monto del préstamo: $"))    
                            if monto < 500 or monto > 2000:
                                print("El monto del préstamo debe estar entre $500 y $2000.\n")
                            else:
                                print("Opciones de interés:")
                                print(" - 10% anual para préstamos de 6 meses.")
                                print(" - 14% anual para préstamos de 12 meses.\n")
                                
                                plazo = int(input("Plazo del préstamo, ingresa ¨6¨ si deseas a 6 meses o ¨12¨ si deseas a 12 meses: "))
                                
                                if plazo == 6:
                                    tasaInteres = 0.10  
                                elif plazo == 12:
                                    tasaInteres = 0.14  
                                else:
                                    print("Solo se aceptan plazos de 6 o 12 meses.\n")
                                    continue
                                
                                interesTotal = monto * tasaInteres * (plazo / 12)
                                montoTotal = monto + interesTotal
                                
                                print(f"\nDesglose del préstamo:")
                                print(f" - Monto solicitado: ${monto:.2f}")
                                print(f" - Interés generado: ${interesTotal:.2f}")
                                print(f" - Monto total a pagar: ${montoTotal:.2f}\n")
                                
                                confirmar = input("¿Deseas aceptar el préstamo? (si/no): ").lower()
                                if confirmar == "si":
                                    usuario["saldo"] += monto
                                    usuario["movimientos"].append({
                                        "tipo": "Préstamo",
                                        "monto": monto,
                                        "interes": round(interesTotal, 2),
                                        "monto_total": round(montoTotal, 2),
                                        "plazo": plazo
                                    })
                                    print(f"Préstamo aprobado. Nuevo saldo: ${usuario['saldo']:.2f}\n")
                                else:
                                    print("Préstamo cancelado.\n")
                        except ValueError:
                            print("Error: ---- Debes ingresar un número válido. ----\n")

                    elif opcion2 == "6":
                        print("Cerrando sesión.\n")
                        break
                    else:
                        print(" ---- Opción no válida. ---- ")
                break
        if not encontrado:
            print("Nombre de usuario o contraseña incorrectos.\n")

    elif opcion1 == "3":
        print("Saliendo del programa.......")
        break
    else:
        print(" ---- Opción no válida. ---- \n")