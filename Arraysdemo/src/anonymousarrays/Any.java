package anonymousarrays;
import java.util.Arrays;
public class Any {
	public static void main(String[] args) {	
		gretest(new int[] {4,6,23,8,46});
	}
	private static void gretest(int[] arr) {
	Arrays.sort(arr);
	System.out.println("max: "+arr[arr.length-1]);
	}
}
