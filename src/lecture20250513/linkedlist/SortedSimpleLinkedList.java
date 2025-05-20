package lecture20250513.linkedlist;

import java.util.Comparator;

// Disclaimer: Es ist eigentlich nicht sauber das List-Interface zu verwenden und die
//             Liste sortierbar zu gestalten!
public class SortedSimpleLinkedList<K extends Comparable<K>> extends SimpleLinkedList<K> {
	
	private Comparator<K> comp;

	public SortedSimpleLinkedList() {
	}
	
	public SortedSimpleLinkedList(Comparator<K> comp) {
		this.comp = comp;
	}
	
	// Wie kann man Comparable / Comparator korrekt mit einer LinkedList kombinieren?
	// start von vorne
	// values vergleichen
	// wenn nicht einsortierbar, dann weiter
	// was ist das "einsortieren"-Kriterium
	// -> was gibt cur.compareTo(other)
	// -> int, negativ und positiv, wenn 0 dann gleich
	// -> wenn 1 zurück kommt, wenn -1 dann weitersuchen
	// Take-Away: Schnittstellen korrekt kennen und überlegen, wie diese miteinander verwendet werden könnte
	
	// this <  other -> -1
	// this == other -> 0
	// this >  other -> +1
	public boolean add(K value) {
		Element<K> newElement = new Element<>(value);
		
		// Sonderfall: Liste leer
		if(first == null && last == null) {
			first = newElement;
			last = first;
			return true;
		}
		
		// Sonderfall: Erstes Element
		Element<K> cur = first;
		if(compareValues(cur, newElement) >= 0) {
			newElement.setNext(cur);
			cur.setPrevious(newElement);
			if(newElement.getNext() != null) {
				newElement.getNext().setPrevious(newElement);
			}
			first = newElement;
			return true;
		}
		
		while(cur != null) {
			Element<K> next = cur.getNext();
			// Sonderfall: Letztes Element
			if(next == null) {
				cur.setNext(newElement);
				newElement.setPrevious(cur);
				last = newElement;
				break;
			}
			// Element in der Reihe
			if(compareValues(next, newElement) >= 0) {
				newElement.setPrevious(cur);
				newElement.setNext(cur.getNext());
				cur.setNext(newElement);
				if(newElement.getNext() != null) {
					newElement.getNext().setPrevious(newElement);
				}
				break;
			}
			
			cur = next;
		}
		
		size ++;
		return true;
	}

	private int compareValues(Element<K> a, Element<K> b) {
		if(comp != null) {
			return this.comp.compare(a.getValue(), b.getValue());
		}
		return a.getValue().compareTo(b.getValue());
	}
	
	public static void main(String[] args) {
		SortedSimpleLinkedList<String> list = new SortedSimpleLinkedList<>();
		
		list.add("C");
		list.add("A");
		list.add("E");
		list.add("D");
		list.add("B");
		
		for (String string : list) {
			System.out.println(string);
		}
	}

}
