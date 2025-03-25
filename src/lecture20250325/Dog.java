package lecture20250325;

class Dog {
	boolean hasBoneInMouth;
	// [sichtbarkeit, später] <Datentyp> <Name> [= <default-wert>];
	int legs = 4; // wird bei Objekterzeugung (new) verwendet und 
	              // als wert auf das Attribut kopiert

	// Wenn wir die Erzeugung (new) steuern wollen, dann
	// können wir Konstruktoren ergänzen, spezielle Methoden
	// die nur beim erzeugen von Objekten verwendet werden
	// wie siehen die aus?
	// [sichtbarkeit, später] <NameDerKlasse>(<Parameter>) { <Body> }
	
	
	// Default-Konstruktor, gibt es immer solange keine anderen Konstruktoren
	// ist ein Konstruktor ohne Parameter
	Dog() {
//		legs = 4;
//		hasBoneInMouth = false;
		this(4);
		// new Dog(1); <- erzeugt neue instanz, macht hier keinen sinn
		
	}
	
	// Konstruktor mit Parametern
	// Typische Aufgabe: alle Attribute zu initialisieren
	Dog(int l) {
		this(l, false);
		legs = l;
		hasBoneInMouth = false;
	}
	
	Dog(int foo, boolean h) {
		legs = foo;
		hasBoneInMouth = h;
	}
	
	// Mehrere Konstruktor: Es folgt vergleichbaren Regeln beim Überladen
	// -> man kann beliebig viele Konstruktoren verwenden
	// -> Anzahl, Abfolge od. Datentypen der Parameter müssen
	//    anders sein
	
	// Wenn Konstruktoren verknüpft werden sollen
	// kann in der ersten _Anweisungszeile_ darf
	// this(...);
	
	boolean dropBone() {
		System.out.println("Woof.");
		return hasBoneInMouth = false;
	}

	boolean getBone() {
		System.out.println("Woof.");
		return hasBoneInMouth = true;
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		// System.out.println(dog);
	}
}