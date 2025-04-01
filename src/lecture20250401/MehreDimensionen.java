package lecture20250401;

public class MehreDimensionen {
	public static void main(String[] args) {
//		int[][] arr = new int[3][3];
//		
//		int[] var1 = arr[0];
//		int[] var2 = arr[0];
//		int[] var3 = arr[0];
//		
//		var1[0] = 42;
//		
//		
//		System.out.println(var1[0]); // <- 42 vermutlich
//		System.out.println(arr[0][0]);// <- ebenfalls 42
		int[][][] arr = new int[3][3][3];
		
		int[][] var1 = arr[0];
		int[][] var2 = arr[1];
		int[][] var3 = arr[2];
		
		int[] var1_1 = var1[0];
		
		var1_1[0] = 42;
		// arr[0][0][0] = 42;
		
		
		System.out.println(var1_1[0]); // <- 42 vermutlich
		System.out.println(var1[0][0]);// <- ebenfalls 42
		System.out.println(arr[0][0][0]);// <- ebenfalls 42
	}
}
