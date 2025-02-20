import negocio_frutas

nombre = "kiwi"
precio_kilogramo = 5
cantidad_disponible = 10

while True:
    print("1. Registrar inventario frutas")
    print("2. Registrar una venta")
    print("3. Salir")
    opcion1 = input("Elige una opción: ").strip()

    if opcion1 == "1":
        nombre = input("Ingrese el nombre de la fruta: ")
        precio_kilogramo = float(input("Ingrese el precio por kilogramo: "))
        cantidad_disponible = int(input("Ingrese la cantidad disponible: "))
        registrar_frutas = negocio_frutas.registrar_inventario(nombre,precio_kilogramo,cantidad_disponible)
    elif opcion1 == "2":
        numero_frutas = int(input("Ingrese el numero de frutas compradas: "))
        for i in range(1,numero_frutas):
            frutas_compradas = input(f"Ingrese el nombre de la fruta {i}: ")
            kilogramos_solicitados = float(input("Ingrese los kilogramos solicitados"))
            registrar_venta = negocio_frutas.registrar_venta(frutas_compradas,kilogramos_solicitados)
        print(negocio_frutas.actualizar_inventario(registrar_frutas,registrar_venta))
    elif opcion1 == "3":
        print("\nSaliendo del programa.......")
        break
    else:
        print("\n ---- Opción no válida. ---- \n")
