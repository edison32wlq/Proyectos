package clases;

public class Rectangulo extends Figura{

	private int largo;
	private int alto;
	
	public Rectangulo() {
		
	}
	public Rectangulo(int x, int y, int largo, int alto) {
		super(x,y);
		this.largo = largo;
		this.alto = alto;
	}
	@Override
	public double calcularArea() {
		return largo * alto;
	}
	
	//accesores
	
	//toString
}
