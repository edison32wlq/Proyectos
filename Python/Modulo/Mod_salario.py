def edison_Ludena(nombre,apellido,edad,horas,sueldo,total,sueldoTotal):
    if horas <= 40:
        return f"{nombre} {apellido} con la edad de {edad}\nSu sueldo es de: {sueldo} a la semana"
    else:
        return f"{nombre} {apellido} con la edad de {edad}\nSu sueldo es de: {sueldo} a la semana \n Pago por horas extras: {total} \n Su sueldo total es de: {sueldoTotal}"

def salario(horas,pago):
    if horas <=240:
        sueldo = horas * pago
    elif horas < 0:
        return "Ingrese un numero valido"
    else:
        sueldo = horas * pago 
    
    return sueldo

def horas_extras(horas,pago):
    if horas > 240:
        tiempo = horas - 240
        total = tiempo * ((pago*0.5)+pago)
    else:
        total = 0
    return total

def salario_Total(sueldo,total):
    sueldo = float(sueldo)
    total = float(total)  
    sueldoTotal = sueldo + total

    return sueldoTotal
