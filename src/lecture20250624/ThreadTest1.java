package lecture20250624;

public class ThreadTest1 {
    public static void main(String args[]) {
        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        };
        new Thread(r).start();
        new Thread(r).start();
    }
}
