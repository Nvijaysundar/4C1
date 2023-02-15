package generilization.using.classes;

public class Cclass extends Pclass{
	void m1()
	{
		System.out.println("THis is CClass M1 method");
	}
	
	void m3()
	{
		System.out.println("THis is Cclass m3 method");
	}
	public static void main(String[] args) {
		Pclass ob = new Cclass();
		ob.m1();
		ob.m2();
	}
}
