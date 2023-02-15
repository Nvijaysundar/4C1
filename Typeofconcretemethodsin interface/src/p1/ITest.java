package p1;
public interface ITest {
	void m3();
	private static void m1()
	{
		System.out.println("This is PS-m1 Method");
	}
	private void m2()
	{
		System.out.println("This is PNS-m2 Method");
	}
	public default void access()
	{
		this.m2();
		ITest.m1();
	}
}
