package lecture20250402;

public class StringCompare {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		
		// wie können zwei Zeichenketten verglichen werden?
		// -> nicht mit a == b
		// -> wie wird die equals-Methode hier verwendet?
		boolean equals = a.equals(b);
		if(equals) {
			System.out.println("passt...");
		}
	}
}
