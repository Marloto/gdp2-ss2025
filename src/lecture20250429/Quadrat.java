package lecture20250429;

public class Quadrat  implements ISortable { // <- Zu sortierende Elemente
    private int seitenlaenge;

    public Quadrat(int seitenlaenge) {
        super();
        this.seitenlaenge = seitenlaenge;
    }
    
    public int getSortableAttribute() {
    	return this.seitenlaenge;
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