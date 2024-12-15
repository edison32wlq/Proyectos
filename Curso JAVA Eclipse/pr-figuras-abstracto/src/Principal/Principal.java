package Principal;

import clases.Figura;
import clases.Rectangulo;

public class Principal {

	public static void main(String[] args) {
		Figura f = new Rectangulo(5,5,5,10);
		System.out.println(f.calcularArea());
	}

}
