import java.io.*;
import java.util.HashMap;
import java.util.List;

public class ContadorVocales {
	
	private static boolean esVocal(char letra){
       switch(letra){
           case 97: // Vocal a
               return true;
           case 101: // Vocal e
        	   return true;
           case 105: // Vocal i
        	   return true;
           case 111: // Vocal o
        	   return true;
           case 117: // Vocal u
        	   return true;
           default :
        	   return false;
       }
    }
	
	private static void crearArchivoMapa() {
		BufferedReader entrada = null;
		ObjectOutputStream objSalida = null;		
		
		//Mapa de <Clave, valor>
		HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 0);
        hashMap.put("e", 0);
        hashMap.put("i", 0);
        hashMap.put("o", 0);
        hashMap.put("u", 0);
		
		try {
			entrada = new BufferedReader(new FileReader("src/archivo.txt"));
			String linea;
			//recorro todas las líneas del archivo de texto
			while((linea=entrada.readLine())!=null) {
				// Recorremos la línea de texto letra por letra y vemos si es una vocal
		        for (int x = 0; x < linea.length(); x++) {
		            char letraActual = linea.charAt(x);
		            if (esVocal(letraActual)) {
		                // La clave es la vocal en sí, pero en minúscula
		                String clave = String.valueOf(letraActual).toLowerCase();
		                // Aumentamos el conteo en esa clave
		                hashMap.put(clave, hashMap.get(clave) + 1);
		            }
		        }
			}
			objSalida = 
					new ObjectOutputStream(new FileOutputStream("src/salida4.txt"));
			objSalida.writeObject(hashMap);		
			System.out.println("Archivo creado");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(entrada!=null) {entrada.close();}
				if(objSalida!=null) {objSalida.close();}
			}catch (IOException e) {e.printStackTrace();}
		}
			
	}
	
	private static HashMap<String, Integer> leerArchivoMapa() {
		HashMap<String, Integer> hashMap = null;
		try {
			ObjectInputStream objEntrada = 
					new ObjectInputStream(new FileInputStream("src/salida4.txt"));
			hashMap = (HashMap<String, Integer>) objEntrada.readObject();
			objEntrada.close();
			System.out.println("Archivo leído");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return hashMap;
	}	
	
	public static void main(String [] args) throws IOException {
		crearArchivoMapa();
		HashMap<String, Integer> hashMap = leerArchivoMapa();
		System.out.println("****** Imprimiendo resultados ******");
		//Imprimir resultados
        for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.printf("Vocal: %s. Conteo: %d\n", entry.getKey(), entry.getValue());
        }
	}
}
