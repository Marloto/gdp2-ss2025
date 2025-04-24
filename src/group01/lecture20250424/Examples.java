package group01.lecture20250424;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

// Dieses Beispiel benötigt die Libs im Praktikum sowie Ihre AudioFile-Klasse - dient
// daher nur als Skript-Beispiel, folgende Klassen AudioFile und TagReader entfernen die angezeigten Fehler
class AudioFile {
	private String path;
	public AudioFile(String path) {
		this.path = path;
	}
	public String getPathname() {
		return path;
	}
}

// Diese Klasse nicht kopieren, die richtige aus den Libs verwenden!
class TagReader {
	public static Map<String, Object> readTags(String pathname) {
		return new HashMap<String, Object>();
	}
}

public class Examples {
	public static void main(String[] args) {
		AudioFile file = new AudioFile("audiofiles\\Rock 812.mp3");
		System.out.println(file.getPathname());
		
		// Teil a) Hinweise zur Exception
		// Sinnvoll in den Konstruktor packen
		File f = new File(file.getPathname());
		boolean readable = f.canRead();
		if(!readable) {
			// Exceptions für Ausnahmen
			// aktuell erst einmal so übernehmen, details dazu in Kap. 7
			throw new RuntimeException("Datei soundso... existiert nicht");
		}
		
		// Teil b) Hinweise zur Map
		// eine Map ist eine Key-Value-Datenstruktur, z.B. titel = Rock 812
		// aktuell z.B. "<String, Object>" erst einmal mitnehmen
		// -> Kap. 6 für mehr details
		Map<String, Object> tagMap = TagReader.readTags(file.getPathname());
		
		// keySet gibt eine Liste bzw. Menge
		// aller Schlüssel / Keys in der Datenstruktur
		for (String tag : tagMap.keySet()) {
			// get liefert den Wert zu einem Schlüssel / Key
			Object value = tagMap.get(tag);
			
			System.out.printf("key: %-25s value: %-30s (type: %s)\n",
					tag, value, value.getClass().getSimpleName());
		}
		// In der Datenstruktur sind niemals primitive Datentypen, nur Objekte die
		// sich auf Object substituieren lassen (bzw. in der Vererbungsstruktur stehen)
		Object title = tagMap.get("title");
		// es könnte "" od. null sein, "instanceof"
		// -> wenn alles passt können wir das in den Attributen verwenden
		Object duration = tagMap.get("duration");
		// es könnte null sein, und wir müssen prüfen ob es ein Long ist
		// -> wenn es so ist einfach casten
		// long curDuration = ((Long) duration).longValue();
		long curDuration = (Long) duration;
	}
}
