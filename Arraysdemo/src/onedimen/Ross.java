package onedimen;
import java.util.*;
public class Ross {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int sum =0,sum2=0;
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<size;i++)
			sum+=arr[i];
		for(int k : arr)
		{
			sum2+=k;
		}
		System.out.println(sum2);
	}

}
