package sub;

import sup.Persona;

public class Estudiante extends Persona{
	private String carnet;
	
	public Estudiante() {
		super();
	}
	
	public Estudiante(String nombre, String apellidos, int edad, 
			boolean tieneHijos, String carnet) {
		super(nombre,apellidos,edad,tieneHijos);
		this.carnet = carnet;
		
	}
	
	@Override
	public void mostrarTipo() {
		System.out.println("Soy Estudiante");
	}
	
	public void leer() {
		System.out.println("Estoy leyendo...");
	}
	
	@Override
	public String toString() {
		return super.toString() + ", carnet=" + carnet;
	}
	
	
}

//sobreescritura -> reemplazo, refinamiento