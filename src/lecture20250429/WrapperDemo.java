package lecture20250429;

public class WrapperDemo {

    private static Integer wrapperMethod(Integer var) {
        System.out.println("wrapperMethod erhält: " + var);
        return var;
    }

    private static int primitiveMethod(int var) {
        System.out.println("primitiveMethod erhält: " + var);
        return var;
    }

    private static void modifyWrapper(Integer var) {
        System.out.println("modifyWrapper erhält: " + var);
        var = var + 10; // erst autounboxing um var in int zu überführen, 
        			    // dann mit 10 addieren, dann autoboxing
        System.out.println("modifyWrapper ändert Wert auf: " + var);
    }

    private static void modifyPrimitive(int var) {
        System.out.println("modifyPrimitive erhält: " + var);
        var = var + 10;
        System.out.println("modifyPrimitive ändert Wert auf: " + var);
    }
    
    public static void main(String[] args) {
        System.out.println("--- BEISPIEL 1: Grundlegende Wrapper und primitive Typen ---");
        // Variable mit Wrapper-Typ
        Integer wrappedValue1 = Integer.valueOf(42);
        System.out.println("wrappedValue1: " + wrappedValue1);
        
        // Primitive Variable
        int primitiveValue1 = 100;
        System.out.println("primitiveValue1: " + primitiveValue1);
        
        System.out.println("\n--- BEISPIEL 2: Autoboxing (primitiv → Wrapper) ---");
        // TODO: Was passiert hier?
        Integer wrappedValue2 = primitiveValue1; // autoboxing, sowas wie Integer.valueOf(primitiveValue1)
        System.out.println("wrappedValue2: " + wrappedValue2);
        
        System.out.println("\n--- BEISPIEL 3: Autounboxing (Wrapper → primitiv) ---");
        // TODO: Was passiert hier?
        int primitiveValue2 = wrappedValue1; // autounboxing, sowas wie wrappedValue1.intValue()
        System.out.println("primitiveValue2: " + primitiveValue2 + " (Typ: primitiver int)");
        
        System.out.println("\n--- BEISPIEL 4: Methodenaufrufe mit Autoboxing/Autounboxing ---");
        // TODO: Was passiert hier?
        Integer arg1 = primitiveValue1;
        Integer result1 = wrapperMethod(arg1); // autoboxing bevor es als argument übergeben wird
        System.out.println("Ergebnis wrapperMethod: " + result1);
        if(arg1 == result1) {
        	System.out.println("ist identisch, da nur die kopien der referenzen weiter gegeben werden");
        }
        
        // TODO: Was passiert hier?
        int result2 = primitiveMethod(wrappedValue1); // autounboxing, bevor es als argument übergeben wird, hier werden nur kopieren zurückgegeben
        System.out.println("Ergebnis primitiveMethod: " + result2);
        
        System.out.println("\n--- BEISPIEL 5: Methodenaufrufe mit Objektreferenzen (Call by Value) ---");
        // TODO: Was passiert hier?
        Integer wrapperValue = 200;
        int primitiveValue = 200;
        
        System.out.println("Vor Methodenaufruf - wrapperValue: " + wrapperValue);
        // TODO: Was passiert hier?
        modifyWrapper(wrapperValue);
        System.out.println("Nach Methodenaufruf - wrapperValue: " + wrapperValue); // immernoch 200 nach Ausführung
        
        System.out.println("\nVor Methodenaufruf - primitiveValue: " + primitiveValue);
        // TODO: Was passiert hier?
        modifyPrimitive(primitiveValue);
        System.out.println("Nach Methodenaufruf - primitiveValue: " + primitiveValue); // immernoch 200, da copy-by-value bei primitiven Datentypen
        
        System.out.println("\n--- BEISPIEL 6: Wrapper-Pool und Objektidentität ---");
        // TODO: Was passiert hier?
        Integer a = 127;
        Integer b = 127;
        System.out.println("a == b (für 127): " + (a == b));
        
        // TODO: Was passiert hier?
        Integer c = 128;
        Integer d = 128;
        System.out.println("c == d (für 128): " + (c == d));
        System.out.println("c.equals(d): " + c.equals(d));
    }
}