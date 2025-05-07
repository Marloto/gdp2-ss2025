package lecture20250507;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// https://t1p.de/4dpmg
public class SimpleLinkedList<K> implements List<K> {
	private Element<K> first;
	private Element<K> last;
	
	private int size;
	
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

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return first == null && last == null;
	}

	@Override
	public boolean contains(Object o) {
		return findByValue(o) != null;
	}

	@Override
	public Iterator<K> iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public boolean containsAll(Collection<?> coll) {
		for(Object element : coll) {
			if(!this.contains(element)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends K> coll) {
		boolean res = true;
		for(K element : coll) {
			res = this.add(element) && res;
		}
		return res;
	}

	@Override
	public boolean addAll(int index, Collection<? extends K> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public void clear() {
		first = null;
		last = null;
	}

	@Override
	public K get(int index) {
		return null;
	}

	@Override
	public K set(int index, K element) {
		return null;
	}

	@Override
	public void add(int index, K element) {
		
	}

	@Override
	public K remove(int index) {
		return null;
	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator<K> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<K> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<K> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
