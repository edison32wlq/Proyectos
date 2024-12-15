import java.io.File;
public class UsoFile {
	public static void main(String args[]) {
		File file = new File("./src/entrada.txt");
		if (file.exists()) {
			System.out.println("Nombre del archivo "+ file.getName());
			System.out.println("Ruta "+ file.getPath());
			System.out.println("Ruta absoluta "+ file.getAbsolutePath());
			System.out.println("Se puede leer "+file.canRead());
			System.out.println("Se puede escribir "+file.canWrite());
			System.out.println("Tamaño "+file.length());
		}	
	}
}
