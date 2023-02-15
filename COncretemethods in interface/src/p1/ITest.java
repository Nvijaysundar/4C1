package p1;
public interface ITest {
	void m1();
	static void m2()
	{
		System.out.println("This is m2 method");
	}
	default void m3()
	{
		System.out.println("This is D- Con method");
	}
}
