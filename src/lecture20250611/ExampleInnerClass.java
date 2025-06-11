package lecture20250611;

public class ExampleInnerClass {
	private int varA = 1;
	
	public class B {
		private int varA = 1;
		public void handle() {
			C c = new C();
			System.out.println(ExampleInnerClass.this.varA);
		}
		
		public class C {
			private int varA = 1;
			public void handle() {
				System.out.println(ExampleInnerClass.this.varA);
			}
		}
	}
	
	public void start() {
		B b = new B();
		
		//b.handle();
		Other.more(b);
	}
	
	public static void main(String[] args) {
		new ExampleInnerClass().start();
	}
}
