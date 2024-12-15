package clases;
/**
 * clase que calcular el area y devuelve el nombre de la 
 * figura.
 * creado el 10 de Febrero, 2023 a las 21:00 horas
 * @author Edison Wilfrido Ludeña Quichimbo
 * @author Francisco Javier Calderon Moran
 * @version POO - 2023.
 */
public class Figura {
	protected int x;
	protected int y;
	/**
	 * constructor vacio
	 */
	public Figura() {
		
	}
	/**
	 * constructor para ingrsar datos 
	 * @param x ingresar coordenada x
	 * @param y ingresar coordenada y
	 */
	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * metodo para obtener el valor de x
	 * @return retorna el valor de x
	 */
	public int getX() {
		return x;
	}
	/**
	 * metodo para cambiar el valor de x
	 * @param x ingresar el nuevo valor de x
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * metodo para obtener el valor de y
	 * @return retorna el valor de y
	 */
	public int getY() {
		return y;
	}
	/**
	 * metodo para cambiar y
	 * @param y ingresar el nuevo valor de y
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * metodo para devolver el nombre
	 * @return devuelve una cadena de caracteres
	 */
	public String devolverNombre() {
		return "Soy Figura ";
	}
	/**
	 * metodo para mostrar por pantalla las coordenadas
	 */
	public void mostrarOrigen() {
		System.out.println("Las coordenadas de origen son x = "+ x +", y = "+ y );
	}
	/**
	 * metodo que calcula el area de la figura
	 * @return retorna el valor de el area
	 */
	public double calcularArea() {
		return 0.0;
	}
	/**
	 * metodo que presenta toda la informacion
	 */
	@Override
	public String toString() {
		return "El nombre de la figura es = " + devolverNombre() + ", el area de la figura es = "
				+ calcularArea() + ", la coordenada de origen es x = " + x + ", y =  " + y;
		}
}
