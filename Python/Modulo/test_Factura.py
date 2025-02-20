import mod_factura
import re

print("\n------------- Bienvenido a CelularesTech -------------\n")
nombre_cliente = input("Ingrese su nombre: ")
direccion_cliente = input("Ingrese su dirección: ")
while True:
    correo_cliente = input("Ingrese su correo: ")
    patron = r'^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$'

    if re.match(patron, correo_cliente):
        break

    else:
        print("El correo no es válido. Por favor, ingrese un correo electrónico correcto.")

while True:
    cedula_cliente = input("Ingrese su cédula o RUC: ")
    patron = r'^\d+$'
    if re.match(patron, cedula_cliente) and (len(cedula_cliente) == 10 or len(cedula_cliente) == 13):
        break
    else:
        print("La cédula o RUC no es válido. Debe contener 10 o 13 dígitos.")

while True:
    mod_factura.catalogo()
    try:
        opcion = int(input("\nSeleccione el número del modelo que desea comprar: "))
        modelo, precio_unitario, stock = mod_factura.selecModelo(opcion)
        if modelo:
            print(f"Ha seleccionado: {modelo} - Precio: ${precio_unitario} - Stock Disponible: {stock}")
            cantidad = int(input("Ingrese la cantidad de dispositivos que desea comprar: "))
            if cantidad > stock:
                print("No hay suficiente stock disponible. Intente de nuevo.")
            else:
                mod_factura.celulares_disponibles[modelo]["stock"] -= cantidad
                break
        else:
            print("Opción inválida. Intente de nuevo.")
    except ValueError:
        print("Error: Ingrese un número válido.")

while True: 
    print("\n----------------------------------------------------------------")        
    print("Ingrese forma de pago")
    print("1. Efectivo")
    print("2. Tarjeta de Credito")
    print("3. Transferencia")
    print("----------------------------------------------------------------\n")   
    opcion1 = input("Ingresar el numero de la opcion: ")
    if opcion1 == "1":
        forma_pago = "Efectivo"
        break
    elif opcion1 == "2":
        forma_pago = "Tarjeta de credito"
        break
    elif opcion1 == "3":
        forma_pago = "Transferencia"
        break
    else:
        print("\n-----------------------------------")
        print("Error: Ingrese la opcion correcta")
        print("-----------------------------------\n")
    

subtotal = mod_factura.calcular_subtotal(cantidad, precio_unitario)
iva_total = mod_factura.calcular_iva(subtotal, mod_factura.iva)
total_con_iva = subtotal + iva_total
descuento = mod_factura.calcular_descuento(
    total_con_iva,
    cantidad,
    mod_factura.descuento_cantidad_minima,
    mod_factura.porcentaje_descuento
)
total_final = total_con_iva - descuento

factura = mod_factura.generar_factura(
    nombre_cliente,
    direccion_cliente,
    correo_cliente,
    cedula_cliente,
    modelo,
    cantidad,
    precio_unitario,
    forma_pago
)

print("\n\n" + factura)