package lecture20250416;

class Otherthing {
	
}

class Something extends Otherthing {
	public boolean equals(Object obj) {
		if(obj instanceof Otherthing) {
			System.out.println("ist bereits otherthing");
			return true;
		}
		
		if(obj instanceof Something) {
			System.out.println("ist something");
			Something s = (Something) obj;
			
			return true;
		}
		System.out.println("ist nichts bekanntes");
		return false;
	}
}

public class Example {
	public static void main(String[] args) {
		Something s1 = new Something();
		Object s2 = "Hello, World";
		Something s3 = new Something();
		Otherthing s4 = new Otherthing();
		s1.equals(s2);
		System.out.println("---");
		s1.equals(s3);
		System.out.println("---");
		s1.equals(s4);
	}
}
