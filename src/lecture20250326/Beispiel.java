package lecture20250326;

class Something {
	int a;
}

public class Beispiel {
	int doSomething(int a) {
		a = 42;
		System.out.println("A: " + a); // 42
		return a;
	}
	
	void doSomething(Something obj) {
		obj.a = 21;
		System.out.println("B: " + obj.a); // 21
	}
	
	public static void main(String[] args) {
		Something obj = new Something();
		Beispiel b = new Beispiel();
		int a = 21;
		int c = b.doSomething(a); // es wird nur der wert übergeben
		b.doSomething(obj); // obj wird übergeben, es wird nur der wert übergeben, die kopie der referenz
		// änderungen werden hier sichtbar
		
		System.out.println("C: " + a); // 21
		System.out.println("D: " + obj.a); // 21
		System.out.println("E: " + c); // 42
		
	}
}
