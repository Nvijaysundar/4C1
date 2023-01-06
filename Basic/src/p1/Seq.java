package p1;
import java.util.*;
public class Seq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
			if(i%2==0)
				System.out.println((i*i)-2);
			else
				System.out.println((i*i)-1);
		sc.close();
	}

}
