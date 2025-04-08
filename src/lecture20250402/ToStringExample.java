package lecture20250402;

class Produkt {
	int price = 42;
	String name = "Kirsche";
	
	// To-String-Methoden lassen sich über rechtsklick -> source -> generate toString erzeugen
	// Signatur muss immer genau so aussehen
	public String toString() {
		return "Produkt [price=" + price + ", name=" + name + "]";
	}
}

public class ToStringExample {
	public static void main(String[] args) {
		Produkt produkt = new Produkt();
		// Standardausgabe mit System.out.println ist nicht der Inhalt, nur der Name
		// der Klasse zzgl. einer Zahl
		String something = "Test";
		System.out.println(produkt);
		System.out.println(something);
		
		// Bei der Verwendung des +-Operators mit Zeichenketten verwendet Java
		// ebenfalls die toString-Methode um den Nicht-String anzugleichen
		String result = "Meine Produkte -> " + produkt;
		System.out.println(result);
		
		// Wie kann man für eine beliebige Klasse beeinflussen, was mit println ausgegeben wird?
		// -> mit der toString-Methode in der Klasse
		
		
		String original = "abc";
		String bar = new String(original);
		String foo = bar;
	}
}
