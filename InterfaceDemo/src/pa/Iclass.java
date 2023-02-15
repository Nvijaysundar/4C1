package pa;
public class Iclass implements Itest {
	public void m1()
	{
		System.out.println("This is abstract method");
	}
	public void m2(int x)
	{
		System.out.println(x);
	}
	public static void main(String[] args) {
		new Iclass().m1();
		new Iclass().m2(456);
		//Itest.a +=50;
		System.out.println("A: "+Itest.a);
	}
}
