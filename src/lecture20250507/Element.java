package lecture20250507;

public class Element<T> {
	private final T value;
	private Element<T> next;
	private Element<T> previous;

	public Element(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}
	
	public Element<T> getNext() {
		return next;
	}
	
	public void setNext(Element<T> next) {
		this.next = next;
	}
	
	public Element<T> getPrevious() {
		return previous;
	}
	
	public void setPrevious(Element<T> previous) {
		this.previous = previous;
	}
}
