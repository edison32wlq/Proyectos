import re  

usuarios = []
print("------------------ Bienvenido -------------------")
print("Por favor, regístrate\n")

def registro():
    while True:
        while True:
            nombre = input("Nombre: ")
            if nombre.strip() == "":
                print("El nombre no puede estar vacío. Por favor ingresa un nombre válido.")
            else:
                break
        
        while True:
            try:
                edad = int(input("Ingrese su edad: "))
                if edad <= 0:
                    print("La edad debe ser un número positivo.")
                else:
                    break
            except ValueError:
                print("Por favor ingresa un número válido para la edad.")
        
        while True:
            correo = input("Ingrese su correo: ")
            if not re.match(r"[^@]+@[^@]+\.[^@]+", correo):
                print("El correo ingresado no es válido. Asegúrese de que contenga '@' y un dominio.")
            else:
                break

        usuario = {
            "nombre": nombre,
            "edad": edad,
            "correo": correo,
        }
        usuarios.append(usuario)
        print(f"Usuario {nombre} registrado correctamente.\n")
        
        continuar = input("¿Deseas registrar otro usuario? (s/n): ")
        if continuar.lower() != 's':
            break


registro()

print("\nUsuarios registrados:")
for usuario in usuarios:
    print(usuario)
