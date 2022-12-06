package prod;
import java.util.Scanner;
public class Product {
	String Name,Code;
	int qty;
	float price; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		System.out.println("Ente Qty");
		p.qty = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Name:");
		p.Name  = sc.nextLine();
		System.out.println("Enter Code");
		p.Code = sc.nextLine();
		System.out.println("Enter PRice");
		p.price = sc.nextFloat();
		System.out.println("Name: "+ p.Name);
		System.out.println("Code: "+p.Code);
		System.out.println("Qty: "+p.qty);
		System.out.println("Prie: "+p.price);
	}}
