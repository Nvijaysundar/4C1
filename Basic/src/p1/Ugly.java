package p1;
import java.util.*;
public class Ugly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if(n==1)
			System.out.println("1");
		else
		{
			int i,c=1;
			for(i=2;c<n;i++)
			{
				if(i%2==0||i%3==0||i%5==0)
					c++;
			}
			System.out.println(i-1);
		}
		sc.close();
	}
}
