package sup;

public class Persona {
	protected String nombre;
	protected String apellidos;
	protected int edad;
	protected boolean tieneHijos;
	
	public Persona() {}
	
	public Persona(String nombre, String apellidos, 
					int edad, 
					boolean tieneHijos) { 
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.tieneHijos = tieneHijos;
	}
	
	public void mostrarTipo() {
		System.out.println("Soy Persona");
	}
	
	@Override
	public String toString() {
		return "nombre=" + nombre + 
				", apellidos=" + apellidos +
				", edad=" + edad +
				", tieneHijos=" + tieneHijos;
	}	
}
