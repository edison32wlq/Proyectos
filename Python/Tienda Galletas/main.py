import negocio_galletas


cantidad = 50
precio_unitario = 2.50
descuento = 20
stock_disponible = 8

total = negocio_galletas.calcular_total(cantidad,precio_unitario)
# en esta variable aplica lo que hace tu funcion
print(f"Total sin descuento: ${total}")


total_descuento = negocio_galletas.aplicar_descuento(total,descuento)
print(f"El total con descuento es: ${total_descuento}")

total_inventario = negocio_galletas.verificar_inventario(cantidad,stock_disponible)
if total_inventario is True:
    print(f"Pedido aprobado con {cantidad} galletas disponibles")
else:
    print(total_inventario)


