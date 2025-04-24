package lecture20250423;

import java.util.Iterator;


public class WochentagTypBeispiel {
	public static void main(String[] args) {
		
		WochentagTyp foo = WochentagTyp.MITTWOCH;
		
		System.out.println(WochentagTyp.MITTWOCH);
		System.out.println(foo.toString());
		System.out.println(foo.name());
		System.out.println(foo.ordinal());
		
		// Statische Methoden an dem Typen
		// values und valueOf
		WochentagTyp[] values = WochentagTyp.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		WochentagTyp bar = values[1]; // über ordinalzahl denkbar
		WochentagTyp bar2 = WochentagTyp.valueOf("DIENSTAG");
		
		// WochentagTyp t = new WochentagTyp();
		
		System.out.println(foo == WochentagTyp.MITTWOCH);
	}
}
