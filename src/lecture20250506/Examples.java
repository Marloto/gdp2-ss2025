package lecture20250506;

import java.util.ArrayList;

public class Examples {
	public static void main(String[] args) {
		// Festgesetzte Größe
		// -> wie kann man arrays "vergrößern", neues erstellen und altes kopieren
		// -> wie wird man Elemente los, kann diese löschen? Ebenfalls neues 
		//    array, und nur das kopieren was nicht gelöscht wird
		int[] arr = new int[] {1,3,4,5};
		
		// Diese Arten von "algorithmischen" Lösungen für typischen Probleme
		// finden sich in bereits implementierten Datenstrukturen wieder
		
		// Was speichern solche Datenstrukturen?
		// Das Attribut ist definiert mit "Object[] elementData;"
		ArrayList arr2 = new ArrayList();
		arr2.add(1);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		arr2.add("Hello, World!"); // <- ebenso möglich
		// Wozu Generics da?
		// -> Dann wenn wir mit typen arbeiten wollen, die aus einer Klasse wie 
		//    ArrayList noch garnicht direkt feststeht
		// -> man baut nicht für jeden "Datentyp" eine passende Datenstruktur
		ArrayList<Integer> arr3 = new ArrayList<>();
		arr3.add(1);
		arr3.add(3);
		arr3.add(4);
		arr3.add(5);
		// arr3.add("Hello, World!"); geht jetzt nicht mehr!
		ArrayList<?> arr4 = new ArrayList<>();
		// -> es gibt wildcards und möglichkeiten Typen einzugrenzen
		//    steht aber aktuell nicht im Fokus
	}
}
