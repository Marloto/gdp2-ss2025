package lecture20250527;

import java.util.ArrayList;
import java.util.List;

public class MitarbeiterListe {
    private List<Mitarbeiter> mitarbeiter;
    
    public MitarbeiterListe() {
        this.mitarbeiter = new ArrayList<Mitarbeiter>();
    }
    
    // Mitarbeiter hinzufügen
    public void mitarbeiterHinzufuegen(Mitarbeiter mitarbeiter) {
        if (mitarbeiter == null) {
            return;
        }
        
        this.mitarbeiter.add(mitarbeiter);
        return;
    }
    
    // Mitarbeiter entfernen
    public boolean mitarbeiterEntfernen(Mitarbeiter mitarbeiter) {
        return this.mitarbeiter.remove(mitarbeiter);
    }
    
    // Alle Mitarbeiter abrufen
    public List<Mitarbeiter> getAlleMitarbeiter() {
        return new ArrayList<Mitarbeiter>(mitarbeiter); // Kopie zurückgeben
    }
    
    // Anzahl Mitarbeiter
    public int getAnzahl() {
        return mitarbeiter.size();
    }
    
    // Mitarbeiter nach Abteilung filtern
    public List<Mitarbeiter> getMitarbeiterNachAbteilung(String abteilung) {
        List<Mitarbeiter> gefiltert = new ArrayList<Mitarbeiter>();
        for (Mitarbeiter m : mitarbeiter) {
            if (m.getAbteilung().equals(abteilung)) {
                gefiltert.add(m);
            }
        }
        return gefiltert;
    }
    
    // Alle Abteilungen ermitteln
    public List<String> getAlleAbteilungen() {
        List<String> abteilungen = new ArrayList<String>();
        for (Mitarbeiter m : mitarbeiter) {
            if (!abteilungen.contains(m.getAbteilung())) {
                abteilungen.add(m.getAbteilung());
            }
        }
        return abteilungen;
    }
}