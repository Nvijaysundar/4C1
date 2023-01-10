package p2;
import o1.*;
import java.util.*;
public class Productdata {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noofele = Integer.parseInt(sc.nextLine());
		Product[] p = new Product[noofele];
		for(int i=0;i<noofele;i++)
		{
			System.out.println("Enter Product "+ (i+1)+ " Details");
			String Name =sc.nextLine();
			String Code = sc.nextLine();
			float price = Float.parseFloat(sc.nextLine());
			int qty =Integer.parseInt(sc.nextLine());
			p[i] = new Product(Name, Code, price, qty);
		}
		System.out.println("Name\tCode\tPrice\tqty");
		for(Product temp : p)
			temp.display();
	}

}
