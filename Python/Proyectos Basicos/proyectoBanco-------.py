import random

# Lista para almacenar los registros
users = []

# Programa principal
while True:
    print("1. Registrar usuario")
    print("2. Iniciar sesión")
    print("3. Salir")
    opcion = input("Elige una opción: ")
    
    if opcion == "1":
        print("\n--- Registro de usuario ---")
        nombre_usuario = input("Elige un nombre de usuario: ")
        
        # Verificar que el nombre de usuario no esté en uso
        nombre_existente = any(user["nombre_usuario"] == nombre_usuario for user in users)
        if nombre_existente:
            print("Ese nombre de usuario ya está en uso. Intenta con otro.\n")
            continue
        
        nombre = input("Nombre: ")
        apellido = input("Apellido: ")
        edad = input("Edad: ")
        correo = input("Correo electrónico: ")
        
        # Generar contraseña de 4 dígitos numéricos
        password = str(random.randint(1000, 9999))
        print(f"Tu contraseña generada es: {password}")
        
        # Guardar los datos en un diccionario y añadir a la lista
        user = {
            "nombre_usuario": nombre_usuario,
            "nombre": nombre,
            "apellido": apellido,
            "edad": edad,
            "correo": correo,
            "password": password,
            "balance": 0,  # Iniciar el balance en 0
            "movimientos": []  # Lista para almacenar los movimientos recientes
        }
        users.append(user)
        print("Usuario registrado exitosamente.\n")
        
    elif opcion == "2":
        if not users:
            print("No hay usuarios registrados. Por favor, regístrate primero.\n")
            continue
        
        print("\n--- Iniciar sesión ---")
        nombre_usuario = input("Nombre de usuario: ")
        password = input("Contraseña: ")
        
        # Buscar al usuario
        encontrado = False
        for user in users:
            if user["nombre_usuario"] == nombre_usuario and user["password"] == password:
                print("¡Inicio de sesión exitoso!\n")
                encontrado = True
                
                # Menú de opciones tras inicio de sesión exitoso
                while True:
                    print("\n--- Menú de opciones ---")
                    print("1. Modificar datos")
                    print("2. Consultar balance y movimientos")
                    print("3. Depositar")
                    print("4. Retirar")
                    print("5. Pedir préstamo")
                    print("6. Cerrar sesión")
                    opcion_modificar = input("Elige una opción: ")
                    
                    if opcion_modificar == "1":
                        print("Datos actuales del usuario:")
                        print(f"Nombre: {user['nombre']}")
                        print(f"Apellido: {user['apellido']}")
                        print(f"Edad: {user['edad']}")
                        print(f"Correo electrónico: {user['correo']}")
                        print("¿Qué dato deseas modificar?")
                        print("1. Nombre")
                        print("2. Apellido")
                        print("3. Edad")
                        print("4. Correo electrónico")
                        print("5. Contraseña")
                        modificar = input("Elige una opción: ")
                        
                        if modificar == "1":
                            print(f"Nombre actual: {user['nombre']}")
                            user["nombre"] = input("Nuevo nombre: ")
                        elif modificar == "2":
                            print(f"Apellido actual: {user['apellido']}")
                            user["apellido"] = input("Nuevo apellido: ")
                        elif modificar == "3":
                            print(f"Edad actual: {user['edad']}")
                            user["edad"] = input("Nueva edad: ")
                        elif modificar == "4":
                            print(f"Correo actual: {user['correo']}")
                            user["correo"] = input("Nuevo correo electrónico: ")
                        elif modificar == "5":
                            confirmacion = input("¿Deseas cambiar la contraseña? (si/no): ").lower()
                            if confirmacion == "si":
                                user["password"] = str(random.randint(1000, 9999))
                                print(f"Nueva contraseña generada: {user['password']}")
                            else:
                                print("La contraseña no se ha cambiado.")
                        else:
                            print("Opción no válida.")
                        
                        # Mostrar datos actualizados para verificación
                        print("\nDatos actualizados del usuario:")
                        print(f"Nombre: {user['nombre']}")
                        print(f"Apellido: {user['apellido']}")
                        print(f"Edad: {user['edad']}")
                        print(f"Correo electrónico: {user['correo']}")
                        print(f"Contraseña: {user['password']}\n")

                    elif opcion_modificar == "2":
                        # Mostrar balance y últimos movimientos
                        print(f"\nTu balance actual es: ${user['balance']}")
                        print("Movimientos recientes:")
                        if user["movimientos"]:
                            for movimiento in user["movimientos"]:
                                print(f"{movimiento['tipo']}: ${movimiento['monto']}")
                        else:
                            print("No hay movimientos registrados.\n")

                    elif opcion_modificar == "3":
                        monto = float(input("Monto a depositar: $"))
                        if monto > 0:
                            user["balance"] += monto
                            user["movimientos"].append({
                                "tipo": "Depósito",
                                "monto": monto
                            })
                            print(f"Depósito exitoso. Nuevo balance: ${user['balance']}\n")
                        else:
                            print("El monto debe ser mayor a cero.\n")

                    elif opcion_modificar == "4":
                        monto = float(input("Monto a retirar: $"))
                        if 0 < monto <= user["balance"]:
                            user["balance"] -= monto
                            user["movimientos"].append({
                                "tipo": "Retiro",
                                "monto": monto
                            })
                            print(f"Retiro exitoso. Nuevo balance: ${user['balance']}\n")
                        else:
                            print("Monto inválido o insuficiente balance.\n")

                    elif opcion_modificar == "5":
                        
                        print("Ingresa el valor del préstamo, debe ser mínimo de $500 y máximo de $2000")
                        
                        monto = float(input("Monto del préstamo: $"))    
                        if monto < 500 or monto > 2000:
                            print("El monto del préstamo debe estar entre $500 y $2000.\n")
                        else:
                            print("Opciones de interés:")
                            print(" - 10% anual para préstamos de 6 meses.")
                            print(" - 14% anual para préstamos de 12 meses.\n")
                            
                            plazo = int(input("Plazo del préstamo, ingresa 6 si deseas a 6 meses o 12 si deseas a 12 meses: "))
                            
                            if plazo == 6:
                                tasa_interes = 0.10  # 10% anual
                            elif plazo == 12:
                                tasa_interes = 0.14  # 14% anual
                            else:
                                print("Solo se aceptan plazos de 6 o 12 meses.\n")
                                continue
                            
                            # Calcular interés total
                            interes_total = monto * tasa_interes * (plazo / 12)
                            monto_total = monto + interes_total
                            
                            # Desglose del préstamo
                            print(f"\nDesglose del préstamo:")
                            print(f" - Monto solicitado: ${monto:.2f}")
                            print(f" - Interés generado: ${interes_total:.2f}")
                            print(f" - Monto total a pagar: ${monto_total:.2f}\n")
                            
                            # Confirmar préstamo
                            confirmar = input("¿Deseas aceptar el préstamo? (si/no): ").lower()
                            if confirmar == "si":
                                user["balance"] += monto
                                user["movimientos"].append({
                                    "tipo": "Préstamo",
                                    "monto": monto,
                                    "interes": round(interes_total, 2),
                                    "monto_total": round(monto_total, 2),
                                    "plazo": plazo
                                })
                                print(f"Préstamo aprobado. Nuevo balance: ${user['balance']:.2f}\n")
                            else:
                                print("Préstamo cancelado.\n")
                    
                    elif opcion_modificar == "6":
                        print("Cerrando sesión.\n")
                        break
                    else:
                        print("Opción no válida.")
                break
        if not encontrado:
            print("Nombre de usuario o contraseña incorrectos.\n")

    elif opcion == "3":
        print("Saliendo del programa.")
        break
    else:
        print("Opción no válida.\n")
