package clases;

public class Estudiante extends Persona{
	
	private String carnet;
	public Estudiante() {
		super();
	}
	public Estudiante(String nombre, int edad, String carnet) {
		super(nombre, edad);//creando al objeto de la super clase
		this.carnet = carnet;
	}
	
	//SOBREESCRITURA DE REFINAMIENTO
	@Override
	public String devolverDatos() {
		return super.devolverDatos() + ", carnet: " + carnet;
	}
	
	//SOBREESCRITURA DE REEMPLAZO
	@Override
	public void mostrarTipo() {
		System.out.println("Estudiante");
	}
	
	
	public String getCarnet() {
		return carnet;
	}
	
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
}
