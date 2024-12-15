import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirCaracteres {
	public static void main(String [] args) throws IOException{
		File file = null;
		FileWriter salida = null;
		try{
			file = new File("src/salida1.txt");
			salida = new FileWriter(file);
			int i=0; 
			while(i<10) {
				int c = (int)Math.floor(Math.random()*(122-97)+97); 
				System.out.println((char)c);
				salida.write(c);
				i++;
			}
			System.out.println("Archivo creado!");
		}catch (FileNotFoundException e){e.printStackTrace();} 
		 catch (IOException e) {e.printStackTrace();} 
		finally {
			if(salida!=null) {salida.close();}
		}
	}
}