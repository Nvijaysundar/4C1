package p1;
public class Product {
	 String Name,Code;
	int qty;
	float price;
	public Product(String pName,String pCode,
							int pqty,float pprice)
	{
		Name = pName;
		Code = pCode;
		qty = pqty;
		price = pprice;
	}
	public void getProduct()
	{
		System.out.println("Name: "+ Name);
		System.out.println("Code: "+Code);
		System.out.println("Qty" + qty);
		System.out.println("Price: "+ price);
	}
}
