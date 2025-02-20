import tkinter as tk
def suma(valor1,valor2):
    sumaTotal = valor1 + valor2
    suma_label.config(text = "El resultado de tu suma es: " + str(sumaTotal))

ventana = tk.Tk()
ventana.title("VENTANA")

ingreso1_label = tk.Label(ventana, text = "Ingresa el primer numero: ", font=("Arial", 14))
ingreso1_label.pack(pady=10)
ingreso1_label = tk.Entry()
ingreso1_label.pack(pady=20)

ingreso2_label = tk.Label(ventana, text = "Ingresa el segundo numero: ", font=("Arial", 14))
ingreso2_label.pack(pady=10)
ingreso2_label = tk.Entry()
ingreso2_label.pack(pady=20)



start_button = tk.Button(ventana, text = "PROBANDO", font=("Arial", 14), command = suma)
start_button.pack(pady=20)
ventana.mainloop()