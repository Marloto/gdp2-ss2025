package group02.lecture20250408;

//1. Projekt erzeugen
//2. Klasse "AudioFile" ohne Package erzeugen
//3. tests-Ordner erstellen
//4. tests-Ordner als Quellcode-Ordner markieren
//5. Java-Dateien vom APA-Kursraum aus tests.zip in tests-Ordner kopieren
//6. Rechtsklick Projekt -> Build-Path -> Add Lib. -> JUnit -> JUnit 4

public class AudioFile {
	private String pathname;

	public AudioFile(String pathname) {
		this.pathname = pathname;
	}

	public AudioFile() {
	}

	public String getPathname() {
		return "test.mp3";
	}

	// Strg / Ctrl + Leertaste: Content-Assist
	// Strg / Cmd + 1: Quick-Fix
	// Shift: Markieren in Kombination mit Pfeiltasten od. zum Anfang / Ende der
	// Zeile hüpfen
	// Strg / Cmd gedrückt halten
	// Strg / Cmd + O: Overlay-Outline
	// Strg / Cmd + 7: Toggle Line-Comment
	// Strg / Cmd + Shift + F: Auto-Format
	// -> Formatierung kann konfiguriert werden (Settings -> Java -> Code Style -> Formatter)
	// Strg / Cmd + L: Jump-To-Line
	// Strg / Cmd + D: Delete Line
	// Strg / Cmd + Alt / Option + Pfeiltasten hoch / runter: Duplizieren
	// -> key bindings
	// Alt / Option + Pfeiltasten: Markierte Zeilen verschieben
	// Refactoring über Rechtsklick z.B. mit Renaming
	public static void main(String[] args) {
		// "new " + Content-Assist, dann markieren und Quick-Fix
		AudioFile audioFile = new AudioFile();
		audioFile.getPathname();
		audioFile.getPathname();

	}



}