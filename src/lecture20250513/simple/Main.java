package lecture20250513.simple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

class SomeIterator implements Iterator<Integer> {
	private int counter;
	private int max;
	private int step;
	
	public SomeIterator(int min, int max, int step) {
		this.counter = min;
		this.max = max;
		this.step = step;
	}

	public boolean hasNext() {
		return counter <= max;
	}

	public Integer next() {
		int cur = counter;
		counter += step;
		return cur; // verändern des zählers / zustand
	}
	
}

class Range implements Iterable<Integer> {
	private int min;
	private int max;
	private int step;
	public Range(int min, int max, int step) {
		super();
		this.min = min;
		this.max = max;
		this.step = step;
	}
	public Iterator<Integer> iterator() {
		return new SomeIterator(min, max, step);
	}
}

public class Main {
	public static void main(String[] args) {
		for(Integer obj : new Range(0, 5, 2)) {
			System.out.println(obj);
		}
		for(Integer obj : new Range(0, 5, 2)) {
			System.out.println(obj);
		}
		
//		SomeIterator someIterator = new SomeIterator(1, 10);
//		while(someIterator.hasNext()) {
//			Integer cur = someIterator.next();
//			System.out.println(cur);
//		}
		
//		System.out.println(someIterator.next());
//		System.out.println(someIterator.next());
//		System.out.println(someIterator.next());
//		System.out.println(someIterator.next());
//		System.out.println(someIterator.next());
//		System.out.println(someIterator.next());
//		System.out.println(someIterator.next());
//		System.out.println(someIterator.next());
//		System.out.println(someIterator.next());
//		System.out.println(someIterator.next());
		
		
		
		
//		int i = 1;
//		while(i < 10) {
//			int cur = i;
//			System.out.println(cur);
//			i ++;
//		}
//		
		
		
		List<String> list = new ArrayList<String>();
		
		for(String element : list) { // alles hinter dem Doppelpunkt muss Iterable Impl.
			// zusätzlich ist ein Iterator notwendig, der die "Abarbeitung" beschreibt
			System.out.println(element);
		}
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "abc");
		map.put("2", "xyz");
		Collection<String> keySet = map.keySet();
		Collection<String> values = map.values();
		Set<Entry<String, String>> entrySet = map.entrySet();
		for(Entry<String, String> el : entrySet) { // welche schnittstelle muss eine Klasse impl. damit es hier geht?
			String key = el.getKey();
			String value = el.getValue();
		}
		
		for(String key : keySet) {
			String value = map.get(key);
			
		}
	}
}
