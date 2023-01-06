package p2;
import p1.Product;
import java.util.*;
public class ArrayProduct {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Product[] p = new Product[Integer.parseInt(sc.nextLine())];
		for(int i=0;i<p.length;i++) {
			System.out.println("Enter New Product Details: ");
			String name = sc.nextLine();
			String code = sc.nextLine();
			int qty = Integer.parseInt(sc.nextLine());
			float price= Float.parseFloat(sc.nextLine());
			p[i] = new Product(name, code, qty, price);
			}
		for(Product temp : p)
			temp.getProduct();
		sc.close();
	}}
