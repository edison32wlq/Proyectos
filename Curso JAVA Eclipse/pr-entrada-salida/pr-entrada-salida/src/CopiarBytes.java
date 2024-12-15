import java.io.*;

public class CopiarBytes {
	/**
	 * Este método hace xyz 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String [] args) throws IOException{
		FileInputStream entrada = null;
		FileOutputStream salida = null;
		try {
			entrada = new FileInputStream("./src/entrada.txt");
			salida = new FileOutputStream("./src/salida3.txt");
			int c; 
			while((c=entrada.read())!=-1) {
				System.out.println(c);
				salida.write(c);
			}
			System.out.println("Archivo copiado");
		}catch (FileNotFoundException e){System.out.println("Archivo no encontrado");} 
		 catch (IOException e) {e.printStackTrace();} 
		finally{
			if(entrada!=null) {entrada.close();}
			if(salida!=null) {salida.close();}
		}
	}
}