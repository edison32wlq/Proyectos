
public class Principal {

	public static void main(String[] args) {
		Persona [] vp = new Persona[10];		
		Persona p1 = new Persona("juanito", "pérez", 20, true);//referencia p1 instanciada
		vp[0] = p1;
		vp[1] = new Persona("Mary", "Calle", 22, false);
		vp[2] = new Persona();
		
//		for(int i=0; i<vp.length; i++) {
//			System.out.println(vp[i]);
//		}
		for(Persona p : vp) {//for-each
			System.out.println(p);
		}
	}

}

//nombre=Pepe, apellidos=Pérez, edad=19, tieneHijos=true