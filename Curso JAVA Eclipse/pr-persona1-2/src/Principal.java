
public class Principal {

	public static void main(String[] args) {
		Persona [] vp = new Persona[10];
		Persona p1 = new Persona("juanito","perez",20,true); //referencia p1 instanciada
		vp[0] = p1;
		vp[2] = new Persona("Mary","Calle",22,false);
		vp
				
//		for(int i=1; i<vp.length; i++) {
//			System.out.println(vp[i]);
//		}
		
		for(Persona p : vp){//for-each
			System.out.println(p);
		}
		
		
		
		
//		p1.presentarDatos();
//		p1.presentarDatos();
//		p1.setNombre("Juan");
//		p1.presentarDatos();
		
		
		//		System.out.println(p1);
//		
//		Persona p2 = new Persona("pepito","calle",18, true);
//		System.out.println(p2);
//		
//		System.out.println("=====================================================");
//		
//		p1.cumplirAnios();
//		p1.presentarDatos();
//		p2.presentarDatos();
	}

}
