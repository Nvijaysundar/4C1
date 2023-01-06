package p1;
import java.util.*;
public class Chalk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=4 && n<=666)
		System.out.println("Days:"+(n+(int)Math.sqrt(n)+1));
		else
			System.out.println("Invalid Input");
		sc.close();
	}
}
