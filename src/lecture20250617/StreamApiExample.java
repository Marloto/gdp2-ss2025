package lecture20250617;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {
	private final String name;
	private final int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return this.getName() + " (" + this.getAge() + ")";
	}
	
}

public class StreamApiExample {
	public static void main(String[] args) {
		ArrayList<Person> arr = new ArrayList<>();

		arr.add(new Person("Claus", 16));
		arr.add(new Person("Anna", 42));
		arr.add(new Person("Albert", 42));
		arr.add(new Person("Abc", 42));
		arr.add(new Person("Bert", 24));
		
		// Was wären denn typische Operationen, die man auf einem Datenstrom nutzen könnte?
		// -> filter, entspricht im wesentlichen einem if
		// -> map, dient zur transformation eines übergebenen wertes (objekt) in ein 
		//    anderes (oder das selbe)
		
		
		// Schnittstelle: Stream
		Stream<Person> stream1 = arr.stream();
		// fitler nutzt Predicate, interface Predicate<T> { boolean test(T el); }
		Stream<Person> stream2 = stream1.filter((person) -> person.getAge() >= 18);
		// forEach nutzt Consumer, interface Consumer<T> { void accept(T el); }
		// stream2.forEach((person) -> System.out.println(person));
		Stream<Person> stream3 = stream2.filter((person) -> person.getName().startsWith("A"));
		stream3.forEach(System.out::println);
		
		// Typische Schreibweise
		arr.stream()
			.filter((person) -> person.getAge() >= 18)
			.filter((person) -> person.getName().startsWith("A"))
			.forEach(System.out::println);
		
		// Beispiel für Map
		// map nutzt Function, interface Function<T, K> { K apply(T el); }
		// class Stream<T> { public <D> Stream<D> map(Function<T, D> f) { ... } }
		arr.stream()
			.filter((person) -> person.getAge() >= 18)
			.filter((person) -> person.getName().startsWith("A"))
			.map((person) -> person.getName())
			.forEach(System.out::println);
		
		// Andere Operatoren
		// -> peek (erlaubt ein element zu "nutzen", ohne es zu verändern, verwendet Consumer
		// -> flatMap: <R> Stream<R> flatMap(Function<T, Stream<R>> mapper);
		
		Arrays.asList("a;b;c", "d;e").stream()
			.flatMap((el) -> Arrays.stream(el.split(";")))
			.forEach(System.out::println);
		
		// -> sorted: Sortiert den Datenstrom, Comparator (zwei Elemente des selben Typs, int zurück)
		//    interface Comparator<T> { public int compare(T o1, T o2); }
		
		arr.stream()
			.filter((person) -> person.getAge() >= 18)
			.filter((person) -> person.getName().startsWith("A"))
			.map((person) -> person.getName())
			.sorted((name1, name2) -> name1.compareTo(name2))
			.forEach(System.out::println);
		
		// Was sind Terminal-Operatoren?
		// -> forEach: Consumer, interface Consumer<T> { void accept(T el); }
		// -> count: liefert einfach ein long
		// -> toArray: erzeugt immer ein Object, weil in Java keine new T[5]; möglich, daher generell
		//    (egal ob Stream oder Collection) toArray():Object[]
		// -> collect: sammelt in Datenstrukturen, implementierungen in Collectors (toList, toSet, usw)
		// -> reduce: T reduce(T identity, BinaryOperator<T> op), 
		//    BinaryOperator ist BiFunction<T, U, R> {R apply(T, U); }
		
		// Beispiel für count
		long count = arr.stream()
			.filter((person) -> person.getAge() >= 18)
			.filter((person) -> person.getName().startsWith("A"))
			.map((person) -> person.getName())
			.sorted((name1, name2) -> name1.compareTo(name2))
			.count();
		System.out.println(count);
		
		// Beispiel für toArray, liefert immer Object
		Object[] array = arr.stream()
			.filter((person) -> person.getAge() >= 18)
			.filter((person) -> person.getName().startsWith("A"))
			.map((person) -> person.getName())
			.sorted((name1, name2) -> name1.compareTo(name2))
			.toArray();
		
		// Beispiel für collect (List)
		List<String> collect = arr.stream()
			.filter((person) -> person.getAge() >= 18)
			.filter((person) -> person.getName().startsWith("A"))
			.map((person) -> person.getName())
			.sorted((name1, name2) -> name1.compareTo(name2))
			.collect(Collectors.toList());
		
		// Beispiel für collect (Set)
		Set<String> collect2 = arr.stream()
			.filter((person) -> person.getAge() >= 18)
			.filter((person) -> person.getName().startsWith("A"))
			.map((person) -> person.getName())
			.sorted((name1, name2) -> name1.compareTo(name2))
			.collect(Collectors.toSet());
		
		// Beispiel für reduce
		Integer reduce = arr.stream()
			.filter((person) -> person.getAge() >= 18)
			.filter((person) -> person.getName().startsWith("A"))
			.map((person) -> person.getName())
			.sorted((name1, name2) -> name1.compareTo(name2))
			.map((name) -> name.length())
			.reduce(0, (a1, a2) -> a1 + a2);
		System.out.println(reduce);
		
		
		
		
		
	}
	
	// Warum liefert toArray ein Object-Array an Streams / Colletions?
	public class Example<T> {
		public T[] toArray() {
			// new T[]; geht nicht, daher kann man von generischen Typen kein Array erzeugen
			// -> eine toArray liefert daher zumeist ein Object-Array
			return null;
		}
		public T[] toArray(T[] t) {
			// Man findet Workarounds in der Java-Standard-Implementierung, bei der man
			// ein egal wie groß erzeugtes Array übergibt und dann mit
			// Arrays.copyOf vergrößert/verkleinert - dadurch kann man typsicher
			// das richtige Array erzeugen und zurückgeben
			T[] copyOf = Arrays.copyOf(t, 10);
			return copyOf;
		}
	}
	
}
