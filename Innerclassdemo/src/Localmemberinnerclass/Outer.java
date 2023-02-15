package Localmemberinnerclass;
public class Outer {
	int a =100;
	static int b=20;
	void outer1()
	{
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
		Inner ob = new Inner();
		ob.m1();Inner.m2();
	}
	
	static void outer2()
	{
		class Inner{
			int x =120;
			static int y =450;
			void m1()
			{
				System.out.println("B: "+b);
				System.out.println("Y: "+y);
				//System.out.println("A: "+a);
				System.out.println("X: "+x);
			}
			static void m2()
			{
				System.out.println("B: "+b);
				System.out.println("Y: "+y);
			}
		}
		Inner ob = new Inner();
		ob.m1();Inner.m2();
	}
	
	public static void main(String[] args) {
		Outer.outer2();
		new Outer().outer1();
	}
}
