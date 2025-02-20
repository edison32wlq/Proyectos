# crear un sistema de ventas
# con formas de pago

class MetodoPago:
    def pagar(self, cantidad):
        raise NotImplementedError("Este metodo necesita tener una Sub Clase")
    

class TarjetaCredito(MetodoPago,):
    def pagar(self, cantidad):
        return f"El pago de ${cantidad} se realizara mediante tarjeta"
    
class paypal(MetodoPago):
    def pagar(self, cantidad):
        return f"El pago de {cantidad} se realizara mediante PAYPAL"
    
class efectivo(MetodoPago):
    def pagar(self, cantidad):
        return f"El pago de {cantidad} se realizara mediante efectivo"

def procesar_pago(metodo,cantidad):
    #selecciona el criterio a pagar dado la funcion
    print(metodo.pagar(cantidad))


#asignamos procesos a variables
tarjeta = TarjetaCredito()
paypal = paypal()
efectivo = efectivo()

procesar_pago(tarjeta,250)
procesar_pago(efectivo,1000)
procesar_pago(paypal, 120)