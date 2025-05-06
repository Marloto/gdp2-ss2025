package lecture20250430;

import java.util.Arrays;
import java.util.Comparator;

// Übergang zu Comparable
// -> ist eine Schnittstelle
// -> beschreibt "wie man sortiert"
// -> sie liefert eine Methode die soll ausdrücken wie eine
//    eine abfolge aussehen kann
// -> es wird ein int zurückgegeben, das ausdrückt ob etwas
//    kleiner, gleich oder größer ist
// -> int compareTo(Object other)
//    verglichen wird this mit other
//    this < other entspricht -1
//    this == other entspricht 0
//    this > other entspricht +1

public class App { // <- hier nicht
	public static void main(String[] args) {
		Quadrat[] q = new Quadrat[] {
                new Quadrat(10),
                new Quadrat(2),
                new Quadrat(4)
        }; 
        Student[] s = new Student[] {
                new Student("a", 10),
                new Student("a", 2),
                new Student("c", 4),
                new Student("b", 4),
                new Student("b", 5)
        };
//        Bubblesort.sortiereQuadrat(q);
//        Bubblesort.sortiereStudent(s);
//        Bubblesort.sortiere(q);
//        Bubblesort.sortiere(s);
        
        //Arrays.sort(q);
        Comparator obj1 = new StudentComparatorSortByMatrikelnummer();
        Comparator obj2 = new StudentComparatorSortByName();
        Comparator obj3 = new StudentComparatorSortByMatrikelnummerDesc();
        Arrays.sort(s, obj3);
        
        System.out.println(Arrays.toString(q));
        System.out.println(Arrays.toString(s));
        
	}
}
