package jaggedarrays;
public class Jagged {
	public static void main(String[] args) {
		int[] arr  = {434,456,345};
		int[] arr2 = {4,56, 56,4435};
		
		int[][] arr3 = {arr,arr2};
		
		for(int[] temp: arr3) {
			for(int k : temp)
				System.out.print(k + " ");
			System.out.println();
		}

	}

}
