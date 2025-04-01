package lecture20250401;

// Es kann beliebig viele Klassen geben
// -> man kann steuern wer wen sehen kann
// -> schlüsselworte wie public, private und protected steuern dies
// -> public jeder darf darauf zugreifen
// -> private keiner außer die definierende Klasse darf zugreifen
//    -> verwendbar um den Zugriff zu steuern, und selbst
//       zu definieren was man damit macht
//    -> z.B. Singleton-Pattern (nächstes Semester, SE), kann
//       man mit privaten Konstruktoren steuern
//       Ein Beispiel zu Statics
// -> protected: spielte eine Rolle bei Vererbung
// -> "nichts": bedeutet "package internal"
public class Visibilities {
	public int a = 42;
	private int b = 21;
	
	public Visibilities() {
	}
	
	public void doSomething() {
		System.out.println("tada...");
	}
	
	private void doOtherthing() {
		
	}
	
	public static void main(String[] args) {
		
	}
}
