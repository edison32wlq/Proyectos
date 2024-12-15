package clases;
/**
 * clase que calcular el area y devuelve el nombre de la 
 * figura.
 * creado el 10 de Febrero, 2023 a las 21:00 horas
 * @author Edison Wilfrido Ludeña Quichimbo
 * @author Francisco Javier Calderon Moran
 * @version POO - 2023.
 */
public class Rectangulo extends Figura {
	private int largo;
	private int alto;
	/**
	 * constructor vacio
	 */
	public Rectangulo() {
		super();
	}
	/**
	 * metodo constructor
	 * @param x ingresar coordenada x
	 * @param y ingresar coordenada y
	 * @param largo ingresar el largo
	 * @param alto ingresar el alto
	 */
	public Rectangulo(int x, int y,int largo, int alto ) {
		super(x,y);
		this.largo = largo;
		this.alto = alto;
	}
	/**
	 * metodo para obtener el valor 
	 * @return retorna el valor de largo
	 */
	public int getlargo() {
		return largo;
	}
	/**
	 * metodo para cambiar el valor de largo
	 * @param largo ingresar el nuevo valor de largo
	 */
	public void setLargo(int largo) {
		this.largo = largo;
	}
	/**
	 * metodo para obtener el valor de alto
	 * @return retorna el valor de alto
	 */
	public int getAlto() {
		return alto;
	}
	/**
	 * metodo para cambiar el valor de alto
	 * @param alto ingrese el valor de alto
	 */
	public void setAlto(int alto){
		this.alto = alto;
	}
	
	/**
	 * metodo que refina el metodo de devolverNombre
	 */
	@Override
	public String devolverNombre() {
		return super.devolverNombre() + "Rectangulo";
	}
	/**
	 * metodo que calcula el valr del area
	 */
	@Override
	public double calcularArea() {
		return largo*alto;
	}
	/**
	 * metodo que  muestra los datos completos
	 */
	@Override
	public String toString() {
		return "El nombre de la figura es = " + devolverNombre() + ", el area de la figura es = "
				+ calcularArea() + ", la coordenada de origen es x = " + x + ", y =  " + y;
	}

	
}
