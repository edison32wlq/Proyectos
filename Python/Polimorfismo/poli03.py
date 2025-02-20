class circulo:
    def __str__(self):
        return "Soy un circulo"
    
class cuadrado:
    def __str__(self):
        return "Soy un cuadrado"

formas = [circulo(), cuadrado()]
for forma in formas:
    print(forma)