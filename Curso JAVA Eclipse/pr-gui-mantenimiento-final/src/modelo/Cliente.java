package modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author Univ. de Guayaquil
 *
 */
public class Cliente implements Serializable {
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean esVip;
	
	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellidos, int edad, boolean esVip) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.esVip = esVip;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEsVip() {
		return esVip;
	}

	public void setEsVip(boolean esVip) {
		this.esVip = esVip;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", esVip=" + esVip + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(apellidos, other.apellidos) && edad == other.edad && esVip == other.esVip
				&& Objects.equals(nombre, other.nombre);
	}			
}
