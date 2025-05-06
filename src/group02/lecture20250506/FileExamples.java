package group02.lecture20250506;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExamples {
	public static void main(String[] args) {
		// Generics + Collections für die Verwaltung von AudioFiles
		// zzgl. Verwendung von IO-Klassen
		
		String pathname = "test.m3u";
		
		// Variante zum schreiben
		FileWriter writer = null;
		try {
			writer = new FileWriter(pathname);
			writer.write("test-abc");
			writer.write("test-abc");
			writer.write("test-abc");
			writer.write("test-abc");
			// aufgabe eine iteration über alle playlist-einträge
		} catch (IOException e) {
			throw new RuntimeException("Unable to write file " + pathname + "!");
		} finally {
			try {
				if(writer != null) {					
					writer.close();
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		// Variante mit try-catch-ressource
		try(FileWriter writer2 = new FileWriter(pathname)) {
			// ... für die aufgabe
			writer2.write("test-abc");
			writer2.write("test-abc");
			writer2.write("test-abc");
			writer2.write("test-abc");
		} catch (IOException e) {
			throw new RuntimeException("Unable to write file " + pathname + "!");
		}

		// Variante zum lesen
		Scanner scanner = null;
		try {
			FileReader reader = new FileReader(pathname);
			scanner = new Scanner(reader);
			String nextLine = scanner.nextLine();
			System.out.println("ausgabe: " + nextLine);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(scanner != null) {				
				scanner.close();
			}
		}
		
		// Variante mit try-catch-ressource
		try(Scanner scanner2 = new Scanner(new FileReader(pathname))) {
			String nextLine = scanner2.nextLine();
			System.out.println("ausgabe: " + nextLine);
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}
}
