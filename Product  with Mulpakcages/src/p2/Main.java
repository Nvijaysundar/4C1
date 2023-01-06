package p2;
import java.util.Scanner;
import p1.Product;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		Product p1 = new Product();
		String Name = sc.nextLine();
		String Code = sc.nextLine();
		int qty = sc.nextInt();
		float price = sc.nextFloat();
		p.setProduct(Name, Code, qty, price);
		p1.setProduct("CDDR", "A122", 45, 785.05f);
		p.getProduct();
		p1.getProduct();
	}

}
