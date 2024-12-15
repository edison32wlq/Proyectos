package clases;
/**
 * clase que calcular el area y devuelve el nombre de la 
 * figura.
 * creado el 10 de Febrero, 2023 a las 21:00 horas
 * @author Edison Wilfrido Ludeña Quichimbo
 * @author Francisco Javier Calderon Moran
 * @version POO - 2023.
 */
public class Circunferencia extends Figura{
	private double radio;
	/**
	 * constructor vacio
	 */
	public Circunferencia() {
		super();
	}
	/**
	 * constructor donde ingresar datos
	 * @param x ingresar coordeanda x
	 * @param y ingresar coordenada y
	 * @param radio ingresar radio
	 */
	public Circunferencia(int x, int y, double radio) {
		super(x,y);
		this.radio = radio;
	}
	/**
	 * metodo que obtiene el valor de radio
	 * @return
	 */
	 public double getRadio() {
		 return radio;
	 }
	 /**
	  * metodo que cambia el valor de radio
	  * @param radio ingresa el nuevo valor de radio
	  */
	 public void setRadio(int radio) {
		 this.radio = radio;
	 }
	 /**
	 * metodo que refina el metodo de devolverNombre
	 */
	 @Override
	 public String devolverNombre() {
		 return super.devolverNombre() + "Circunferencia";
	 }
	 /**
	  * Método que calcula el area de la figura
	  */
	 @Override
	 public double calcularArea() {
		 return Math.PI * Math.pow(radio, 2);
	 }
	 /**
	  * Método que presenta los datos completos
	  */
	 @Override
	 public String toString() {
		 return "El nombre de la figura es = " + devolverNombre() + ", el area de la figura es = "
					+ calcularArea() + ", la coordenada de origen es x = " + x + ", y =  " + y;
		}
}
