package lecture20250401;

public class ArrayBeispiele {
	public static void main(String[] args) {
		int[] var1;
		var1 = new int[3];
		var1[0] = 1;
		var1[1] = 2;
		var1[2] = 42;
		
		// wie kann ich den wert eines einzelnen feldes ausgeben 
		System.out.println(var1[2]);
		int a = var1[2];
		System.out.println(a);
		System.out.println("---");
		
		// wie kann ich alle felder ausgeben
		// for-each-loop -> for(<datentyp> <name> : <array-variable>) {...}
		for(int b : var1) {
			System.out.println(b);
			b = 42; // hat keine auswirkung auf das array, 
			        // copy-by-value in b, wert aus dem Array übernommen
		}
		System.out.println("---");
		// länge über .length am Array verfügbar
		for(int i = 0; i < var1.length; i ++) {
			System.out.println(var1[i]);
			var1[i] += 1;
		}
		System.out.println("---");
		// Größe nicht veränderbar, nur neu erzeugen geht
		int[] tmp = new int[5];
		for(int i = 0; i < var1.length; i ++) {
			tmp[i] = var1[i];
		}
		var1 = tmp;
		System.out.println("---");
		for(int i = 0; i < var1.length; i ++) {
			System.out.println(var1[i]);
		}
	}
}
