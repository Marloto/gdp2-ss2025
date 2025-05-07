package lecture20250507;

interface Keyable<X> {
	X getKey();
}

class SomeValue<T> {
	private T value;
	
	public SomeValue(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}
}

public class KeyValue<K, V> extends SomeValue<V> implements Keyable<K> {
	private K key;
	
	public KeyValue(K key, V value) {
		super(value);
		this.key = key;
	}

	public K getKey() {
		return key;
	}
	
	public <T> T doSomething(T org) {
		return org;
	}
	
	public static void main(String[] args) {
		KeyValue<Integer, String> something = new KeyValue<>(42, "Hello, World!");
	}
}
