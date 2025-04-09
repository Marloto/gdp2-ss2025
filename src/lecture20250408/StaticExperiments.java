package lecture20250408;

public class StaticExperiments {
	private static int abc;
	private static String STANDARD_MESSAGE = "Hello, World!"; 
	
	public void doSomething() {
		System.out.println(STANDARD_MESSAGE);
	}
	
	public static void doOtherthing() {
		// gibt es hier ein this? wenn ja was wird referenziert?
		// -> es gibt kein this!
		System.out.println("Hello, Static!");
	}
	
	public static void main(String[] args) {
		// Bisher: alles musste über Objekte genutzt werden
		StaticExperiments experiments = new StaticExperiments();
		experiments.doSomething();
		// Neu: Verwendung über eine Art "globalen" Ansatz
		// Notwendig: Klassenname als Kontext (anstatt Objekt)
		//            sowie Eigenschaft (Attribute / Methode) mit "static"
		//            Schlüsselwort
		StaticExperiments.doOtherthing();
		// Wann nutzt man Statics?
		// -> Ausgaben auf der Konsole
		// -> typische Funktionen / Utils
		// -> FFI: Anbindung an C-Libs, bei denen es keine OOP-Konzepte gibt
		// -> Konstanten
		
		// in UML sind "statics" unterstrichen, Class-Context (statisch), Instance-Context (nicht-statisch)
		
		// Wie Attribute "static" verwenden?
		StaticExperiments.abc = 1;
		
		Singleton i1 = Singleton.getInstance();
		Singleton i2 = Singleton.getInstance();
		System.out.println("Ist gleich? " + (i1 == i2));
		
	}
}
