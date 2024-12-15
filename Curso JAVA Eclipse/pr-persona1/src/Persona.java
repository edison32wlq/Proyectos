
public class Persona {
	//atributos
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean tieneHijos;
	
	public Persona() {
	
	}
	
	/**
	 * 
	 * @param nombre nombre de la persona
	 * @param apellidos apellidos de la persona
	 * @param edad edad de una persona
	 * @param tieneHijos estado de si tiene o no hijos una persona
	 */
	public Persona(String nombre, String apellidos, int edad, boolean tieneHijos) { 
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.tieneHijos = tieneHijos;
	}
	
	public void cumplirAnios() {
		edad++;
	}
	
	public void presentarDatos() {
		System.out.println(this);
	}
	
	//MÉTODOS ACCESORES - TIPO GET - DE CONSULTA
	public String getNombre() {
		return nombre;
	}
		
	public int getEdad() {
		return edad;
	}
	
	public boolean getTieneHijos() {
		return tieneHijos;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	//MÉTODOS ACCESORES TIPO SET - CON EFECTO COLATERAL
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setTieneHijos(boolean tieneHijos) {
		this.tieneHijos = tieneHijos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@Override
	public String toString() {
		return "nombre=" + nombre + 
				", apellidos=" + apellidos +
				", edad=" + edad +
				", tieneHijos=" + tieneHijos;
	}
	

}
