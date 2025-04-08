package lecture2025048;

import lecture2025048.formen.viereck.Rechteck; // <- ab jetzt kann "Rechteck" als Bezeichner für diesen FQCN
import static lecture2025048.StaticExperiments.doOtherthing;

public class PackageExample {
	public static void main(String[] args) {
		Rechteck rechteck = new Rechteck();
		lecture2025048.Rechteck r2 = new lecture2025048.Rechteck(); // man könnte teil-packages verwenden
		// i.R. aber die zweite Klasse mit dem selben Namen voll ausschreiben
		
		// Sonder-Feature:
		// statics?
		doOtherthing();
		
		StaticExperiments.main(args);
	}
}
