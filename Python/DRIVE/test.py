import tkinter

# Crea la ventana 
ventana = tkinter.Tk()
ventana.geometry("400x400")

etiqueta= tkinter.Label(ventana, text=" Hola mundo" , bg="Red")
etiqueta.pack(fill=tkinter.X)
# pone el titulo a la ventana 
ventana.title("CELULARES MIKA")

#crea un funcion que al presionar  envia un mensaje a consola
def click_del_Boton():
    print("Presionaste el Boton")
    
# asigna la funcion al boton     
boton= tkinter.Button (ventana, text= " Presiona ", command=click_del_Boton).pack()

#Cambia el titulo 
ventana.title(" Caja de texto")

# Crea una funcion con el valor ingresado en una caja de texto
def obtener_texto():
    texto_ingresado = caja_texto.get()
    print(" Texto Ingresado: ", texto_ingresado)

#Crea una caja de texto 
caja_texto=tkinter.Entry(ventana)
caja_texto.pack()

# Crea un boton para asignar la funcion de obtener el texto
obtener= tkinter.Button(ventana, text=" Registrar",command=obtener_texto).pack()

# Ingresa una imagen en un Label
img = tkinter.PhotoImage(file="hojita.png") 
lbl_img = tkinter.Label(ventana, image=img)
lbl_img.pack()



ventana.mainloop()