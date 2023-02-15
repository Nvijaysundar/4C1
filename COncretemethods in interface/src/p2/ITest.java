package p2;
public interface ITest {
	void m1();
	private static void m2()
	{
		System.out.println("This is m2 method");
	}
	private void m3()
	{
		System.out.println("This is D- Con method");
	}
	default void access()
	{
		this.m3();
		ITest.m2();
	}
}
