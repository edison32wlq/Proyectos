class Animal:
    def hacer_sonido(self):
        return "Sonido de animal"

class perro(Animal):
    def hacer_sonido(self):
        return "Guau Guau"

class gato(Animal):
    def hacer_sonido(self):
        return "Miau Miau"

# polimorfismo mezcla dos clases con respectivas funciones
# invoca en una tercera variable
def hacer_sonido_animales(animal):
   print(animal.hacer_sonido())

#mostrar animales
animales = [perro(), gato(), Animal()]

for animal in animales:
    print(animal.hacer_sonido())
