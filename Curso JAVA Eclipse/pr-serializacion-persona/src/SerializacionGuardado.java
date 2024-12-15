import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class SerializacionGuardado {

	public static void guardarLista(List<Persona> lstPersona) {
		try {
			ObjectOutputStream objSalida = 
			 new ObjectOutputStream(new FileOutputStream("./src/salida.poo"));
			objSalida.writeObject(lstPersona);
			objSalida.close();
			System.out.println("Archivo guardado");
		} catch (IOException e) {e.printStackTrace();}
	}
	
	public static void main(String[] args) {
		Persona p1 = new Persona("Pepe", "Perez",25);
		Persona p2 = new Persona("Juan", "Calle",28);
		Persona p3 = new Persona("Mary", "Torres",20);
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		// llamo al metodo para guardar en disco
		guardarLista(lista);

	}

}
