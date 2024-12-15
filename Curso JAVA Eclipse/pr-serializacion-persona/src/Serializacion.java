import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serializacion {
	public static void guardarLista(List<Persona> lstPersona) {
		try {
			ObjectOutputStream objSalida = 
			 new ObjectOutputStream(new FileOutputStream("src/salida.poo26"));
			objSalida.writeObject(lstPersona);
			objSalida.close();
			System.out.println("Archivo guardado");
		} catch (IOException e) {e.printStackTrace();}
	}
	
	
	
	
	
	public static List<Persona> leerLista() {
		List<Persona> lstPersona = null;
		try {
			ObjectInputStream objEntrada = 
			 new ObjectInputStream(new FileInputStream("src/salida.poo26"));
			lstPersona = (List<Persona>) objEntrada.readObject();
			objEntrada.close();
			System.out.println("Archivo leído");
		} catch (IOException e){e.printStackTrace();} catch (ClassNotFoundException e){e.printStackTrace();}
		return lstPersona;
	}
//	
	public static void main(String [] args) {
		List<Persona> lstPersona = new ArrayList<Persona>();

////PRIMERA PARTE - GUARDARO		
		
		//lleno al vector de objetos Persona
		for(int i=0; i<10; i++) {
			lstPersona.add(new Persona("Pepe"+i, "Pérez"+i, 25+i));
		}
		//guardo la lista en un archivo
		guardarLista(lstPersona);
		
		
////SEGUNDA PARTE - LECTURA		
//		
 
//		//recupero la lista que está en el archivo
//		lstPersona = leerLista();
//		for (Persona p : lstPersona) {
//			System.out.println(p);
//		}
		
	}
}
