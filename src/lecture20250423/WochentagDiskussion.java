package lecture20250423;

public class WochentagDiskussion {
//	Vorschlag 1: Als Array
//	private String[] wochentag = new String[] {"Montag", "Dienstag"};
//	
//	public String getWochentag(int tag) { // 1..7
//		if(tag >= 1 && tag <= 7)
//			return null;
//		return wochentag[tag - 1];
//	}
	
//  Vorschlag 3: Eigenschafte des Wochentags initialisieren
	public static final int MONTAG = 1;
	
	private int tag;
	private String name;
	
	public WochentagDiskussion(int tag, String name) {
		this.tag = tag;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTag() {
		return tag;
	}
	
	// Verwendung z.B. new Wochentag(Wochentag.MONTAG, "Montag");
}

// Vorschlag 2: Vererbungsstrukturen
// class Montag extends Wochentag { ... }
// class Dienstag extends Wochentag { ... }
// ...
