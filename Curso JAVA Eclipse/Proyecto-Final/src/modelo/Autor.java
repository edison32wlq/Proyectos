package modelo;

/**
 * clase la cual manejara la infotmacion del autor 
 * creado el 02 de Marzo del 2023 a las 21:00 horas
 * @author Edison Wilfrido Ludeña Quichimbo
 * @author Francisco Javier Calderon Moran
 * @version POO - 2023.
 *
 */
public class Autor {

	private String nombre;
	private String foto;
	private String email;
	
	
	/**
	 * constructor vacio
	 */
	public Autor() {
		
	}
/**
 * constructor con todos los paramatros 
 * @param nombre agregar el nombre
 * @param foto agregar la foto
 * @param email agragar el email
 */
	public Autor(String nombre, String foto, String email) {
		super();
		this.nombre = nombre;
		this.foto = foto;
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", foto=" + foto + ", email=" + email + "]";
	}
	
	
	
}
