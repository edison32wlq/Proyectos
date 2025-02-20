# parametro posicional
def saludar(nombre, edad): # parametro obligatorio
    print(f"Hola, {nombre}, tienes {edad} años.")

saludar("Pedro",24)

# parametro por defecto (ocupacion ="estudiantes")
def descripcion(nom,ocupacion="estudiantes"): # valores definidos
    print(f"{nom} es {ocupacion}")

descripcion("juan")
descripcion("Peter","Ingeniero") # los valores se pueden sobreescribir

def mostrarInfo(nomb, ed, ciudad):
    print(f"Nombre: {nomb}, Edad: {ed}, Ciudad: {ciudad}")

mostrarInfo(ed=29, ciudad="Quito", nomb="Marta")

#parametro con Argumento *Args   **Kwargs
def sumar(*numeros):
    total=sum(numeros)
    print(f"La suma es: {total}")


def mostrarDatos(**datos): # pueden estar numeros letras y mas
    for clave,valor in datos.items():
        print(f"{clave}: {valor}")

sumar(1,2,3,4,5,6,7,8,9)
mostrarDatos(nombre="Laura", edad=15, ciudad="Quito")

# aqui se usa args
def suma(*args): # suma todos los valores que se ingresen en args
    return sum(args)

print(suma(1,2,3))

# aqui se usa kwargs
def mostrarDato(**kwargs):
    for clave,value in kwargs.items():
        print(f"{clave}: {value}")

mostrarDato(nombre="Michael", ciudad="Ibarra", edad=54, estatura=21, peso=23)