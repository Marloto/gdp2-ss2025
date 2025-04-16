package lecture20250416;

// Woraus ergibt sich der notwendige Speicherplatz für erzeugte Objekte einer Klasse?
// -> Datentypen spielen eine Rolle
// -> Attribute und deren Datentypen
// -> warum static für sowas wie "MAX_BREITE"?
class Rechteck2 {
	// Initialisierung über Default Wert, ...
	private static final int MAX_BREITE; // = 100;
	
	static {
		MAX_BREITE = 100;
	}
	
	private final int breite = 10;
	
	{
//		this.breite = 10;
	}
	
	public Rechteck2() {
		// Wo darf überall initialisiert werden?
		// -> Im Konstruktor, irgendwo bis zum Ende des Konstruktors muss exakt eine Zuweisung vorkommen
		// -> Initialisierungsblock
		// -> Default-Wert
		if(Math.random() > 0.5) {
//			this.breite = 10;
		} else {
//			this.breite = 5;
		}
	}
	
}

// Geht nicht, da Klasse String final
//class MySpecialString extends String {
//	
//}

public class FinalExamples {
	public static void main(String[] args) {
		String s = ""; // Strings sind nicht änderbar, da die Attribute final sind
	}
}
