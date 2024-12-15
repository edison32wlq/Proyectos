
public class A {//SOBRECARGA
	void f() { //f->0
		
	}
	
	void f(int a, double b) { //f -> 2 {int,double}
		
	}
	
	String f(int b, char c) {//f -> 2 {int,char}
		return null;
	}
}
