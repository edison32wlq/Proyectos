package clases;
/**
 * clase que calcular el area y devuelve el nombre de la 
 * figura.
 * creado el 10 de Febrero, 2023 a las 21:00 horas
 * @author Edison Wilfrido Ludeña Quichimbo
 * @author Francisco Javier Calderon Moran
 * @version POO - 2023.
 */
public class Triangulo extends Figura{
	private int base;
	private int altura;
	/**
	 * constructor vacio
	 */
	public Triangulo() {
		super();
	}
	/**
	 * constructor donde ingresar los dato
	 * @param x ingresar coordenada x
	 * @param y ingresar coordenada y
	 * @param base ingresar base
	 * @param altura ingresar altura
	 */
	public Triangulo(int x, int y, int base, int altura) {
		super(x,y);
		this.base = base;
		this.altura = altura;
	}
	/**
	 * metodo para obtener el valor de base
	 * @return retorna el valor de base
	 */
	public int getBase() {
		return base;
	}
	/**
	 * metodo para cambiar el valor de base
	 * @param base ingresar nuevo valor de base
	 */
	public void setBase(int base) {
		this.base = base;
	}
	/**
	 * metodo para obtener el valor de altura
	 * @return retorna el valor de altura
	 */
	public int getAltura() {
		return altura;
	}
	/**
	 * metodo para cambiar el valor de altura
	 * @param altura ingresar nuevo valor de altura
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
	/**
	 * metodo que refina el metodo devolverNombre
	 */
	@Override
    public String devolverNombre() {
        return super.devolverNombre() + "Triangulo";
    }
    /**
     * Metodo que calcula el area de la figura
     */
    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }
    /**
     * metodo que presenta los datos completos		
     */
    @Override
	public String toString() {
		return "El nombre de la figura es = " + devolverNombre() + ", el area de la figura es = "
					+ calcularArea() + ", la coordenada de origen es x = " + x + ", y =  " + y;
		}
}
