package lecture20250429;

import java.util.Arrays;

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
        Bubblesort.sortiere(q);
        Bubblesort.sortiere(s);
        
        System.out.println(Arrays.toString(q));
        System.out.println(Arrays.toString(s));
        
	}
}
