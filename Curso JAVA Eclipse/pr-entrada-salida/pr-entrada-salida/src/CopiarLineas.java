import java.io.*;

public class CopiarLineas {
	public static void main(String [] args) throws IOException {
		BufferedReader entrada = null;
		PrintWriter salida = null;
		try {
			entrada=new BufferedReader(new FileReader("./src/entrada.txt"));
			salida = new PrintWriter(new FileWriter("./src/salida2.txt"));
			String linea;
			while((linea=entrada.readLine())!=null){
				System.out.println(linea);
				salida.println(linea);
			}
			System.out.println("Archivo copiado");
		}catch (FileNotFoundException e){e.printStackTrace();} 
		catch (IOException e){e.printStackTrace();}
		finally {
			if(entrada!=null) {entrada.close();}
			if(salida!=null) {salida.close();}
		}
	}
}