package lecture20250513.linkedlist;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// https://t1p.de/4dpmg
public class SimpleLinkedList<K> implements List<K> {
	protected Element<K> first;
	protected Element<K> last;
	
	protected int size;
	
	public boolean add(K value) {
		Element<K> newElement = new Element<>(value);
		if(first == null && last == null) {
			first = newElement;
			last = first;
		} else {			
			last.setNext(newElement);
			newElement.setPrevious(last);
			last = newElement;
		}
		size ++;
		return true;
	}
	
	// Durchgehen durch die Liste, wo steckt der Value
	private Element<K> findByValue(Object value) {
		Element<K> cur = first;
		while(cur != null) {
			// prüfen ob der wert vorhanden ist
			if(cur.getValue().equals(value)) {
				return cur;
			}
			// nächstes element
			cur = cur.getNext();
		}
		return null;
	}
	
	// Durchgehen durch die Liste, wo steckt der Value
	private Element<K> findByIndex(int index) {
		// Prüfen auf ungültigen Index
	    if (index < 0) {
	        return null;
	    }
	    
	    Element<K> cur = first;
	    int currentIndex = 0;
	    
	    while(cur != null) {
	        // Prüfen ob der aktuelle Index erreicht ist
	        if(currentIndex == index) {
	            return cur;
	        }
	        // Zum nächsten Element und Index erhöhen
	        cur = cur.getNext();
	        currentIndex++;
	    }
	    
	    // Index zu groß für die Liste
	    return null;
	}

	// Was muss hier passieren?
	public boolean remove(Object value) {
		Element<K> element = findByValue(value);
		if(element == null) {
			return false;
		}
		
		Element<K> previous = element.getPrevious();
		Element<K> next = element.getNext();
		
		// first od. last werden entfernt
		if(previous != null) {			
			previous.setNext(next);
		} else {
			first = next;
		}
		if(next != null) {			
			next.setPrevious(previous);
		} else {
			last = previous;
		}
		size --;
		return true;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return first == null && last == null;
	}

	public boolean contains(Object o) {
		return findByValue(o) != null;
	}
	
	
	

	public Iterator<K> iterator() {
		return new SimpleLinkedListIterator<K>(first);
	}
	
	
	
	
	

	public ListIterator<K> listIterator() {
		return null;
	}

	public ListIterator<K> listIterator(int index) {
		return null;
	}
	
	public void add(int index, K value) {
	    // Prüfen auf ungültigen Index
	    if (index < 0 || index > size) {
	        return;
	    }
	    
	    // Wenn am Ende einfügen, vorhandene Methode nutzen
	    if (index == size) {
	    	add(value);
	        return;
	    }
	    
	    Element<K> newElement = new Element<>(value);
	    
	    // Wenn am Anfang einfügen
	    if (index == 0) {
	        newElement.setNext(first);
	        if (first != null) {
	            first.setPrevious(newElement);
	        } else {
	            last = newElement; // Falls Liste leer war
	        }
	        first = newElement;
	    } else {
	        // Element an Position index finden
	        Element<K> current = findByIndex(index);
	        Element<K> previous = current.getPrevious();
	        
	        // Verbindungen setzen
	        newElement.setPrevious(previous);
	        newElement.setNext(current);
	        previous.setNext(newElement);
	        current.setPrevious(newElement);
	    }
	    
	    size++;
	    return;
	}

	public Object[] toArray() {
		return toArray(new Object[0]);
	}

	public <T> T[] toArray(T[] a) {
		T[] res = Arrays.copyOf(a, this.size());
		Element<K> cur = first;
		int i = 0;
		while(cur != null) {
			res[i] = (T) cur.getValue();
			cur = cur.getNext();
			i ++;
		}
		return res;
	}

	public boolean containsAll(Collection<?> coll) {
		for(Object element : coll) {
			if(!this.contains(element)) {
				return false;
			}
		}
		return true;
	}

	public boolean addAll(Collection<? extends K> coll) {
		boolean res = true;
		for(K element : coll) {
			res = this.add(element) && res;
		}
		return res;
	}

	public boolean addAll(int index, Collection<? extends K> c) {
	    int currentIndex = index;
	    boolean modified = false;
	    
	    for (K value : c) {
	        add(currentIndex++, value);
	        modified = true;
	    }
	    
	    return modified;
	}

	public boolean removeAll(Collection<?> coll) {
		boolean res = true;
		for(Object element : coll) {
			res = this.remove(element) && res;
		}
		return res;
	}

	public boolean retainAll(Collection<?> c) {
	    boolean modified = false;
	    Element<K> current = first;
	    Element<K> next;
	    
	    while (current != null) {
	        next = current.getNext(); // Speichern des nächsten Elements, bevor wir möglicherweise das aktuelle entfernen
	        
	        if (!c.contains(current.getValue())) {
	            // Element entfernen, wenn es nicht in der angegebenen Collection ist
	            remove(current.getValue());
	            modified = true;
	        }
	        
	        current = next;
	    }
	    
	    return modified;
	}

	public void clear() {
		size = 0;
		first = null;
		last = null;
	}

	public K get(int index) {
		return findByIndex(index).getValue();
	}

	public K set(int index, K element) {
	    // Element an der angegebenen Position finden
	    Element<K> target = findByIndex(index);
	    
	    // Alten Wert zwischenspeichern
	    K oldValue = target.getValue();
	    
	    // Neuen Wert setzen
	    target.setValue(element);
	    
	    // Alten Wert zurückgeben
	    return oldValue;
	}

	public K remove(int index) {
		K k = this.findByIndex(index).getValue();
		this.remove(k);
		return k;
	}

	public int indexOf(Object o) {
		Element<K> cur = first;
		int i = 0;
		while(cur != null) {
			if(cur.getValue().equals(o)) {
				return i;
			}
			cur = cur.getNext();
			i ++;
		}
		return -1;
	}

	public int lastIndexOf(Object o) {
		Element<K> cur = last;
		int i = size - 1;
		while(cur != null) {
			if(cur.getValue().equals(o)) {
				return i;
			}
			cur = cur.getPrevious();
			i --;
		}
		return -1;
	}

	public List<K> subList(int fromIndex, int toIndex) {
		List<K> subList = new SimpleLinkedList<>();
		if (fromIndex == toIndex) {
	        return subList;
	    }
	    Element<K> current = findByIndex(fromIndex);
	    for (int i = fromIndex; i < toIndex; i++) {
	        if (current == null) {
	            break;
	        }
	        subList.add(current.getValue());
	        current = current.getNext();
	    }
	    return subList;
	}
}
