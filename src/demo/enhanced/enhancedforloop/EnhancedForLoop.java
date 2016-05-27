package demo.enhanced.enhancedforloop;

public class EnhancedForLoop {
	public static void main(String[] args) {
		int[] array = new int[]{0,1,2,3,4};
		int index=0;
		for (int element : array) {
			System.out.printf("Element at index %d = %d\n", index++,element);
		}
	}
}
