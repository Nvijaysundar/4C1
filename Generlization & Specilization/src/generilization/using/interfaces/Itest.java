package generilization.using.interfaces;
public interface Itest {
	void m1();
	default void m2()
	{
	System.out.println("This is Itest m2 Method");	
	}
}
