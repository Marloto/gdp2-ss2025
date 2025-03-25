package lecture20250319;

class Funktionen {
	static int something(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static void main(String[] args) {
		int d = something(1, 2);
		
		System.out.println("Ergebnis: " + d);
	}
}
