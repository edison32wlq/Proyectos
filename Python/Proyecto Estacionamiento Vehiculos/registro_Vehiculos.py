import datetime

estacionamiento = []  
facturas = []  

ticket_counter = 1
factura_counter = 1

PRECIO_POR_HORA = 2.00

def registrar_entradaP():
    global ticket_counter
    cedula = input("Ingrese la cédula del cliente: ")
    placa = input("Ingrese la placa del vehículo: ").upper()
    hora_entrada = datetime.datetime.now()

    for vehiculo in estacionamiento:
        if vehiculo[2] == placa:
            print("\nError: Este vehículo ya está registrado en el estacionamiento.")
            return

    ticket = (ticket_counter, cedula, placa, hora_entrada)
    estacionamiento.append(ticket)
    ticket_counter += 1

    print("\n--- Ticket Generado ---")
    print(f"Número de Ticket: {ticket[0]}")
    print(f"Cédula del Cliente: {ticket[1]}")
    print(f"Fecha y Hora de Entrada: {ticket[3]}")
    print(f"Placa del Vehículo: {ticket[2]}")
    print(f"Precio por Hora: ${PRECIO_POR_HORA:.2f}\n")

def registrar_salida():
    global factura_counter
    if not estacionamiento:
        print("\nNo hay vehículos registrados en el estacionamiento.\n")
        return

    busqueda = input("Ingrese el número de ticket o la cédula del cliente: ")

    ticket = None
    for vehiculo in estacionamiento:
        if str(vehiculo[0]) == busqueda or vehiculo[1] == busqueda:
            ticket = vehiculo
            break

    if not ticket:
        print("\nNo se encontró ningún vehículo con la información proporcionada.\n")
        return

    hora_salida = datetime.datetime.now()
    horas_estacionado = (hora_salida - ticket[3]).total_seconds() / 3600
    total = round(horas_estacionado * PRECIO_POR_HORA, 2)

    factura = (factura_counter, ticket[0], ticket[1], ticket[2], ticket[3], hora_salida, total)
    facturas.append(factura)
    factura_counter += 1

    estacionamiento.remove(ticket)

    print("\n--- Factura Generada ---")
    print(f"Número de Factura: {factura[0]}")
    print(f"Cédula del Cliente: {factura[2]}")
    print(f"Placa del Vehículo: {factura[3]}")
    print(f"Hora de Entrada: {factura[4]}")
    print(f"Hora de Salida: {factura[5]}")
    print(f"Total a Pagar: ${factura[6]:.2f}\n")

def generar_reporte():
    print("\n--- Reporte de Vehículos ---")
    if not facturas:
        print("No hay vehículos registrados en el reporte.\n")
        return

    for factura in facturas:
        print(f"Número de Factura: {factura[0]}")
        print(f"Cédula del Cliente: {factura[2]}")
        print(f"Placa del Vehículo: {factura[3]}")
        print(f"Hora de Entrada: {factura[4]}")
        print(f"Hora de Salida: {factura[5]}")
        print(f"Total Pagado: ${factura[6]:.2f}\n")

def mostrar_vehiculos_estacionados():
    print("\n--- Vehículos Estacionados ---")
    if not estacionamiento:
        print("No hay vehículos actualmente en el estacionamiento.\n")
        return

    for vehiculo in estacionamiento:
        print(f"Ticket ID: {vehiculo[0]}")
        print(f"Cédula del Cliente: {vehiculo[1]}")
        print(f"Placa del Vehículo: {vehiculo[2]}")
        print(f"Hora de Entrada: {vehiculo[3]}\n")

def buscar_factura_por_cedula():
    cedula = input("Ingrese la cédula del cliente: ")
    print("\n--- Facturas del Cliente ---")
    encontrado = False
    for factura in facturas:
        if factura[2] == cedula:
            encontrado = True
            print(f"Número de Factura: {factura[0]}")
            print(f"Placa del Vehículo: {factura[3]}")
            print(f"Hora de Entrada: {factura[4]}")
            print(f"Hora de Salida: {factura[5]}")
            print(f"Total Pagado: ${factura[6]:.2f}\n")
    if not encontrado:
        print("No se encontraron facturas para esta cédula.\n")

def menu():
    while True:
        print("--- Estacionamiento ---")
        print("1. Registrar entrada")
        print("2. Registrar salida")
        print("3. Generar reporte")
        print("4. Mostrar vehículos estacionados")
        print("5. Buscar factura por cédula")
        print("6. Salir")
        opcion = input("Seleccione una opción: ")

        if opcion == "1":
            registrar_entradaP()
        elif opcion == "2":
            registrar_salida()
        elif opcion == "3":
            generar_reporte()
        elif opcion == "4":
            mostrar_vehiculos_estacionados()
        elif opcion == "5":
            buscar_factura_por_cedula()
        elif opcion == "6":
            print("Saliendo del sistema...")
            break
        else:
            print("Opción no válida. Intente nuevamente.\n")

menu()
