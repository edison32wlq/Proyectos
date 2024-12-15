package clases;

public abstract class Figura {
	protected int x;
	protected int y;
	public Figura() {
		
	}
	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double calcularArea();
	
	public void mostrarOrigen() {
		System.out.println("[x = " + x + ", y = " + y + "]");
	}
	
	public String devolverNombre() {
		return "Soy Figura";
	}
	//accesores
	
	
}
