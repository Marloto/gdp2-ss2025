package lecture20250423;

enum WochentagTyp {
    MONTAG("Montag"), DIENSTAG("Dienstag"), MITTWOCH("Mittwoch"), DONNERSTAG("Donnerstag"), 
    FREITAG("Freitag"), SAMSTAG("Samstag"), SONNTAG("Sonntag");
	
	private String name;
	
	// Konstruktoren?
	private WochentagTyp(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}