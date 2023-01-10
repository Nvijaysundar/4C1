package o1;
import java.util.StringJoiner;
public class Product {
	String Name,Code;
	float price;
	int qty;
	public Product(String Name,String Code,float price, int qty)
	{
		this.Name = Name;
		this.Code = Code;
		this.price = price;
		this.qty = qty;
	}
	
	public void display()
	{
		StringJoiner sj = new StringJoiner("\t");
		sj.add(Name).add(Code).add(String.valueOf(price))
								.add(String.valueOf(qty));
		System.out.println(sj);
	}
}
