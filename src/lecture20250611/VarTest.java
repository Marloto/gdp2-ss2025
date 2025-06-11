package lecture20250611;

import java.util.function.Consumer;

public class VarTest {
	public static void main(String[] args) {
		int i = 42;
		
		Consumer<Integer> foo = (other) -> System.out.println(other + i);
		foo.accept(42); // was passiert?
		// Konsolenausgabe mit 84
	}
}
