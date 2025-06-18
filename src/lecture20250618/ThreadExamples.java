package lecture20250618;

public class ThreadExamples {
	
	static class ExampleThread extends Thread {
		
		public void run() {
			int i = 0;
			while(true) {
				i ++;
				System.out.println(i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static class ExampleRunnable implements Runnable {
		public void run() {
			int i = 0;
			while(true) {
				i ++;
				System.out.println(i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
//		new Thread(() -> {
//			int i = 0;
//			while(true) {
//				i ++;
//				System.out.println(i);
//			}
//		}).start();
		
		// -> OS Threads, Green Threads
		new Thread(new ExampleRunnable()).start();
		System.out.println("main... finished");
	}
}
