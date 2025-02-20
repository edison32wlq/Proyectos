import tkinter as tk

ventana = tk.Tk()
ventana.title("Suma")
ventana.geometry("400x400")

def suma(valor1, valor2):
    total1 = valor1 + valor2
    total.config(text= "Total:  " + str(total1))


titulo = tk.Label(ventana, text = "TITULO ", font=("Arial", 18))

ingreso1 = tk.Label(ventana, text = "Ingrese n1: ", font=("Arial", 12))
ingreso1.place(x=10,y=40)
ingreso11 = tk.Entry()
valor11 = ingreso11.get()


text = tk.Text(ventana, height=2,width=30)
text.place(x=100,y=40)

ingreso2 = tk.Label(ventana, text = "Ingreso n2: ", font=("Arial", 12))
ingreso2.place(x=10,y=120)
ingreso21= tk.Entry()
valor22 = ingreso21.get() 

text = tk.Text(ventana, height=2,width=30)
text.place(x=100,y=120)


total = tk.Label(ventana, text = "Total: ", font=("Arial", 12))
total.place(x=150,y=200)
total= tk.Entry()

text = tk.Text(ventana, height=2,width=15)
text.place(x=220,y=200)

boton = tk.Button(ventana, text="Sumar", font=("Arial", 14), command = suma)
boton.place(x=50,y=300)



titulo.pack()


ventana.mainloop()