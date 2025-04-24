package lecture20250423;

public class WrapperBeispiele {
	public static void main(String[] args) {
		Integer foo = Integer.valueOf("42");
		int bar = Integer.parseInt("42");
		
		String hexString = Integer.toHexString(42);
		System.out.println(hexString);
		
		Integer var1 = Integer.valueOf(bar);
		int var2 = foo.intValue();
	}
}
