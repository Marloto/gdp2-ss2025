package lecture20250624;

public class ThreadTest3 extends Thread {
	private int i;

	public void run() {
		for (i = 0; i < 10000000; i++) {
			System.out.println(Thread.currentThread().getId() + ": " + i);
		}
	}

	public static void main(String args[]) {
		new ThreadTest3().start();
		new ThreadTest3().start();
	}
}
