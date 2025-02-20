
class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def saludar(self):
        return f"Hola soy {self.nombre}, tengo {self.edad}"
    

class Estudiantes(Persona):

    def __init__(self, nombre, edad, curso):
        super().__init__(nombre, edad)
        self.curso = curso

    

press1 = Persona("Juanito", 20)
print(press1.saludar())

asig1 = Estudiantes("Pedrito", 17, "Desarrollo")
print(asig1.saludar())
print(f"Curso: {asig1.curso}")