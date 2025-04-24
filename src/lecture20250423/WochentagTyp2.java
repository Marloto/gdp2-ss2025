package lecture20250423;

// enum WochentagTyp {    MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG }
// WochentagTyp foo = WochentagTyp.MONTAG
// ... damit am Ende WochentagTyp2 bar = WochentagTyp2.MONTAG

public class WochentagTyp2 {
	
	public static final WochentagTyp2 MONTAG = new WochentagTyp2("MONTAG");
	public static final WochentagTyp2 DIENSTAG = new WochentagTyp2("DIENSTAG");
	public static final WochentagTyp2 MITTWOCH = new WochentagTyp2("MITTWOCH");
	public static final WochentagTyp2 DONNERSTAG = new WochentagTyp2("DONNERSTAG");
	public static final WochentagTyp2 FREITAG = new WochentagTyp2("FREITAG");
	public static final WochentagTyp2 SAMSTAG = new WochentagTyp2("SAMSTAG");
	public static final WochentagTyp2 SONNTAG = new WochentagTyp2("SONNTAG");
	
	// Typische Attribute
	private int ordinalCounter = 0;
	private int ordinal;
	private String name;
	
	// Konstruktor
	private WochentagTyp2(String name) {
		this.ordinal = ordinalCounter ++;
		this.name = name;
	}
	
	public int ordinal() {
		return ordinal;
	}
	
	public String name() {
		return name;
	}
}
