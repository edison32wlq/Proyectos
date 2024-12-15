
public class Documento implements I1,I2{

	@Override
	public void print() {
		System.out.println("Imprime todo");
	}
	@Override
	public void print(int pag) {
		System.out.println("Imprime pagina" + pag);
	}
	@Override
	public void print(int pini, int pfin) {
		System.out.println("Imprime rango: " + pini + " - " + pfin);
	}
	@Override
	public boolean test() {
		return false;
	}
}
