package onedimen;
import java.util.*;
public class Assignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sume=0,sumo=0;
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]%2==0)
				sume += arr[i];
			if(i%2==1)
				sumo += arr[i];
		}
		System.out.println("Sume: "+sume);
		System.out.println("Sumo: "+sumo);
		greatest(arr);
		lowest(arr);
		highfreq(arr);
		sc.close();
	}

	private static void highfreq(int[] arr) {
		int cnt=0,maxfreq=0,ele =0;
		Arrays.sort(arr);
		for(int i : arr) {
			cnt=0;
			for(int j: arr )
			{
				if(i==j)
					cnt++;
			}
			if(maxfreq<cnt) {
				maxfreq =cnt;
				ele = i;
			}
		}
		System.out.println("ELe: "+ele + " Freq: "+maxfreq);
	}

	private static void lowest(int[] arr) {
		int low = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<low)
				low = arr[i];
		}
		Arrays.sort(arr);
		System.out.println("Lowest: "+low);
		System.out.println("Lowest:"+ arr[0] );  //arr.length-1
	}

	private static void greatest(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		Arrays.sort(arr);
		System.out.println("MAx: "+max);
		System.out.println("max:"+ arr[arr.length-1] );  //arr.length-1
	}
}







