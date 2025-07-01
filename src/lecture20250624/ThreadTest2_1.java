package lecture20250624;

public class ThreadTest2_1 {
	private static int i;

	public static void main(String args[]) {
		Runnable r = () -> {
			// wie könnte man "sauberer" iterieren?
//			synchronized (ThreadTest2_1.class) {				
//				for (i = 0; i < 100; i++) {
//					System.out.println(Thread.currentThread().getId() + ": " + i);
//				}
//			}
//			i = 0;
//			while (true) {
//				synchronized (ThreadTest2_1.class) {
//					if(i < 100) {						
//						System.out.println(Thread.currentThread().getId() + ": " + i);
//						i++;
//					} else {
//						break;
//					}
//				}
//			}
			i = 0;
			while (i < 100) {
				synchronized (ThreadTest2_1.class) {
					if(i < 100) {						
						System.out.println(Thread.currentThread().getId() + ": " + i);
						i++;
					}
				}
			}
		};
		new Thread(r).start();
		new Thread(r).start();
	}
}