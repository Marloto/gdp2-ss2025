package lecture20250624;

public class ThreadTest2 {
	private static int i;

	public static void main(String args[]) {
		Runnable r = () -> {
			// wie könnte man "sauberer" iterieren?
			for (i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getId() + ": " + i);
			}
		};
		new Thread(r).start();
		new Thread(r).start();
	}
}