package p2;
import java.util.*;
import p1.*;
public class Charlie {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);)
		{
			System.out.println("Enter Name: ");
			String n  = sc.nextLine();
			System.out.println("Enter Rollno");
			long r = sc.nextLong();
			int sub,sum = 0,fcount=0;
			for(int i=1;i<=6;i++)
			{
				System.out.println("Enter Sub"+i+" Marks:");
				sub = sc.nextInt();
				sum += sub;
				if(sub<40)
					fcount++;
			}
			Student st = new Student(n,r);
			Marks m = new Marks(sum,fcount);
			st.getData();
			m.getResult();
			st = null; m = null;
		}
	}
}
