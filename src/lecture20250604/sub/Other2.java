package lecture20250604.sub;

import lecture20250604.Example;

public class Other2 {
	public static void main(String[] args) {
		// new A(); kann nicht verwendet werden
		// new B(); geht nicht, weil kein Objektbezug
		new Example.C();
		
		Example.B b;
	}
}

