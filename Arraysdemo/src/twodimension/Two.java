package twodimension;
import java.util.*;
public class Two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new 
			int[Integer.parseInt(sc.nextLine())]
					[Integer.parseInt(sc.nextLine())];
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j] = sc.nextInt();
		for(int[] temp : arr) {
			for(int k : temp)
				System.out.print(k + " ");
			System.out.println();
		}
		sc.close();
	}
}
