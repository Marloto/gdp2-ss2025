package lecture20250506;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Examples {
	public static void main(String[] args) {
//		// Festgesetzte Größe
//		// -> wie kann man arrays "vergrößern", neues erstellen und altes kopieren
//		// -> wie wird man Elemente los, kann diese löschen? Ebenfalls neues 
//		//    array, und nur das kopieren was nicht gelöscht wird
//		int[] arr = new int[] {1,3,4,5};
//		
//		// Diese Arten von "algorithmischen" Lösungen für typischen Probleme
//		// finden sich in bereits implementierten Datenstrukturen wieder
//		
//		// Was speichern solche Datenstrukturen?
//		// Das Attribut ist definiert mit "Object[] elementData;"
//		ArrayList arr2 = new ArrayList();
//		arr2.add(1);
//		arr2.add(3);
//		arr2.add(4);
//		arr2.add(5);
//		arr2.add("Hello, World!"); // <- ebenso möglich
//		// Wozu Generics da?
//		// -> Dann wenn wir mit typen arbeiten wollen, die aus einer Klasse wie 
//		//    ArrayList noch garnicht direkt feststeht
//		// -> man baut nicht für jeden "Datentyp" eine passende Datenstruktur
//		ArrayList<Integer> arr3 = new ArrayList<>();
//		arr3.add(1);
//		arr3.add(3);
//		arr3.add(4);
//		arr3.add(5);
//		// arr3.add("Hello, World!"); geht jetzt nicht mehr!
//		ArrayList<?> arr4 = new ArrayList<>();
//		// -> es gibt wildcards und möglichkeiten Typen einzugrenzen
//		//    steht aber aktuell nicht im Fokus
//		
//		ArrayList<Integer> arr5 = new ArrayList<>();
//		List<Integer> arr6 = arr5;
//		Collection<Integer> arr7 = arr5;
//		
//		
//		Object arr8 = arr5;
//		// auch AbstractCollection, AbstractList, usw.
//		ArrayList<String> arr9 = new ArrayList<>();
//		String strg = "Hello, World";
//		arr9.add(strg);
//		arr9.add(strg);
//		arr9.add(strg);
//		arr9.add(strg);
//		arr9.add(strg);
//		System.out.println(arr9.size()); // == 5
//		
//		// ---
//		ArrayList<Integer> arr10 = new ArrayList<>();
//		arr10.add(1);
//		arr10.add(3);
//		arr10.add(4);
//		arr10.remove(Integer.valueOf(4));
		
		
		HashSet<Integer> hashSet = new HashSet<>();
		TreeSet<Integer> treeSet = new TreeSet<>();
		hashSet.add(1);
		treeSet.add(1);
		hashSet.add(42);
		treeSet.add(42);
		hashSet.add(21);
		treeSet.add(21);
		hashSet.add(84);
		treeSet.add(84);
		
		for(Integer a: hashSet) {
			System.out.println(a);
		}
		System.out.println("---");
		
		for(Integer b: treeSet) {
			System.out.println(b);
		}
		
		HashSet<String> set;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("abc", "123");
		
	}
	
	
	
	
	
	
	
	
}
