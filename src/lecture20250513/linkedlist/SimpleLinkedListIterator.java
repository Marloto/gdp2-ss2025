package lecture20250513.linkedlist;

import java.util.Iterator;

public class SimpleLinkedListIterator<T> 
		implements Iterator<T> {
	
	private Element<T> cur;

	public SimpleLinkedListIterator(Element<T> start) {
		this.cur = start;
	}

	public boolean hasNext() {
		return cur != null;
	}

	public T next() {
		T curValue = this.cur.getValue();
		this.cur = this.cur.getNext();
		return curValue;
	}

	
	// Erstes Element im Konst. übergeben
	// -> jedes mal wenn next aufgerufen wird
	//    das zurück geben
	// -> next verschiebt dann über getNext()
}
