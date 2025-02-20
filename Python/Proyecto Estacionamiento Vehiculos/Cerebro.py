import datetime
from tkinter import messagebox

estacionamiento = []  
facturas = []  

ticket_counter = 1
factura_counter = 1

precio_por_hora = 2.00

def registrar_entrada(cedula, placa):
    global ticket_counter
    hora_entrada = datetime.datetime.now()  

    for vehiculo in estacionamiento:
        if vehiculo[2] == placa:
            raise ValueError(f"Error: este vehículo ya está registrado en el estacionamiento.")
            
    ticket = (ticket_counter, cedula, placa, hora_entrada)  
    estacionamiento.append(ticket)
    ticket_counter += 1

    hora_entrada_formateada = hora_entrada.strftime("%Y/%m/%d - %H:%M:%S.%f")[:-7]
    
    mensaje = f"--- Ticket Generado ---\n"
    mensaje += f"Número de Ticket: {ticket[0]}\n"
    mensaje += f"Cédula del Cliente: {ticket[1]}\n"
    mensaje += f"Fecha y Hora de Entrada: {hora_entrada_formateada}\n"
    mensaje += f"Placa del Vehículo: {ticket[2]}\n"
    mensaje += f"Precio por Hora: ${precio_por_hora:.2f}"

    return mensaje

def registrar_salida(busqueda):
    global factura_counter
    if not estacionamiento:
        raise ValueError("Error: No hay vehículos registrados en el estacionamiento.")

    ticket = None
    for vehiculo in estacionamiento:
        if str(vehiculo[0]) == busqueda or vehiculo[1] == busqueda:
            ticket = vehiculo
            break

    if not ticket:
        raise ValueError("Error: No se encontró ningún vehículo con la información proporcionada.")
        
    hora_salida = datetime.datetime.now()
    horas_estacionado = (hora_salida - ticket[3]).total_seconds() / 3600

    total = 0
    if horas_estacionado <= 1:
        total = precio_por_hora 
    else:
        total += precio_por_hora
        if horas_estacionado > 1:
            total += 4
        if horas_estacionado > 2:
            total += 6 * (horas_estacionado - 2)

    total = round(total, 2)

    hora_salida_formateada = hora_salida.strftime("%Y/%m/%d - %H:%M:%S.%f")[:-7]
    hora_entrada_formateada = ticket[3].strftime("%Y/%m/%d - %H:%M:%S.%f")[:-7] 

    factura = (factura_counter, ticket[0], ticket[1], ticket[2], ticket[3], hora_salida, total)
    facturas.append(factura)
    factura_counter += 1

    estacionamiento.remove(ticket)

    mensaje = f"--- Factura Generada ---\n"
    mensaje += f"Número de Factura: {factura[0]}\n"
    mensaje += f"Cédula del Cliente: {factura[2]}\n"
    mensaje += f"Placa del Vehículo: {factura[3]}\n"
    mensaje += f"Hora de Entrada: {hora_entrada_formateada}\n" 
    mensaje += f"Hora de Salida: {hora_salida_formateada}\n"  
    mensaje += f"Total a Pagar: ${factura[6]:.2f}"

    return mensaje

def mostrar_vehiculos_estacionados():
    if not estacionamiento:
        return "No hay vehículos actualmente en el estacionamiento."
    
    mensaje = "--- Vehículos Estacionados ---\n"
    for vehiculo in estacionamiento:
        hora_entrada_formateada = vehiculo[3].strftime("%Y/%m/%d - %H:%M:%S.%f")[:-7]
        
        mensaje += f"Ticket ID: {vehiculo[0]}\n"
        mensaje += f"Cédula del Cliente: {vehiculo[1]}\n"
        mensaje += f"Placa del Vehículo: {vehiculo[2]}\n"
        mensaje += f"Hora de Entrada: {hora_entrada_formateada}\n\n"
    
    return mensaje

def generar_reporte():
    if not facturas:
        return "No hay vehículos registrados en el reporte.\n"
        
    mensaje = "--- Reporte de Vehículos ---\n"

    for factura in facturas:
        hora_entrada_formateada = factura[4].strftime("%Y/%m/%d - %H:%M:%S.%f")[:-7]  
        hora_salida_formateada = factura[5].strftime("%Y/%m/%d - %H:%M:%S.%f")[:-7]  
        
        mensaje += f"Número de Factura: {factura[0]}\n"
        mensaje += f"Cédula del Cliente: {factura[2]}\n"
        mensaje += f"Placa del Vehículo: {factura[3]}\n"
        mensaje += f"Hora de Entrada: {hora_entrada_formateada}\n"
        mensaje += f"Hora de Salida: {hora_salida_formateada}\n"
        mensaje += f"Total Pagado: ${factura[6]:.2f}\n\n"

    return mensaje