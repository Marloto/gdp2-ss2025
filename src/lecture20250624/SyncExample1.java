package lecture20250624;

class SomeExample {
	// synchronized als Schlüsselwort, welches hilft die Ausführung in
	// verteilten Threads besser zu handhaben
	// es kann an der Methode ergänzt werden - was macht es?
    public void doSomething() {
    	synchronized(this) { // this ist ein Object, Object hat wait / notify
    		System.out.println("Hello! " + Thread.currentThread().getId());
    	}
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
 
class MyRunnable implements Runnable {
    public void run() {
        while(true) {
            SyncExample1.example.doSomething();
        }
    }
}
 
public class SyncExample1 {
    static SomeExample example = new SomeExample();
    public static void main(String[] args) {
    	Object obj = new Object();
    	//obj.wait();
    	//obj.notify();
    	//obj.notifyAll();
    	
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
    }
}