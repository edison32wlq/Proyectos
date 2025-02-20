import tkinter 

ventana = tkinter.Tk()
ventana.geometry("400x400")

etiqueta = tkinter.Label(ventana, text ="Hola mundo", bg ="RED")
etiqueta.pack(fill=tkinter.X)
ventana.title("Ejemplo")

def click_del_boton():
    print("Presionaste el Boton")


boton = tkinter.Button(ventana, text= "Presiona ", command=click_del_boton).pack()

ventana.title("Caja de texto")

caja_texto = tkinter.Entry(ventana)
caja_texto.pack()

def obtener_texto():
    texto_ingresado = caja_texto.get()
    print("texto ingresado : ", texto_ingresado) 



obtener = tkinter.Button(ventana, text= " Registrar ", command=obtener_texto).pack()


img = tkinter.PhotoImage(file="lanscape2.png")
lbl_img=tkinter.Label(ventana, image= img)
lbl_img.pack()


ventana.mainloop()