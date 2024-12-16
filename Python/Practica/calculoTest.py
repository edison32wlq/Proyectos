import calculo
import datetime

nombre = input("Ingrese su nombre: ")
apellido = input("Ingrese su apellido: ")
an = input("Ingrese su año de nacimiento: ")
anioNacimiento = int(an)
fechaAyer = datetime.datetime.now().year
fechaHoy = datetime.date.today()
anioActual = fechaHoy.year
edad = anioActual - anioNacimiento
calculo.mostrarInfo(nombre, apellido, edad)

print(fechaAyer)
