package lecture20250604;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
public interface Predicate<T> {
 boolean test(T t);
}

public interface Consumer<T> {
 void accept(T t);
}
 */

class Person2 {
	private final String name;
	private final int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}

public class FilterExample {
	
	public static void fancyFilter(ArrayList<Person2> arr, Predicate<Person2> condition, Consumer<Person2> print) {
		for(Person2 p : arr) {
			if(condition.test(p)) {
				print.accept(p);
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Person2> arr = new ArrayList<>();

		arr.add(new Person2("C", 16));
		arr.add(new Person2("A", 42));
		arr.add(new Person2("B", 24));
		
		//public interface Predicate<T> { boolean test(T t); }
		Predicate<Person2> condition = (person) -> person.getName().substring(0, 1).equals("A");
		
		//public interface Consumer<T> {void accept(T t);}
		Consumer<Person2> print = (person) -> System.out.println("Gefundene Person:" + person.getName());
		
		fancyFilter(arr, condition, print);
		
//		for(Person p : arr) {
//			if(p.getAge() >= 18) {
//				System.out.println("Person:" + p.getName());
//			}
//		}
		
	}
}
