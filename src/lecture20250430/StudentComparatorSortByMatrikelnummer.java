package lecture20250430;

import java.util.Comparator;

// Comparable sortiert die natürliche Ordnung
// einer Klasse bzw. deren Objekte
// Comparator sortiert etwas mit etwas - also "unabhängig" von der
// eigentlichen Klasse

//verglichen wird o1 mit o2
//o1 < o2 entspricht -1, eigentlich kann es irgend ein negativer sein
//o1 == o2 entspricht 0
//o1 > o2 entspricht +1, eigentlich kann es irgend ein positiver wert sein

public class StudentComparatorSortByMatrikelnummer implements Comparator {

	public int compare(Object o1, Object o2) {
		if(o1 == o2) {
			return 0;
		}
		
		if(o1 == null) {
			return -1;
		}
		
		if(o2 == null) {
			return 1;
		}

		if(!(o1 instanceof Student) && !(o2 instanceof Student)) {
			return 0;
		}
		if(!(o1 instanceof Student)) {
			return -1;
		}
		if(!(o2 instanceof Student)) {
			return 1;
		}
		
		
		// was passiert dann wenn klar ist, es sind zwei Studenten
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		return s1.getMatrikelnummer() - s2.getMatrikelnummer();
	}
	
}
