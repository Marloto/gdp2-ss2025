package lecture20250319;
import java.util.Scanner;

class Variablen {
	
	public static void main(String[] args) {
		int a = 0;
		double b = 1.374664783;
		String c = "Hello, World!";
		
		System.out.println(c);
		
		System.out.println("Wert: " + a); // kombiniert Strings (mit anderen Datentypen) und Strings
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Gib was ein: ");
		int d = scanner.nextInt();
		System.out.print("Gib eine weitere Zahl ein: ");
		int e = scanner.nextInt();
		System.out.println("Wert der Eingabe: " + d + " / " + e);
	}
}
