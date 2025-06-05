package lecture20250604;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Predicate;

import javafx.event.EventHandler;

class Person {
	private final String name;

	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}

public class LambdaExamples {
	public static void main(String[] args) {
		// TreeSet in Java ist sortiert, entweder Comparable mit compareTo an Person implementieren
		// oder Comparator als ext. Sortierkriterium
//		TreeSet<Person> set = new TreeSet<>(new Comparator<>() {
//			public int compare(Person o1, Person o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		
		//TreeSet<Person> set = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));
		
		Comparator<Person> comparator = (o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		};
		TreeSet<Person> set = new TreeSet<>(comparator);
		
		set.add(new Person("C"));
		set.add(new Person("A"));
		set.add(new Person("B"));
		
		for(Person p : set) {
			System.out.println(p.getName());
		}
		
		Iterable<Person> obj = () -> set.iterator();
		for(Person p : obj) {
			
		}
		
		Runnable run = () -> System.out.println("Hello, World");
		
		run.run();
		Iterator<Person> iterator = obj.iterator();
		while(iterator.hasNext()) {
			iterator.next();
		}
		
		int compare = comparator.compare(new Person("A"), new Person("B"));
		
		// Mit Lambda-Ausdrücken entsteht "irgendwie" ein objekt, das sich auf 
		// einen Datentyp substituieren lässt, welcher sich aus der Zuweisung bzw. dem Parameterdatentyp
		// ergibt.
		
		// Die resultierenden Objekte können mit Bezug zur Schnittstelle normal verwendet werden
		// i.R. die Methoden die die Schnittstelle definiert einfach aufrufen - der Lambda Ausdruck
		// ist hier nur eine Vereinfachung zur Erzeugung dieser Objekte.
	}
}
