package lecture20250408;

import static lecture20250408.StaticExperiments.doOtherthing;

import lecture20250408.formen.viereck.Rechteck;

public class PackageExample {
	public static void main(String[] args) {
		Rechteck rechteck = new Rechteck();
		lecture20250408.Rechteck r2 = new lecture20250408.Rechteck(); // man könnte teil-packages verwenden
		// i.R. aber die zweite Klasse mit dem selben Namen voll ausschreiben
		
		// Sonder-Feature:
		// statics?
		doOtherthing();
		
		StaticExperiments.main(args);
	}
}
