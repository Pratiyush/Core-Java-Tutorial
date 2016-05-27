package demo.enhanced.normalforloop;

public class NormalForLoop {
	
	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4,5};
		for (int i=0; i<array.length; i++) {
			System.out.printf("Element at index %d = %d\n", i,array[i]);
		}
	}
}
