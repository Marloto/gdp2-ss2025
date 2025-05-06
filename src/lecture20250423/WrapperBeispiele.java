package lecture20250423;

public class WrapperBeispiele {
	public static void main(String[] args) {
		Integer foo = Integer.valueOf("42");
		int bar = Integer.parseInt("42");
		
		String hexString = Integer.toHexString(42);
		System.out.println(hexString);
		
		Integer var1 = Integer.valueOf(bar);
		int var2 = foo.intValue();
		
		int[] list1 = new int[] {1, 2, 3, 4, 128};
		Integer[] list2 = new Integer[list1.length];
		for(int i = 0; i < list1.length; i ++) {
		    list2[i] = list1[i];
		}
		
		// Integer-Instanz mit einer Integer-Instanz
		if(list2[0] == Integer.valueOf(list1[0])) {
		    System.out.println("Test 1 ok");
		}
		
		if(list2[4] == Integer.valueOf(list1[4])) {
		    System.out.println("Test 2 ok");
		}
	}
}
