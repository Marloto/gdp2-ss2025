package lecture20250415;

class Quadrat extends Rechteck {
    protected void setLaenge(double laenge) {
		this.laenge = laenge; // <- kann sich ändern
	}
    
    public Quadrat flaeche() {
    	return null;
    }
}

public class Rechteck {
    protected double laenge;
    protected double breite;
	public Rechteck flaeche() {
		//return laenge * breite;
		return null;
	}

	private void setLaenge(double laenge) {
		this.laenge = laenge;
	}
	
	public static void main(String[] args) {
		Quadrat quadrat = new Quadrat();
	}
}