package lecture20250401;

class Rechteck {
	// ...
	void doOtherthing() {
		
	}
}

class SomeGcExamples {
	private Rechteck rechteck; 
	
	public static void main(String[] args) {
		SomeGcExamples sge = new SomeGcExamples();
		Rechteck r = sge.doSomething();
	}

	private Rechteck doSomething() {
		Rechteck r = new Rechteck();
		this.rechteck = r; // objekt kann überleben, wenn man z.B.
		                   // die ref. in ein attribut speichert
		return r; // ... oder zurückgibt
		// ... alle lokalen variablen löschen, referenz anpassen
		// -> gibt es noch referenzen? nein, dann löschen!
		
	}
}
