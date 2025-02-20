
def calcular_total(cantidad,precioUnitario):
    return cantidad * precioUnitario

def aplicar_descuento(total,descuento):
    # de cuanto sera el descuento
    if descuento < 0 or descuento > 100:
        return "ERROR, El descuento debe estar entre 0 a 100"
    
    return total - (total*(descuento/100))

def verificar_inventario(cantidad_solicitada,stock_disponible):
    if cantidad_solicitada > stock_disponible:
        return f"ERROR, Solo hay {stock_disponible} galletas disponibles"
