package lecture20250624;

public class ExampleWaitNotify {
	private boolean condition;
	
	class Thread1 extends Thread {
		public void run() {
			while(!condition) {
				System.out.println("condition false");
				
				
				synchronized (ExampleWaitNotify.this) {
					try {
						System.out.println("start wait ...");
						ExampleWaitNotify.this.wait(); // <- warten an der stelle, geben aber sync frei
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
			System.out.println("condition true");
		}
	}
	class Thread2 extends Thread {

		public void run() {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (ExampleWaitNotify.this) { // <- startet und darf in den block
				System.out.println("start sleep ...");
				try {
					Thread.sleep(10000); // <- würde hier lange warten
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("set condition ...");
				condition = true; // <- bedingung ändert sich...
				System.out.println("notify ...");
				ExampleWaitNotify.this.notify(); // <- informiert einen "wait" threads (zufällig), dass sie weitermachen können
				System.out.println("...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("finally finished ...");
			}
		}
	}
	
	public void doSomething() {
		new Thread1().start();
		new Thread2().start();
	}
	
	public static void main(String[] args) {
		new ExampleWaitNotify().doSomething();
	}
}
