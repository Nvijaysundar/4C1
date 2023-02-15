package instancememberinnerclass;
public class Outer {
	int a =100;
	static int b=20;
	
	class Inner{
		int x =120;
		static int y =450;
		void m1()
		{
			System.out.println("B: "+b);
			System.out.println("Y: "+y);
			System.out.println("A: "+a);
			System.out.println("X: "+x);
		}
		static void m2()
		{
			System.out.println("B: "+b);
			System.out.println("Y: "+y);
		}
	}
	public static void main(String[] args) {
		new Outer().new Inner().m1();
		Outer.Inner.m2();
	}
}
