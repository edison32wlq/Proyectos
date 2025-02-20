import tkinter as tk

ventana = tk.Tk()
ventana.title("Celulares Mika")
ventana.geometry("400x400")
ingreso1_label = tk.Label(ventana, text = "Ingresa el primer numero: ", font=("Arial", 14))

ingreso2_label = tk.Entry(x=10,y=10)
button = tk.Button(ventana, text="celular", font=("Arial", 14), command= ventana.quit, bg = "#5BF5BE", fg ="red")
text = tk.Text(ventana, height=5,width=30)



ingreso1_label.pack()
ingreso2_label.pack()
text.pack(pady=10)
button.pack()
ventana.mainloop()