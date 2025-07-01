package lecture20250624;

import java.util.HashMap;
import java.util.Map;

class Data {
	private int value;
	public Data(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}

public class DataCache {
    private volatile boolean loaded = false;
    private Map<String, Data> cache = new HashMap<>();
    
    public Data getData(String key) {
    	// ToDo: Was ist das Problem?
        synchronized (this) {
            if (!loaded) {
                loadFromDatabase();
                loaded = true;
            }
        }
        return cache.get(key);
    }

	private void loadFromDatabase() {
		cache.put("1", new Data(1));
		cache.put("2", new Data(2));
		cache.put("3", new Data(3));
		cache.put("4", new Data(4));
	}
	
	public static void main(String[] args) {
		Thread[] threads = new Thread[10];
		
		DataCache cache = new DataCache();
		
		for(int i = 0; i < threads.length; i ++) {
			threads[i] = new Thread(() -> {
				Data d = cache.getData("1");
				System.out.println(d);
			});
		}
		
		for(int i = 0; i < threads.length; i ++) {
			threads[i].start();
		}
	}
}