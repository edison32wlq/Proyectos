import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class SerializacionLectura {
	
	public static List<Persona> leerLista() {
		List<Persona> lstPersona = null;
		try {
			ObjectInputStream objEntrada = 
			 new ObjectInputStream(new FileInputStream("./src/salida.poo"));
			lstPersona = (List<Persona>) objEntrada.readObject();
			objEntrada.close();
			System.out.println("Archivo leído");
		} catch (IOException e){e.printStackTrace();} catch (ClassNotFoundException e){e.printStackTrace();}
		return lstPersona;
	}
	
	public static void main(String[] args) {
		List<Persona> lista = leerLista();
		for(Persona p : lista) {
			System.out.println(p);
		}
	}
	
//	JFrame frm = null;
//	try {
//		ObjectInputStream objEntrada = 
//		 new ObjectInputStream(new FileInputStream("./src/salida.poo"));
//		frm = (JFrame) objEntrada.readObject();
//		objEntrada.close();
//		System.out.println("Archivo leido");
//	} catch (IOException e){e.printStackTrace();} catch (ClassNotFoundException e){e.printStackTrace();}
//	return lstPersona;
}
