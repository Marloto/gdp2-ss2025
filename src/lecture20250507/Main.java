package lecture20250507;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> myList = new SimpleLinkedList<String>();
		myList.add("Hello, World");
		myList.add("Something else");
		myList.add("Third step...");
		
		myList.remove("Something else");
		myList.remove("Third step...");
		myList.remove("Hello, World");
	}
}
