package Principal;

import clases.Figura;
import clases.Circunferencia;
import clases.Rectangulo;
import clases.Triangulo;
/**
 * clase que calcular el area y devuelve el nombre de la 
 * figura.
 * creado el 10 de Febrero, 2023 a las 21:00 horas
 * @author Edison Wilfrido Ludeña Quichimbo
 * @author Francisco Javier Calderon Moran
 * @version POO - 2023.
 */
public class Principal {

	public static void main(String[] args) {
		Figura f = new Figura(1,2);
		Triangulo t = new Triangulo(1,2,3,4);
		Circunferencia c = new Circunferencia(4,6,5);
		Rectangulo r= new Rectangulo(6,4,3,1);
		
		System.out.println("INTEGRANRES");
		System.out.println(" - Edison Wilfrido Ludeña Quichimbo");
		System.out.println(" - Francisco Javier Calderon Moran");
		System.out.println();
		System.out.println(f.devolverNombre());
		f.mostrarOrigen();
		System.out.println(f.calcularArea());
		System.out.println(f);
		f.setX(2);
		f.mostrarOrigen();
		System.out.println(f.calcularArea());
		System.out.println(f);
		System.out.println();
		
		System.out.println(r.devolverNombre());
		r.mostrarOrigen();
		r.setLargo(5);
		r.setAlto(3);
		System.out.println(r.calcularArea());
		System.out.println(r);
		r.setAlto(9);
		r.calcularArea();
		System.out.println(r.calcularArea());
		System.out.println(r);
		System.out.println();
		
		System.out.println(c.devolverNombre());
		c.mostrarOrigen();
		System.out.println(c.calcularArea());
		System.out.println(c);
		c.setRadio(4);
		System.out.println(c.calcularArea());
		System.out.println(c);
		System.out.println();
		
		System.out.println(t.devolverNombre());
		t.mostrarOrigen();
		System.out.println(t.calcularArea());
		System.out.println(t);
		t.setBase(7);
		t.setAltura(3);
		System.out.println(t.calcularArea());
		System.out.println(t);
		
	}

}
