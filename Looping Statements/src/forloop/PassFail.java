package forloop;
import java.util.*;
public class PassFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks,sum=0;
		boolean pass= true;
		for(int i=1;i<=6;i++)
		{
			marks=sc.nextInt();
			sum+=marks;
			if(marks<40)
			{
				pass=false;
			}
		}
		System.out.println("Percetage: "+(sum/6.0F));
		if(pass)
		{
			System.out.println("Pass");
		}
		else
		{
			System.err.println("Fail");
		}
		sc.close();
	}

}
