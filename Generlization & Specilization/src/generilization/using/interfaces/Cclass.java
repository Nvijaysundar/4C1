package generilization.using.interfaces;
public class Cclass	implements Itest{
	public void m1()
	{
		System.out.println("THis is Itest M1 method");
	}
	
	void m3()
	{
		System.out.println("THis is Cclass m3 method");
	}
	public static void main(String[] args) {
		Itest ob = new Cclass();
		ob.m1();
		ob.m2();
	}
}
