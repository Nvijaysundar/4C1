package p1;
import java.util.Scanner;
public class Inout {
	Address ad= null;
	Employee e = null;
	public void setData(Scanner sc)
	{
		
		System.out.println("Enter New Employee Details:");
		String Name = sc.nextLine();
		String Desg = sc.nextLine();
		float bsal = Float.parseFloat(sc.nextLine());
		e = new Employee(Name, Desg, bsal);
		String Hno = sc.nextLine();
		String stname = sc.nextLine();
		String City = sc.nextLine();
		int pincode = Integer.parseInt(sc.nextLine());
		ad = new Address(Hno, stname, City, pincode);
	}
	public void getData()
	{
		e.getData();
		ad.getdata();
	}
}

