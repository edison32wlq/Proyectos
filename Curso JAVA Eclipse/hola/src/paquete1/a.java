package paquete1;

public class a {
	
	public int edad;
	protected int peso;
	public a() {
		
	}
	public a(int edad,int peso) {
		this.edad = edad;
		this.peso = peso;
	}
	
	public int sumarEdad() {
		return edad++;
	}
	
	protected int sumarPeso() {
		return peso++;
	}
}


