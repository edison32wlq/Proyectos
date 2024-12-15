import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerCaracteres {
	public static void main(String [] args) throws IOException{
		File file = null;
		FileReader in = null;
		try{
			file = new File("./src/entrada.txt");
			in = new FileReader(file);
			int c; 
			while((c=in.read())!=-1) {//End Of File
				System.out.println(c);
				System.out.println((char)c);
				
			}
			System.out.println("Fin de archivo!");
		}catch (FileNotFoundException e){e.printStackTrace();} 
		 catch (IOException e) {e.printStackTrace();} 
		finally {
			//close() garantiza que se cierre el stream
			if(in!=null) {in.close();}
		}
	}
}