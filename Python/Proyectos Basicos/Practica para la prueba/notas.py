while True:
    notaExamen = int(input("Ingrese su nota del examen del 1 al 10: "))
    if notaExamen >= 0  and notaExamen <= 10:
        break
    else:
        print("Solo se permiten notas entre 1 y 10")
        print("FIN DEL PROGRAMA")
        exit()

inasistencia = int(input("Ingrese cuantas veces a faltado a clases:"))
if inasistencia < 3 and notaExamen >= 8:
    print("\nAPROBADO\n")
else:
    print("REPROBADO")

print("FIN DEL PROGRAMA")
