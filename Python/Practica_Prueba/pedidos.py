import tkinter as tk

class Pedido:
    def __init__(self):
        self.ventana = tk.Tk()
        self.ventana.geometry("600x500") 
        self.ventana.title("Pedidos")
        
        self.label_titulo = tk.Label(self.ventana, text="PEDIDOS YA", font=("Arial", 20), fg="black")
        self.label_titulo.place(x=240, y=10)

        self.lista = []

        self.checkbox_hamburguesa = tk.BooleanVar()
        self.checkbox_pizza = tk.BooleanVar()
        self.checkbox_HotDog = tk.BooleanVar()
        self.checkbox_bebidas = tk.BooleanVar()

        self.checkboxHamburguesa = tk.Checkbutton(self.ventana, text="Hamburguesa", variable=self.checkbox_hamburguesa, command=self.actualizar)
        self.checkboxHamburguesa.place(x=10, y=40)

        self.checkBoxPizza = tk.Checkbutton(self.ventana, text="Pizza", variable=self.checkbox_pizza, command=self.actualizar)
        self.checkBoxPizza.place(x=10, y=80)

        self.checkboxHotDog = tk.Checkbutton(self.ventana, text="Hot Dog", variable=self.checkbox_HotDog, command=self.actualizar)
        self.checkboxHotDog.place(x=10, y=120)

        self.checkboxBebidas = tk.Checkbutton(self.ventana, text="Bebidas", variable=self.checkbox_bebidas, command=self.actualizar)
        self.checkboxBebidas.place(x=10, y=160)

        self.label = tk.Label(self.ventana, text="No has seleccionado ningún producto")
        self.label.place(x=10, y=200)

        self.ventana.mainloop()

    def actualizar(self):
        self.lista.clear()
        if self.checkbox_hamburguesa.get():
            self.lista.append("Hamburguesa")
        if self.checkbox_pizza.get():
            self.lista.append("Pizza")
        if self.checkbox_HotDog.get():
            self.lista.append("Hot Dog")
        if self.checkbox_bebidas.get():
            self.lista.append("Bebidas")
    
        self.label.config(text=f"Has seleccionado lo siguiente: {', '.join(self.lista)}" if self.lista else "No has seleccionado ningún producto")


pedido = Pedido()