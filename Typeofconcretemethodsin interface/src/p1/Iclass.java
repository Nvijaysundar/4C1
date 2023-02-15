package p1;
public class Iclass implements ITest {
	public void m3()
	{
		System.out.println("This is m3 method");
	}
	public static void main(String[] args) {
		Iclass ob = new Iclass();
		ob.access();
	}

}
