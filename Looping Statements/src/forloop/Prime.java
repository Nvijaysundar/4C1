package forloop;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min= sc.nextInt();
		int max = sc.nextInt();
		boolean flag = true;
		for(int i=min;i<=max;i++)
		{
			flag =true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag =false;
					break;
				}
			}
				if(flag)
					System.out.println("Prime: "+i);
		}
	}

}
