
def registrar_inventario(nombre,precio_kilogramo,cantidad_disponible):
    frutas =[]
    fruta = {
            "nombre": nombre,
            "precio_kilogramo": precio_kilogramo,
            "cantidad": cantidad_disponible
        }
    frutas.append(fruta)

    return frutas

def registrar_venta(frutas_compradas,kilogramos_solicitados):
    ventas = []
    venta = {
            "frutas_compradas": frutas_compradas,
            "kilogramos_solicitados": kilogramos_solicitados
    }
    ventas.append(venta)

    return ventas

def actualizar_inventario(frutas,venta):
    print(frutas,venta)
    