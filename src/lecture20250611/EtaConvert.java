package lecture20250611;

import java.util.function.Consumer;
import java.util.function.Function;

class Person {
	public Person(String name) {}
	public Person(String name, int age) {}
}

public class EtaConvert {
	public static Person doSomething(String name) { return null; }
	public static Person doSomething(String name, int age) { return null; }
	
	public static void main(String[] args) {
		Consumer<String> cons1 = (v1) -> System.out.println(v1);
		Consumer<String> cons2 = System.out::println;
		
		//public interface Function<T, R> { R apply(T t); }
		Function<String, Person> foo1 = (input) -> new Person(input);
		Function<String, Person> foo2 = Person::new;
		
		Function<String, Person> foo3 = (input) -> EtaConvert.doSomething(input);
		Function<String, Person> foo4 = EtaConvert::doSomething; 
	}
}
