import random

def obtener():
    valor = random.randint(1,3)
    if valor == 1:
        print("Dia soleado")
    elif valor == 2:
        print("Dia nublado")
    elif valor == 3:
        print("mejor no salgas")
    elif valor == 4:
        print("esta lluviendo")
    else:
        print("no se no veo")