import tkinter as tk
import iterar


notas = []

def calcularPromedio(notas):
    if len(notas) == 0:
        return 0
    else: 
        total = sum(notas)
        promedio = total / len(notas)
        return promedio


def agregar ():
    nota = float(txtNota.get())
    notas.append(nota)
    print("Lista de notas: ", notas)


def llamarPromedio():
    promedio = calcularPromedio(notas)
    lblPromedio.config(text = f"Promedio: {promedio}")


ventana = tk.Tk()
ventana.geometry("300x150")
ventana.title("Formulario notas")

lblNota = tk.Label(ventana, text = "Ingrese Nota: ").pack()

txtNota = tk.Entry(ventana)
txtNota.pack()

btnIngresar = tk.Button(ventana, text = "Ingresar", command = agregar ).pack()

btnPromedio = tk.Button(ventana, text = "Promediar", command = llamarPromedio).pack()


lblPromedio = tk.Label(ventana, text = "")
lblPromedio.pack()

ventana.mainloop()