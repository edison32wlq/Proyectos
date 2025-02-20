import tkinter as tk
import galleta


class formularioFortuna:
    def penitencias(self,root):
        self.root = root
        self.root.title("--Penitencias --")

        self.labelMensaje = tk.Label(root, text = "HOLA").pack()