package modelo;

import javax.swing.ImageIcon;

/**
 * Clase que contiene informacion sobre los autores de este proyecto 
 * creado el 18 de Febrero, 2023, 10:30 horas
 * @author Joseph Gutierrez Murillo
 * @author Harry Ordoñez Alava
 * @version poo - 2023
 */
public class Autor {

	private String nombre;
	private ImageIcon foto;
	private String email;

	/**
	 * Constructor por defecto
	 */
	public Autor() {

	}

	/**
	 * Constructor que resive parametros
	 * @param nombre El nombre del autor
	 * @param foto imagen del auto en formato jpg o png
	 * @param email correo del autor 
	 */
	public Autor(String nombre, ImageIcon foto, String email) {
		this.nombre = nombre;
		this.foto = foto;
		this.email = email;
	}

	// accesores getters
	public String getNombre() {
		return nombre;
	}

	public ImageIcon getFoto() {
		return foto;
	}

	public String getEmail() {
		return email;
	}

	// accesores setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFoto(ImageIcon foto) {
		this.foto = foto;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Metodo ToString 
	 */
	@Override
	public String toString() {
		return "Autor [" + nombre + ", foto: " + foto + ", email: " + email + "]";
	}

}
