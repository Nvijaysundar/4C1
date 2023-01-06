package blockscode;
public class Alpha {
	Alpha()
	{
		System.out.println("This is Constructor");
	}
	static
	{
		System.out.println("This is S-Block");
	}
	
	{//instance Block
		System.out.println("This is I-Block");
	}
	public static void main(String[] args) {
		System.out.println("This is Statement");
		Alpha ob = new Alpha();
		System.out.println(ob);
	}
}
