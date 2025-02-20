def promedio(*args):
    total = sum(args)
    prom = total/len(args)
    print(f"El promedio es: {prom}\n")

promedio(9,9,9,9)


#  
def reporte(**info):
    print("--------------------") 
    for clave,valor in info.items():
        print(f"{clave}: {valor}")


reporte(materia="Matematicas", nota=8, aprobado= "SI", mejora="NO")