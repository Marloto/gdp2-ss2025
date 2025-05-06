package lecture20250430;

public class Quadrat  implements ISortable { // <- Zu sortierende Elemente
    private int seitenlaenge;

    public Quadrat(int seitenlaenge) {
        super();
        this.seitenlaenge = seitenlaenge;
    }
    
    public boolean compare(ISortable other) {
    	// was wäre notwendig?
    	if(other instanceof Quadrat) {
    		return this.getSeitenlaenge() > ((Quadrat)other).getSeitenlaenge();
    	} else {    		
    		return false;
    	}
    }
	
	public int flaeche() {
		return seitenlaenge * seitenlaenge;
	}


    public int getSeitenlaenge() {
        return seitenlaenge;
    }
    
    public int getValue() {
        return seitenlaenge;
    }

    @Override
    public String toString() {
        return "Quadrat [seitenlaenge=" + seitenlaenge + "]";
    }
    
}