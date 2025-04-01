package lecture20250401;

public class Visibilities2 {
	public static void main(String[] args) {
		// Sichtbarkeit aus dieser Perspektive
		// -> public bedeutet ich darf es
		Visibilities v = new Visibilities();
		System.out.println(v.a);
		v.doSomething();
		// System.out.println(v.b); <- geht nicht weil private
	}
}
