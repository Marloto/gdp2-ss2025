package lecture20250520;
interface A {}

interface B extends A {}

class Vermoegen implements Comparable<Vermoegen> {
	public int compareTo(Vermoegen o) {
		return 0;
	}
}

class Bankkonto extends Vermoegen implements A {}

class Wertpapier extends Vermoegen implements B  {}

class Immobilie extends Vermoegen {}

class Sparkonto extends Bankkonto {}

class Girokonto extends Bankkonto {}

class Optionsschein extends Wertpapier {}

class Aktie extends Wertpapier {}

public class SubsPrinzip {
	public static void main(String[] args) {
		Bankkonto[] list = new Bankkonto[] { new Sparkonto(), new Girokonto() };
		Vermoegen[] foo = list; // <- ja array-datentypen lassen sich ebenso substituieren
		// foo[0] = new Vermoegen();
	}
}
