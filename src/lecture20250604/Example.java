package lecture20250604;

class A { }

public class Example {
	
	private static String SOMETHING ="";
	
	public class B { } 
	
	public static class C { }
	
	public void doSomething() {
		new A(); // geht, weil normale nicht öffentliche klasse
		new B(); // geht, weil Objektbezug (this)
		new C(); // geht, weil statisch, und normal verwendet werden kann
	}
	
	public static void main(String[] args) {
		new A();
		
		
		// vgl. "innere klasse kann nur in einem objekt der 
		// äußeren klasse erzeugt werden"
		// new B();
		
		// Statisch, daher kein Objektbezug notwendig
		new C();
		
		new Example().doSomething();
	}
}
