package lecture20250325;

class Rechteck {
	int hoehe = 2;
	int breite = 3;
	
	
	// Etwas spezielles: Initialisierungsblock
	{
		System.out.println("wtf?");
	}
	
	// Was würde sich hier an Konstr. anbieten 
	// wie könnten diese Verknüpft werden
	// 1. einer mit zwei Parametern (hoehe, breite)
	// 2. einer ohne mit default-Werten
	// 3. einer mit nur einem Parameter für Quadrate
	
	Rechteck(int h, int b) {
		hoehe = h;
		breite = b;
		System.out.println("a");
	}
	
	Rechteck(int l) {
		this(l, l); // <- als erste Anweisung
		System.out.println("b");
	}
	
	Rechteck() {
		this(1);
		System.out.println("c");
	}

	int flaeche() {
		return hoehe * breite;
	}
	
	void seitenLaengen(int h, int b) {
		hoehe = h;
		breite = b;
	}
	void seitenLaengen(double h, double b) {
		seitenLaengen((int) h, (int) b);
	}
	
	void seitenLaengen(int l) {
		// wie kann man die anderen überladenen methoden verwenden?
		seitenLaengen(l, l);
	}

	// keine überladung, rückgabedatentyp wird nicht berücksichtigt 
//	boolean seitenLaenge(int l) {
//		hoehe = l;
//		breite = l;
//	}
	
	public static void main(String[] args) {
		int foo = 42; 
		Rechteck r = new Rechteck(); // wie ist die Konsolenausgabe?
		Rechteck r2 = r;
		
		
		r.seitenLaengen(3, 2);
		r2.seitenLaengen(4);
		System.out.println(r.breite + "/" + r.hoehe); // 4 / 4 wird ausgeben
	}
}