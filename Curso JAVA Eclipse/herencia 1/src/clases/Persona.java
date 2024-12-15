package clases;

public class Persona {
	protected String nombre;
	protected int edad;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String devolverDatos() {
		return "nombre: " + nombre + ", edad: " + edad;
	}
	
	public void mostrarTipo() {
		System.out.println("Persona");
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad () {
		return edad;
	}
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString(){
		return "nombre: " + nombre + ", edad: " + edad;
	}
}
