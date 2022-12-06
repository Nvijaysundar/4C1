package p2;
import p1.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		Address ad = new Address();
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Desg: ");
		String desg = sc.nextLine();
		System.out.println("Enter Bsal: ");
		float bsal  = Float.parseFloat(sc.nextLine());
		e.setdata(name, desg, bsal);
		System.out.println("ENtet Hno: ");
		String Hno= sc.nextLine();
		System.out.println("Enter Stname: ");
		String stname = sc.nextLine();
		System.out.println("ENter city: ");
		String city = sc.nextLine();
		System.out.println("Enter Pincode");
		int pincode = sc.nextInt();
		ad.setData(Hno, stname, city, pincode);
		e.getData();
		ad.getdata();
		sc.close();
		ad = null;
		e = null;
	}
}
