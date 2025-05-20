package lecture20250514;

import java.io.File;
import java.util.Scanner;

/**
 * Beispiel: https://pastie.io/euqstx.java
 * Wie mit Exceptions in Java gearbeitet werden kann?
 * - throw - mit einem Objekt von einer Exception-Klasse verwendet, üblicherweise z.B. throws new Exception(...)
 * - throws - wird an Methodensignatur ergänzt, definiert Exceptions die in der 
 *            Methode auftreten können, kann bei checked verwendet werden
 * - try - "Sicherer Block" in dem Fehler auftreten können
 * - catch - Behandlung von Fehlern
 * - finally - Wird abschließend ausgeführt (bei Exception und wenn es geklappt hat, also try erfolgreich ausgeführt wurde)
 */

class SomeNumberException extends Exception {
	public SomeNumberException(String message) {
		super(message);
	}
}

class SomeErrors {
    public void doSomething(int i) throws SomeNumberException {
        if (i < 10) {
            SomeNumberException someNumberException = new SomeNumberException("i muss größer oder gleich 10 sein");
            
			throw someNumberException;
        }
    }
}


public class MoreErrors extends SomeErrors {
    public MoreErrors() throws SomeNumberException {
		super.doSomething(9);
    }
 
    public void doSomething(int i) {
        System.out.println("Hello, World!");
    }
 
    public static void main(String[] args) {
    	try {    		
    		MoreErrors errors = new MoreErrors();
    		System.out.println("... nach dem fehler ...");
    		errors.doSomething(0);
    	} catch(SomeNumberException | IllegalArgumentException e) {
    		e.printStackTrace();
    	} catch(Exception e) {
    		//System.out.println(e.getClass().getSimpleName());
    		//System.out.println(e.getMessage());
    		e.printStackTrace();
    		
    		// Frage: darf er eine Exception werfen?
    		//throw new Exception("Other Name", e);
    	} finally {
    		System.out.println("... abschluss ...");
    	}
    	
    	try {
	        SomeErrors errors2 = new SomeErrors();
	        errors2.doSomething(0);
	    } catch(Exception e) {
	    	
	    }
    	
    	
    	Scanner scanner = null;
    	try {
    		scanner = new Scanner(new File("abc"));
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {    		
    		if(scanner != null) {    			
    			scanner.close();
    		}
    	}
    	
    	try(Scanner scanner2 = new Scanner(new File("abc"))) {
    		// ...
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	
    	
    	
    }
}