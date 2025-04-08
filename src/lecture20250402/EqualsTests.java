package lecture20250402;

class Dog {
	int alter;
	String name;
	public Dog(int alter, String name) {
		this.alter = alter;
		this.name = name;
	}
	
	public boolean equals(Object a) {
		// a könnte null sein, prüfen Sie soetwas
		if(a == null) {
			return false;
		}
		// was wenn die referenzen gleich sind?
		// this und a -> die sind zu vergleichen
		// if(this == a) ?
		if(this == a) {
			return true;
		}
		
		// Class überprüfen? ja, aber erst ab Kapitel 3
		// -> vgl. instanceof und Vererbung
		
		// Parameter auf Klasse Casten
		Dog d = (Dog) a;
		
		if(this.name == null && d.name != null) {
			return false;
		}
		
		// Vergleichen der Attribute
		// -> alle? soweit sinnvoll
		return this.alter == d.alter && 
				//this.name == d.name; // <- so nicht
				this.name.equals(d.name);
		// was kann bei dem Vergleich mit equals
		// schief gehen?
		// this.name könnte null, d.name darf null sein
		// wenn die Klasse sicherstellt, dass es nie null wird - dann müsste man es nicht berücksichtigen
		// andernfalls überprüfen sie für Objekte ebenfalls
		
	}
}

public class EqualsTests {
	public static void main(String[] args) {
		Dog dog1 = new Dog(1, "a");
		Dog dog2 = new Dog(1, "a");
		
		// So nicht vergleichen! kein true.
		if(dog1 == dog2) {
			System.out.println("gleich?");
		}
		
		dog1.equals(dog1);
		dog1.equals(dog2);
		
	}
}
