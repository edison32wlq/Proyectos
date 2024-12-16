import tkinter as tk
import random

def generar_boleto(numeros_rango, cantidad):
    return random.sample(range(1, numeros_rango + 1), cantidad)

def jugar_loteria():
    numeros_rango = 6
    cantidad_boleto= 3
    cantidad_ganadores = 3

    boleto_jugador = generar_boleto(numeros_rango, cantidad_boleto)
    numeros_ganadores = generar_boleto(numeros_rango, cantidad_ganadores)

    aciertos = len(set(boleto_jugador) & set(numeros_ganadores)) 

    boleto_label.config(text= "Tu boleto: " + str(boleto_jugador))
    ganadores_label.config(text= "Numeros ganadores: " + str(numeros_ganadores))
    aciertos_label.config(text=f"Aciertos: {aciertos}" )

    if aciertos == cantidad_ganadores:
        resultado_label.config(text= "Felicidades haz ganado el Gran premio", fg="green")
    elif aciertos == cantidad_boleto - 1:
        resultado_label.config(text="Casi... Ganaste el segundo premio", fg="orange")
    elif aciertos == 1:
        resultado_label.config(text="buen intento, has ganado el premio pequeño", fg= "yellow")
    else:
        resultado_label.config(text= "No hubo suerte esta vez, intentalo de nuevo: ", fg="red")


ventana = tk.Tk()
ventana.title("Juego de loteria")

boleto_label = tk.Label(ventana, text="Tu boleto: ", font=("Arial", 14))
boleto_label.pack(pady=10)

ganadores_label = tk.Label(ventana, text="Numeros Ganadores: ", font=("Arial", 14))
ganadores_label.pack(pady=10)

aciertos_label = tk.Label(ventana, text="Aciertos: ", font=("Arial", 14))
aciertos_label.pack(pady=10)


resultado_label = tk.Label(ventana, text="Suerte", font=("Arial", 16, "bold"), fg = "blue")
resultado_label.pack(pady=20)

jugar_button = tk.Button(ventana, text="Jugar Loteria", font=("Arial", 14), command =jugar_loteria)
jugar_button.pack(pady=20)


ventana.mainloop()