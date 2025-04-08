package lecture20250402;

import java.util.Arrays;

public class StringExample {
	public static void main(String[] args) {
		String myStr = "Blablabla, World!";
		
		int length = myStr.length();
		// Zeichenketten sind nicht veränderlich, bedeutet alle Methoden haben keine
		// Auswirkung auf den String auf den sie angewendet werden
		// -> das Objekt was in myStr referenziert wird, wird nicht verändert
		String myOtherStr = myStr.replace("World", "Ich"); 
		
		System.out.println(myStr);
		System.out.println(myOtherStr);
		
		int indexOf = myStr.indexOf(',');
		System.out.println(indexOf);
		String myThirdStr = myStr.substring(0, indexOf);
		System.out.println(myThirdStr);
		
		String[] split = myStr.split(",");
		System.out.println(Arrays.toString(split));
		
		for(int i = 0; i < myStr.length(); i ++) {
			char charAt = myStr.charAt(i);
			
			// ist es ein Groß-Buchstabe od. Kleinbuchstabe?
			if(charAt >= 'a' && charAt <= 'z') {
			}
			
			System.out.print(charAt + " - ");
		}
		System.out.println();
		
		
		String moreStr = new String();
		// StringBuilder -> ansatz für optimiertes "zusammensetzen" von Strings
	}
}
