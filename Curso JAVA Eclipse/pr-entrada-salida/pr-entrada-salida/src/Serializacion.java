import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serializacion {
	public static void guardarLista(ArrayList<Persona> lstPersona) {
		try {
			ObjectOutputStream objSalida = 
			 new ObjectOutputStream(new FileOutputStream("./src/salida4.poo"));
			objSalida.writeObject(lstPersona);
			objSalida.close();
			System.out.println("Archivo guardado");
		} catch (IOException e) {e.printStackTrace();}
	}	
	
	public static ArrayList<Persona> leerLista() {
		ArrayList<Persona> lstPersona = null;
		try {
			ObjectInputStream in = 
			 new ObjectInputStream(new FileInputStream("./src/salida4.poo"));
			lstPersona = (ArrayList<Persona>)in.readObject();
			in.close();
			System.out.println("Archivo leído");
		} catch (IOException e){e.printStackTrace();} catch (ClassNotFoundException e){e.printStackTrace();}
		return lstPersona;
	}	
	
	public static void main(String [] args) {
//		ArrayList<Persona> lstPersona = leerLista();
//		for(Persona p : lstPersona) {
//			System.out.println(p);
//		}	
		ArrayList<Persona> lstPersona = new ArrayList<Persona>();
		//Guarda la lista en disco duro
		lstPersona.add(new Persona("Pepe", "Pérez", 20, "Soltero"));
		lstPersona.add(new Persona("Juan", "Calle", 25, "Casado"));
		guardarLista(lstPersona);		
	}
}
