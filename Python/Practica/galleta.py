import random

def generarFortuna():
    numero = random.randint(1,5)
    if numero == 1:
        print("Una persona esta interesada en ti")
    elif numero == 2:
        print("Cuidado con los animales")
    elif numero == 3:
        print("Fijate en el clima, puede sorprenderte")
    elif numero == 4:
        print("No sigas el camino de siempre")
    else:
        print("Este mes tendras mala suerte")

