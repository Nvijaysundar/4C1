package forloop;
import java.util.*;
public class FibinociiSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1=0,n2=1,n3=0;
		if(n==1)
		{
			System.out.println("Nth element: "+n1);
		}
		else if(n==2)
		{
			System.out.println("Nth element: "+n2);
		}
		else
		{
			for(int i=3;i<=n;i++)
			{
				n3=n1+n2;
				n1=n2;
				n2=n3;
			}
			System.out.println("Nth element: "+n3);
		}		
		sc.close();
	}
}
