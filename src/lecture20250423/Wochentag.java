package lecture20250423;

/**
 * Diese Klasse definiert Konstanten für die verschiedenen Wochentage.
 * Die Konstanten verwenden alle den Datentyp int.
 */
public class Wochentag {
    // Die Wochentage als int-Konstanten
    public static final int MONTAG = 1;
    public static final int DIENSTAG = 2;
    public static final int MITTWOCH = 3;
    public static final int DONNERSTAG = 4;
    public static final int FREITAG = 5;
    public static final int SAMSTAG = 6;
    public static final int SONNTAG = 7;
    
    private final int tag;
    
    public Wochentag(int tag) {
        if(getName(tag) != null) {
            this.tag = tag;
        } else {
            this.tag = MONTAG; // Fehlerbehandlung mit Exception zukünftig
        }
    }
    
    public int getTag() {
        return this.tag;
    }
    
    public String getName() {
        return getName(this.tag);
    }
    
    /**
     * Gibt den Namen des Wochentags zurück
     * @param tag Der Wochentag als int
     * @return Name des Wochentags oder null bei ungültigem Wert
     */
    public static String getName(int tag) {
        switch (tag) {
            case MONTAG: return "Montag";
            case DIENSTAG: return "Dienstag";
            case MITTWOCH: return "Mittwoch";
            case DONNERSTAG: return "Donnerstag";
            case FREITAG: return "Freitag";
            case SAMSTAG: return "Samstag";
            case SONNTAG: return "Sonntag";
            default: return null;
        }
    }
}