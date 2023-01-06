package p1;
import java.util.*;
public class Seq2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),k=-2,d=2;
		for(int i=1;i<=n;i++)
		{
			if(i==1)
				System.out.println(k);
			else
			{
				k += d;
				System.out.println(k);
				if(i%2==1)
					d+=4;
			}
		}
		sc.close();
	}

}
