package lecture20250604.sub;

public class AnonymeKlasse {
	public static void main(String[] args) {
		Object o = new Object() {
			public void someFancyMethod() {
				
			}
			
			public String toString() {
				this.someFancyMethod();
				return super.toString();
			}
		};
	}
}
