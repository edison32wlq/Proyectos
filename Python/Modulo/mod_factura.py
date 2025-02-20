import datetime
import random

nombre_empresa = "CelularesTech"
direccion_empresa = "Av. Principal 123"
ruc_empresa = "1234567890"
telefono_empresa = "0987654321"
iva = 15
descuento_cantidad_minima = 3
porcentaje_descuento = 0.15

celulares_disponibles = {
    "iPhone 14": {"precio": 1200.00, "stock": 10},
    "Samsung Galaxy S23": {"precio": 950.00, "stock": 15},
    "Xiaomi Mi 13": {"precio": 700.00, "stock": 20}
}

def catalogo():
    print("\n---------- Catálogo de Celulares ------------")
    for i, (modelo, datos) in enumerate(celulares_disponibles.items(), start=1):
        print(f"{i}. {modelo} - Precio: ${datos['precio']} - Stock: {datos['stock']}")

def selecModelo(opcion):
    modelos = list(celulares_disponibles.keys())
    if 1 <= opcion <= len(modelos):
        modelo = modelos[opcion - 1]
        return modelo, celulares_disponibles[modelo]["precio"], celulares_disponibles[modelo]["stock"]
    return None, None, None

def obtener_fecha_actual(formato="%Y-%m-%d"):
    return datetime.datetime.now().strftime(formato)

def generar_numero_factura():
    return random.randint(10**14, 10**15 - 1)

def calcular_subtotal(cantidad, precio_unitario):
    return cantidad * precio_unitario

def calcular_iva(subtotal, porcentaje_iva):
    return subtotal * (porcentaje_iva / 100)

def calcular_descuento(total, cantidad, cantidad_minima, porcentaje_descuento):
    if cantidad > cantidad_minima:
        return total * porcentaje_descuento
    return 0

def generar_detalles_compra(modelo, cantidad, precio_unitario, subtotal, iva_total, descuento, total_con_iva, forma_pago):
    return (
        f"| Modelo: {modelo}\n"
        f"| Cantidad: {cantidad}\n"
        f"| Precio Unitario: {precio_unitario:.2f}\n"
        f"| Subtotal (sin IVA): {subtotal:.2f}\n"
        f"| IVA ({iva}%): {iva_total:.2f}\n"
        f"| Descuento: {descuento:.2f}\n"
        f"| Total (con IVA): {total_con_iva:.2f}\n"
        f"| Forma de Pago: {forma_pago}"
    )

def generar_factura(nombre_cliente, direccion_cliente, correo_cliente, cedula_cliente, modelo, cantidad, precio_unitario, forma_pago):
    subtotal = calcular_subtotal(cantidad, precio_unitario)
    iva_total = calcular_iva(subtotal, iva)
    total_con_iva = subtotal + iva_total
    descuento = calcular_descuento(total_con_iva, cantidad, descuento_cantidad_minima, porcentaje_descuento)
    total_con_iva -= descuento

    detalles_compra = generar_detalles_compra(modelo, cantidad, precio_unitario, subtotal, iva_total, descuento, total_con_iva, forma_pago)

    factura = (
        "+------------------------------------------------------------+\n"
        "|                       FACTURA DE VENTA                     |\n"
        "+------------------------------------------------------------+\n"
        f"| Fecha: {obtener_fecha_actual()}\n"
        f"| Número de Factura: {generar_numero_factura()}\n"
        "+------------------------------------------------------------+\n"
        "|                     Datos de la Empresa                    |\n"
        "+------------------------------------------------------------+\n"
        f"| Nombre: {nombre_empresa}\n"
        f"| Dirección: {direccion_empresa}\n"
        f"| RUC: {ruc_empresa}\n"
        f"| Teléfono: {telefono_empresa}\n"
        "+------------------------------------------------------------+\n"
        "|                     Datos del Cliente                      |\n"
        "+------------------------------------------------------------+\n"
        f"| Nombre: {nombre_cliente}\n"
        f"| Dirección: {direccion_cliente}\n"
        f"| Correo: {correo_cliente}\n"
        f"| Cédula: {cedula_cliente}\n"
        "+------------------------------------------------------------+\n"
        "|                   Detalles de la Compra                    |\n"
        "+------------------------------------------------------------+\n"
        f"{detalles_compra}\n"
        "+------------------------------------------------------------+\n"
        "|                   ¡Gracias por su compra!                  |\n"
        "+------------------------------------------------------------+"
    )

    return factura
