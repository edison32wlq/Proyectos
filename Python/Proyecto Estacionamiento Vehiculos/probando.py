import tkinter as tk
from tkinter import messagebox
from PIL import Image, ImageTk
import re
import Cerebro


ventana = None

def abrir_ventana_entrada():
    global ventana
    ventana.destroy()
    ventana_secundaria_entrada = tk.Tk()
    ventana_secundaria_entrada.geometry("400x300")
    ventana_secundaria_entrada.title("Entrada")
    ventana_secundaria_entrada.config(bg="white") 

    pantalla_width = ventana_secundaria_entrada.winfo_screenwidth()
    pantalla_height = ventana_secundaria_entrada.winfo_screenheight()

    ventana_width = 400  
    ventana_height = 300  

    pos_x = (pantalla_width // 2) - (ventana_width // 2)
    pos_y = (pantalla_height // 2) - (ventana_height // 2)

    ventana_secundaria_entrada.geometry(f"400x300+{pos_x}+{pos_y}")

    label = tk.Label(ventana_secundaria_entrada, text="REGISTRAR ENTRADA", font=("Arial", 16), fg="black", bg="white")
    label.pack()
    
    cedulaLbl = tk.Label(ventana_secundaria_entrada, text="Cédula del Cliente ", fg="black", bg="white")
    cedulaLbl.place(x=10, y=70)

    def toggle_placeholder(e):
        if cedulaEntry.get() == "Ej: 1234567890": 
            cedulaEntry.delete(0, tk.END)
            cedulaEntry.config(fg="black")
        elif not cedulaEntry.get():
            cedulaEntry.insert(0, "Ej: 1234567890") 
            cedulaEntry.config(fg="gray")

    cedulaEntry = tk.Entry(ventana_secundaria_entrada, fg="gray")
    cedulaEntry.insert(0, "Ej: 1234567890") 
    cedulaEntry.bind("<FocusIn>", toggle_placeholder)
    cedulaEntry.bind("<FocusOut>", toggle_placeholder)
    cedulaEntry.place(x=130, y=70)

    placaLbl = tk.Label(ventana_secundaria_entrada, text="Placa del Vehiculo ", fg="black", bg="white")
    placaLbl.place(x=10, y=150)

    def toggle_placeholder1(e):
        if placaEntry.get() == "Ej: ABC-1234": 
            placaEntry.delete(0, tk.END)
            placaEntry.config(fg="black")
        elif not placaEntry.get():
            placaEntry.insert(0, "Ej: ABC-1234")  
            placaEntry.config(fg="gray")

    placaEntry = tk.Entry(ventana_secundaria_entrada, fg="gray")
    placaEntry.insert(0, "Ej: ABC-1234") 
    placaEntry.bind("<FocusIn>", toggle_placeholder1)
    placaEntry.bind("<FocusOut>", toggle_placeholder1)
    placaEntry.place(x=130, y=150)

    def validar_formato(cedula, placa):
        cedula = cedula.strip()
        placa = placa.strip()
        
        cedula_pattern = r'^\d{10}$'  
        placa_pattern = r'^[A-Z]{3}-\d{4}$'

        if not re.match(cedula_pattern, cedula):
            return "Formato de cédula inválido. Debe ser 10 dígitos."
        if not re.match(placa_pattern, placa):
            return "Formato de placa inválido. Debe ser AAA-1234."
        return None

    def ingresar_datos(cedula, placa):
        try:
            mensaje = Cerebro.registrar_entrada(cedula, placa)
            return mensaje
        except ValueError as e:
            return str(e)   

    def ingresar_datos_en_ventana():
        cedula = cedulaEntry.get()  
        placa = placaEntry.get()   

        if cedula.strip() == "" or cedula == "Ej: 1234567890" or placa.strip() == "" or placa == "Ej: ABC-1234":
            messagebox.showerror("Error", "Debe ingresar información en los 2 campos")
            return

        print(f"Valor de cédula capturado: '{cedula}'")
        print(f"Valor de placa capturado: '{placa}'")

        mensaje_error = validar_formato(cedula, placa)
        if mensaje_error:
            messagebox.showerror("Error", mensaje_error)
            return

        mensaje = ingresar_datos(cedula, placa)  

        if "Error" in mensaje:
            messagebox.showerror("Error", mensaje)
        else:
            messagebox.showinfo("Información del Ticket", mensaje)

    btnIngresar = tk.Button(ventana_secundaria_entrada, text="INGRESAR", command=ingresar_datos_en_ventana, bg="#003366", fg="white")
    btnIngresar.place(x=100, y=250)

    btnRegresar = tk.Button(ventana_secundaria_entrada, text="REGRESAR", bg="red", fg="white", command=lambda: [ventana_secundaria_entrada.destroy(), abrir_ventana_principal()])
    btnRegresar.place(x=250, y=250)

def abrir_ventana_salida():
    global ventana
    ventana.destroy()
    ventana_secundaria_salida = tk.Tk()
    ventana_secundaria_salida.geometry("400x350")
    ventana_secundaria_salida.title("Salida")
    ventana_secundaria_salida.config(bg="white") 

    pantalla_width = ventana_secundaria_salida.winfo_screenwidth()
    pantalla_height = ventana_secundaria_salida.winfo_screenheight()

    ventana_width = 400  
    ventana_height = 350  

    pos_x = (pantalla_width // 2) - (ventana_width // 2)
    pos_y = (pantalla_height // 2) - (ventana_height // 2)

    ventana_secundaria_salida.geometry(f"400x350+{pos_x}+{pos_y}")

    label = tk.Label(ventana_secundaria_salida, text="REGISTRAR SALIDA", font=("Arial", 16), fg="black", bg="white")
    label.place(x= 90, y= 10 )

    cedulaLbl = tk.Label(ventana_secundaria_salida, text="Número de Ticket: ", fg="black", bg="white",font=("Arial", 10))
    cedulaLbl.place(x=10, y=60)

    TicketEntry = tk.Entry(ventana_secundaria_salida)
    TicketEntry.place(x=130, y=60)

    frame_estacionados = tk.Frame(ventana_secundaria_salida)
    frame_estacionados.place(x=10, y=100, width=380, height=200)  

    scrollbar = tk.Scrollbar(frame_estacionados)
    scrollbar.pack(side=tk.RIGHT, fill=tk.Y)  

    text_info = tk.Text(frame_estacionados, wrap=tk.WORD, yscrollcommand=scrollbar.set, bg="lightgray", fg="black", font=("Arial", 12))
    text_info.pack(side=tk.LEFT, fill=tk.BOTH, expand=True)  

    scrollbar.config(command=text_info.yview)

    def actualizar_vehiculos():
        info_vehiculos = Cerebro.mostrar_vehiculos_estacionados()
        text_info.config(state=tk.NORMAL)  
        text_info.delete(1.0, tk.END) 
        text_info.insert(tk.END, info_vehiculos)  
        text_info.config(state=tk.DISABLED)  

    def ingresar_datos2(busqueda):
        try:
            mensaje = Cerebro.registrar_salida(busqueda)
            return mensaje
        except ValueError as e:
            return str(e) 
        
    def ingresar_datos_en_ventana2():
        ticket = TicketEntry.get()  
        mensaje2 = ingresar_datos2(ticket)  

        if "Error" in mensaje2:
            messagebox.showerror("Error", mensaje2)
        else:
            if messagebox.showinfo("Información", mensaje2):
                actualizar_vehiculos() 
        TicketEntry.delete(0, tk.END)

    actualizar_vehiculos()

    btnIngresar = tk.Button(ventana_secundaria_salida, text="INGRESAR", command= ingresar_datos_en_ventana2, bg="#003366", fg="white")
    btnIngresar.place(x=100, y= 310)

    btnRegresar = tk.Button(ventana_secundaria_salida, text="Regresar", bg="red", fg="white", command=lambda: [ventana_secundaria_salida.destroy(), abrir_ventana_principal()])
    btnRegresar.place(x=250, y= 310)


def abrir_ventana_registro():
    global ventana
    ventana.destroy()
    ventana_secundaria_registro = tk.Tk()
    ventana_secundaria_registro.geometry("400x300")
    ventana_secundaria_registro.title("Registro")
    ventana_secundaria_registro.config(bg="white") 

    pantalla_width = ventana_secundaria_registro.winfo_screenwidth()
    pantalla_height = ventana_secundaria_registro.winfo_screenheight()


    ventana_width = 400  
    ventana_height = 300  


    pos_x = (pantalla_width // 2) - (ventana_width // 2)
    pos_y = (pantalla_height // 2) - (ventana_height // 2)


    ventana_secundaria_registro.geometry(f"400x300+{pos_x}+{pos_y}")

    info_facturas = Cerebro.generar_reporte()


    title_label = tk.Label(ventana_secundaria_registro, text="REGISTRO", font=("Arial", 20, "bold"), bg="white", fg="black")
    title_label.place(x=130, y=10)

    frame_registro = tk.Frame(ventana_secundaria_registro)
    frame_registro.place(x=10, y=50, width=380, height=200)  

    scrollbar = tk.Scrollbar(frame_registro)
    scrollbar.pack(side=tk.RIGHT, fill=tk.Y)

    text_info = tk.Text(frame_registro, wrap=tk.WORD, yscrollcommand=scrollbar.set, bg="lightgray", fg="black", font=("Arial", 12))
    text_info.pack(side=tk.LEFT, fill=tk.BOTH, expand=True)  

    scrollbar.config(command=text_info.yview)

    text_info.insert(tk.END, info_facturas)
    text_info.config(state=tk.DISABLED)  

    btnRegresar = tk.Button(ventana_secundaria_registro, text="Regresar", bg="red", fg="white", command=lambda: [ventana_secundaria_registro.destroy(), abrir_ventana_principal()])
    btnRegresar.place(x=170, y=260)

def abrir_ventana_principal():
    global ventana  
    ventana = tk.Tk()
    ventana.geometry("600x500") 
    ventana.config(bg="white")  

    pantalla_width = ventana.winfo_screenwidth()
    pantalla_height = ventana.winfo_screenheight()

    ventana_width = 600  
    ventana_height = 500  

    pos_x = (pantalla_width // 2) - (ventana_width // 2)
    pos_y = (pantalla_height // 2) - (ventana_height // 2)

    ventana.geometry(f"600x500+{pos_x}+{pos_y}")

    ventana.title("Estacionamiento")

    icon_image = Image.open("icono.png")
    icon_photo = ImageTk.PhotoImage(icon_image)
    ventana.iconphoto(True, icon_photo)

    logo_image = Image.open("Logo.png")
    logo_image = logo_image.resize((100, 100), Image.Resampling.LANCZOS)
    logo_photo = ImageTk.PhotoImage(logo_image)
    logo_label = tk.Label(ventana, image=logo_photo, bg="white")
    logo_label.image = logo_photo  
    logo_label.place(x=490, y=0)

    titulo = tk.Label(ventana, text="REGISPARK", font=("Arial", 36, "bold"), fg="black", bg="white")
    titulo.place(x=170, y=10)
    
    subtitulo = tk.Label(ventana, text="Bienvenido", font=("Arial", 20), fg="gray", bg="white")
    subtitulo.place(x=230, y=70)

    estilo_botones = {
        "font": ("Arial", 14),
        "width": 22,
        "height": 2,
        "bd": 2,
        "relief": "raised"
    }

    btnRentrada = tk.Button(ventana, text="Registrar Entrada", bg="#003366", fg="white", **estilo_botones, command=abrir_ventana_entrada)
    btnRentrada.place(x=190, y=130)

    btnRsalida = tk.Button(ventana, text="Registrar Salida", bg="#003366", fg="white", **estilo_botones, command=abrir_ventana_salida)
    btnRsalida.place(x=190, y=210)

    btn_generar_reporte = tk.Button(ventana, text="Generar Reporte", bg="#003366", fg="white", **estilo_botones, command=abrir_ventana_registro)
    btn_generar_reporte.place(x=190, y=290)

    btnSalir = tk.Button(ventana, text="Salir", bg="red", fg="white", width=10, height=2, font=("Arial", 14, "bold"), command=ventana.quit)
    btnSalir.place(x=250, y=370)

    ventana.mainloop()

abrir_ventana_principal()
