package lecture20250527;

public class Mitarbeiter {
	private String name;
	private String abteilung;
	private String position;
	private boolean vollzeit;

	// Konstruktor
	public Mitarbeiter(String name, String abteilung, String position,
			boolean vollzeit) {
		this.name = name;
		this.abteilung = abteilung;
		this.position = position;
		this.vollzeit = vollzeit;
	}

	// Getter
	public String getName() {
		return name;
	}

	public String getAbteilung() {
		return abteilung;
	}

	public String getPosition() {
		return position;
	}

	public boolean isVollzeit() {
		return vollzeit;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setVollzeit(boolean vollzeit) {
		this.vollzeit = vollzeit;
	}

	// toString für ListView-Anzeige
	@Override
	public String toString() {
		String arbeitszeit = vollzeit ? "Vollzeit" : "Teilzeit";
		return name + " (" + abteilung + ", " + position + ", " + arbeitszeit + ")";
	}
}
