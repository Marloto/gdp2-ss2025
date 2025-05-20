package lecture20250514;

import org.junit.Test;

public class TestClass {
	@Test
	public void doTest() {
		String h = "Hello, World";
		if(h.substring(10, 15) == "World") {
			System.out.println("Endet mit World");
		}
	}
}
