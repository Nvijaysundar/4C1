package p1;

public interface Itest2 {
	void m1();
	static void m2()
	{
		System.out.println("This is S-Con method");
	}
	default void m3()
	{
		System.out.println("THis is D- Con Method");
	}
}
