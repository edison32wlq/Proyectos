import tkinter as tk
import random

def generarFortuna():
    mensajes = ["Encontraras el amor" , "Sal de ahi", "No volver con tu ex", "Encontraras algo bueno"]
    fortuna = random.choice(mensajes)
    lblMensaje.config(text= fortuna)
    
ventana = tk.Tk()
ventana.geometry("400x400")
ventana.title("FORTUNA")

lblTitulo = tk.Label(text = "Galleta de la fortuna")
lblTitulo.pack()

btnButton = tk.Button(text="Generar Fortuna", font=("Arial", 14), command = generarFortuna)
btnButton.pack()

lblMensaje = tk.Label(text = " ", fg="RED")
lblMensaje.pack()

ventana.mainloop()