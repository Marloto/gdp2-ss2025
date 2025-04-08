package lecture2025048;

public class CountedClass {
	private static int counter = 0;
	
	public CountedClass() {
		counter ++;
	}
	
	public static void main(String[] args) {
		new CountedClass();
		new CountedClass();
		new CountedClass();
		new CountedClass();
		new CountedClass();
		
		System.out.println("Anzahl: " + CountedClass.counter);
	}
}
