package lecture20250513.linkedlist;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Neue Liste erstellen und befüllen
        SimpleLinkedList<String> list = new SimpleLinkedList<>();
        System.out.println("Leere Liste erstellt. Größe: " + list.size() + ", Leer: " + list.isEmpty());
        
        // Elemente hinzufügen
        list.add("Eins");
        list.add("Zwei");
        list.add("Drei");
        System.out.println("Drei Elemente hinzugefügt. Größe: " + list.size() + ", Leer: " + list.isEmpty());
        
        // Elemente anzeigen
//        System.out.println("Elemente der Liste:");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("Element " + i + ": " + list.get(i));
//        }
        
        for(String element : list) {
        	System.out.println(element);
        }
        
//        // Element an bestimmter Position einfügen
//        list.add(1, "Eineinhalb");
//        System.out.println("\nElement an Position 1 eingefügt. Neue Liste:");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("Element " + i + ": " + list.get(i));
//        }
//        
//        // Element ersetzen
//        String oldValue = list.set(2, "Zwei-Neu");
//        System.out.println("\nElement an Position 2 ersetzt. Alter Wert: " + oldValue);
//        System.out.println("Neue Liste:");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("Element " + i + ": " + list.get(i));
//        }
//        
//        // Element entfernen
//        boolean removed = list.remove("Eineinhalb");
//        System.out.println("\nElement 'Eineinhalb' entfernt: " + removed);
//        System.out.println("Neue Liste:");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("Element " + i + ": " + list.get(i));
//        }
//        
//        // Teiliste
//        SimpleLinkedList<String> subList = (SimpleLinkedList<String>) list.subList(1, 3);
//        System.out.println("\nTeiliste von 1 bis 3 (exklusiv):");
//        for (int i = 0; i < subList.size(); i++) {
//            System.out.println("Element " + i + ": " + subList.get(i));
//        }
//        
//        // Array-Konvertierung
//        Object[] array = list.toArray();
//        System.out.println("\nListe als Array: " + Arrays.toString(array));
//        
//        // Liste leeren
//        list.clear();
//        System.out.println("\nListe geleert. Größe: " + list.size() + ", Leer: " + list.isEmpty());
    }
}