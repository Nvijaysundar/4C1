package p1;
import java.util.*;
public class InpOut {
	Employee E;
	Address ad;
	public void Input()
	{
		try(Scanner sc = new Scanner(System.in);)
		{
			System.out.println("Enter Name");
			String N = sc.nextLine();
			System.out.println("ENter Desg");
			String De = sc.nextLine();
			System.out.println("Enter Bsal");
			float bs = Float.parseFloat(sc.nextLine());
			System.out.println("Enter Hno");
			String hn = sc.nextLine();
			System.out.println("Enter Stname");
			String stn = sc.nextLine();
			System.out.println("Enter City");
			String ci = sc.nextLine();
			System.out.println("Enter Pincode");
			int pin = Integer.parseInt(sc.nextLine());
			E = new Employee(N, De, bs);
			ad = new Address(hn, stn, ci, pin);
		}
	}
	
	public void Output()
	{
		E.getData();
		ad.getData();
	}
}
