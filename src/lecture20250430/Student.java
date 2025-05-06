package lecture20250430;

//Übergang zu Comparable
//-> ist eine Schnittstelle
//-> beschreibt "wie man sortiert"
//-> sie liefert eine Methode die soll ausdrücken wie eine
// eine abfolge aussehen kann
//-> es wird ein int zurückgegeben, das ausdrückt ob etwas
// kleiner, gleich oder größer ist
//-> int compareTo(Object other)
// verglichen wird this mit other
// this < other entspricht -1, eigentlich kann es irgend ein negativer sein
// this == other entspricht 0
// this > other entspricht +1, eigentlich kann es irgend ein positiver wert sein

public class Student implements ISortable, Comparable { // <- Zu sortierende Elemente
    private String name;
    private int matrikelnummer;

    public Student(String name, int matrikelnummer) {
        super();
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }
    
    public boolean compare(ISortable other) {
    	// arr[1] wäre this, arr[i+1] ist other
    	// prüfen was "other" für einen Datentyp hat, und
    	// nur fortsetzen wenn ich den vergleich durchführen kann
    	// -> "instanceof"
    	
    	if(other instanceof Student) {
    		return this.getMatrikelnummer() > ((Student)other).getMatrikelnummer();
    	} else {
    		return false;
    	}
    }

	public int compareTo(Object other) {
//    	if(other instanceof Student) {
////    		if(this.getMatrikelnummer() > ((Student)other).getMatrikelnummer()) {
////    			return 1;
////    		} else if(this.getMatrikelnummer() < ((Student)other).getMatrikelnummer()) {
////    			return -1;
////    		}
////    		return 0;
//    		
//    		//return this.getMatrikelnummer() - ((Student)other).getMatrikelnummer();
//    		
//    		return Integer.valueOf(this.getMatrikelnummer()).compareTo(((Student)other).getMatrikelnummer());
//    	} else {
//    		return -1;
//    	}
    	
    	// Wie wäre es, wenn wir nach dem Namen sortieren?
    	// this.name < other.name
    	// String ist eine Standardklasse
//		if(other instanceof Student) {
//			return this.name.compareTo(((Student)other).name);
//		} else {
//    		return -1;
//    	}
		
		// Vergleich mit mehreren Kriterien
		// -> die Reihenfolge aus den Anforderungen ableiten, nacheinander abarbeiten, nächstes Kriterium nur bei
		//    vergleichsergebnis == 0
		if(other instanceof Student) {
			int compareTo = this.name.compareTo(((Student)other).name);
			if(compareTo == 0) {
				return Integer.valueOf(this.getMatrikelnummer()).compareTo(((Student)other).getMatrikelnummer());
			}
			return compareTo;
		} else {
			return -1;
		}
	}

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public int getValue() {
        return this.matrikelnummer;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", matrikelnummer=" + matrikelnummer + "]";
    }

}
