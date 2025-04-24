package lecture20250423;

public class WochentagBeispiel {
    public static void main(String[] args) {
        // Wochentage über Konstanten erzeugen
        Wochentag montag = new Wochentag(Wochentag.MONTAG);
        Wochentag freitag = new Wochentag(Wochentag.FREITAG);
        Wochentag samstag = new Wochentag(Wochentag.SAMSTAG);
        
        // Invaliden Wert eingeben (wird zum Montag)
        Wochentag ungueltig = new Wochentag(99);  // Wird zu Montag wegen Fehlerbehandlung
        
        // Ausgabe der Wochentagsnamen
        System.out.println("Erster Arbeitstag: " + Wochentag.getName(Wochentag.MONTAG));
        System.out.println("Letzter Arbeitstag: " + freitag.getName());
    }
}