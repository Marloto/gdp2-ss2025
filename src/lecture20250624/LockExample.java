package lecture20250624;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
	public static void main(String[] args) {
		// Weitere Möglichkeit, wie Threads sich abgleichen können
		// funktioniert ohne Synchronized.
		Lock lock = new ReentrantLock();
		lock.lock();
		
		lock.tryLock();
	}
}
