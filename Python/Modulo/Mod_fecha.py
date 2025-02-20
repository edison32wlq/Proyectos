import datetime

# Crear un programa que me diga que hora es que me diga que fehcas es y que me diga que dia es:

fecha_actual = datetime.datetime.now()
print(f"La fecha y hora actual es: {fecha_actual}")

fecha_futura = fecha_actual + datetime.timedelta(days=10)
print(f"La fecha dentro de 10 dias sera: {fecha_futura}")

dia_semana = fecha_actual.strftime("%A,%B")
print(f"hoy es: {dia_semana}")