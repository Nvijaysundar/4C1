package objectarray;
public class Main {
	public static void main(String[] args) {
		Object[] ob = new Object[3];
		ob[0] = new Integer(123);
		ob[1] = new String("JAva");
		ob[2] = new Product("Mousr","A121",45,4356f);
		System.out.println(ob[0]);
		System.out.println(ob[1]);
		
		((Product)ob[2]).getProduct(); 

	}

}
