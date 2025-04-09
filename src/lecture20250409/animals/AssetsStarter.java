package lecture20250409.animals;

public class AssetsStarter {
	// static nicht notwendig, es genügt diese außerhalb der AssetsStarter zu erzeugen
	// -> static im AssetsStarter ist eine "Statische innere Klasse" -> kommen wir in Kapitel 10 drauf zurück
	
	static class Vermoegen {}

	static class Bankkonto extends Vermoegen {}
	static class Wertpapier extends Vermoegen {}
	static class Immobilie extends Vermoegen {}
	
	static class Sparkonto extends Bankkonto {}
	static class Girokonto extends Bankkonto {}
	
	static class Optionsschein extends Wertpapier {}
	static class Aktie extends Wertpapier {}

    public static void main(String[] args) {
        Vermoegen v = new Vermoegen();
        Bankkonto bk = new Bankkonto();
        Wertpapier wp = new Wertpapier();
        Immobilie im = new Immobilie();
        Sparkonto o1 = new Sparkonto();
        Girokonto gk = new Girokonto();
        Optionsschein o = new Optionsschein();
        Aktie a = new Aktie();
    }
}

// Dies wäre ein sauberer weg für die Aufgabe
// -> in der Regel einfach neue "Klasse" in Eclipse erzeugen und aktuell nicht so stark über diese Formen der Definitionen stolpern
class Vermoegen {}

class Bankkonto extends Vermoegen {}
class Wertpapier extends Vermoegen {}
class Immobilie extends Vermoegen {}

class Sparkonto extends Bankkonto {}
class Girokonto extends Bankkonto {}

class Optionsschein extends Wertpapier {}
class Aktie extends Wertpapier {}
