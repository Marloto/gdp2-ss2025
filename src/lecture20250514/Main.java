package lecture20250514;

public class Main {
	public static void doSomething() {
		String h = "Hello, World";
		if(h.substring(10, 15) == "World") {
		    System.out.println("Endet mit World");
		}
	}
	public static void doOtherthing() {
		doSomething();
	}
	public static void main(String[] args) {
		doOtherthing();
	}
}
