import random

usuarios = []


#   EDISON
print("\n========== BIENVENIDOS A LA COPERATIVA DE AHORRO Y CREDITO MAEDA ==========")
print("             ¨ la mejor coperativa para guardar tu dinero¨\n")
while True:
    print("1. Registrar usuario")
    print("2. Iniciar sesión")
    print("3. Salir")
    opcion1 = input("Elige una opción: ").strip()
    
    if opcion1 == "1":
        print("\n--- Registro de usuario ---")
        nombreUsuario = input("Elige un nombre de usuario: ")
        
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
                    print("\nNo puedes registrarte porque eres menor de edad :(.\n")
                    print("================================================================================\n")
                    print("Esperamos que en el futuro puedas registrarte y ahorrar para tu futuro.")
                    print("\n================================================================================\n")
                    break  
                break
            except ValueError:
                print("Por favor, ingresa solo dígitos para la edad.")
        
        if edad < 18:   
            continue
        correo = input("Correo electrónico: ")
        
        password = str(random.randint(1000, 9999))
        print("==============================================")
        print(f"Tu contraseña generada es: {password}\n")
        print("==== PODRAS CAMBIAR TU CONTRASEÑA DESPUES ====\n")
        
        usuario = {
            "nombre_usuario": nombreUsuario,
            "nombre": nombre,
            "apellido": apellido,
            "edad": edad,
            "correo": correo,
            "password": password,
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
        password = input("Contraseña: ")
        
        encontrado = False
        for usuario in usuarios:
            if usuario["nombre_usuario"] == nombreUsuario and usuario["password"] == password:
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
                    opcion2 = input("Elige una opción: ").strip()
                    
                    # ALEXIS
                    if opcion2 == "1":
                        print("\n========== Datos actuales del usuario ==========")
                        print(f"Nombre: {usuario['nombre']}")
                        print(f"Apellido: {usuario['apellido']}")
                        print(f"Edad: {usuario['edad']}")
                        print(f"Correo electrónico: {usuario['correo']}")
                        print(f"Contraseña: {usuario['password']}\n")
                        print("=================================================")

                        while True:
                            
                            print("¿Qué dato deseas modificar?")
                            print("1. Nombre")
                            print("2. Apellido")
                            print("3. Edad")
                            print("4. Correo electrónico")
                            print("5. Contraseña")
                            print("6. Salir")
                            modificar = input("Elige una opción: ").strip()
                        
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
                                        nuevaEdad = int(input("Nueva edad: "))
                                        if nuevaEdad < 18:
                                            print("Edad no válida. Debes ser mayor de 18 años.\n")
                                        else:
                                            usuario["edad"] = nuevaEdad
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
                                    usuario["password"] = input("Ingrese su nueva contraseña: ")
                                    print(f"Nueva contraseña : {usuario['password']}")
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
                            print(f"Contraseña: {usuario['password']}")
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
                                opcionFiltrar = input("Elige una opción: ")
                                
                                if opcionFiltrar == "1":
                                    print("==========================================")
                                    for movimiento in usuario["movimientos"]:
                                        tipo = movimiento['tipo']
                                        monto = movimiento['monto']
                                        print(f"{tipo}: ${monto:}")
                                    break
                                
                                elif opcionFiltrar == "2":
                                    print("==========================================")
                                    print("Tipos de movimientos:")
                                    print("1. Depósito")
                                    print("2. Retiro")
                                    print("3. Préstamo")
                                    print("==========================================")
                                    tipoFiltrado = input("Elige un tipo de movimiento: ")

                                    if tipoFiltrado == "1":
                                        print("==========================================")
                                        tipo = "Depósito"
                                        print("==========================================")
                                    elif tipoFiltrado == "2":
                                        print("==========================================")
                                        tipo = "Retiro"
                                        print("==========================================")
                                    elif tipoFiltrado == "3":
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

                    # ALEYDA
                    elif opcion2 == "3":
                        if "depositosHoy" not in usuario:
                            usuario["depositosHoy"] = 0 

                        try:
                            print("\n============================================")
                            print("PODRAS DEPOSITAR UN MAXIMO DE $1000 AL DIA\n")
                            monto = float(input("Monto a depositar: $"))
                            if monto > 0:
                                if usuario["depositosHoy"] + monto <= 1000:
                                    usuario["saldo"] += monto
                                    usuario["movimientos"].append({
                                    "tipo": "Depósito",
                                    "monto": monto
                                    })
                                    usuario["depositosHoy"] += monto
                                    print(f"Depósito exitoso. Nuevo saldo: ${usuario['saldo']}\n")
                                    print(f"Total depositado en esta sesión: ${usuario['depositosHoy']}/1000\n")
                                else:
                                    print("Límite de depósito de $1000 por dia alcanzado o excedido. Intenta con un monto menor.\n")
                            else:
                                print("El monto debe ser mayor a cero.\n")
                        except ValueError:
                            print("Error: ---- Debes ingresar un número válido. ----\n")

                    elif opcion2 == "4":
                        try:
                            print("\n===============================")
                            print(f"Saldo Actual: ${usuario['saldo']}\n")

                            monto = float(input("Monto a retirar: $"))
                            if 0 < monto <= usuario["saldo"]:
                                usuario["saldo"] -= monto
                                usuario["movimientos"].append({
                                    "tipo": "Retiro",
                                    "monto": monto
                            })
                                print(f"Retiro exitoso. Nuevo saldo: ${usuario['saldo']}\n")
                            else:
                                print("==== Monto inválido o insuficiente saldo. ====\n")
                        except ValueError:
                            print("Error: ---- Debes ingresar un número válido. ----\n")


                    # DAVID
                    elif opcion2 == "5":
                        print("\n========================================================================")
                        print("Ingresa el valor del préstamo, debe ser mínimo de $500 y máximo de $2000")
                        
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
                            
                            confirmar = input("¿Deseas aceptar el préstamo? (si/no): ").strip().lower()
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
                    elif opcion2 == "6":
                        print("Cerrando sesión.\n")
                        break
                    else:
                        print(" \n---- Opción no válida. ---- \n")
                break
        if not encontrado:
            print("Nombre de usuario o contraseña incorrectos.\n")

    elif opcion1 == "3":
        print("\nSaliendo del programa.......")
        break
    else:
        print("\n ---- Opción no válida. ---- \n")

