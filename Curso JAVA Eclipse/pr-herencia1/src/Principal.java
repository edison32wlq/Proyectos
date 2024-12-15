import sub.Estudiante;
import sup.Persona;

public class Principal {

	public static void main(String[] args) {
		Persona p1 = new Persona("Juan", "Pérez", 20, true);
		p1.mostrarTipo();
		Estudiante e1 = new Estudiante();
		e1.mostrarTipo();
		
		Persona p2 = new Estudiante();
		p2.mostrarTipo();
		((Estudiante)p2).leer(); //casting
		Estudiante pAux = ((Estudiante)p2);
		pAux.leer();
	}

}