def calcularPromedio(val1,val2,val3):
    calculo=val1+val2+val3
    promedio1=calculo/3
    return promedio1

def consultarMulta(tipoMulta):
    if tipoMulta == 1:
        return 10
    elif tipoMulta == 2:
        return 15
    elif tipoMulta == 3:
        return 20
    elif tipoMulta == 4:
        return 30
    else:
        return -1
    
def calcularValorHora(salario):
    valorHora = salario/160

    return valorHora

def calcularSubtotal(precioProducto,cantidad,porcentajeDescuento):
        subtotalSinDescuento = precioProducto * cantidad
        descuento = ((subtotalSinDescuento * porcentajeDescuento)/100)
        valorTotal = subtotalSinDescuento - descuento

        return valorTotal

def calcularValorDescuento(precio, porcentajeDescuento):
    valorDescuento =  ((precio * porcentajeDescuento)/100)
    return valorDescuento