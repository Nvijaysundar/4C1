package p1;
import java.util.Scanner;
public class Product {
		String name,code;
		int qty;
		float price;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		System.out.println("Enter Qty");
		p.qty = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Name:: ");
		p.name = sc.nextLine();
		System.out.println("Enter Code:: ");
		p.code = sc.nextLine();
		
		System.out.println("Enter Price");
		p.price = sc.nextFloat();
		System.out.println("NAME: "+p.name);
		System.out.println("COde: "+p.code);
		System.out.println("Qty: "+p.qty);
		System.out.println("Price: "+p.price);
	}
}
