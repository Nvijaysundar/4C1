package p1;

public class Main {

	static void add(int a, int b)
	{
		System.out.println("Sum: "+(a+b));
	}
	 void sub()
	{
		int a =20,b=30;
		System.out.println("Diff:: "+(a-b));
	}
	static double mul()
	{
		int a=30,b=50;
		return  (double)a*b;
	}
	void div(int a,int b)
	{
		System.out.println("Div::"+(a/(float)b));
	}
	 float rem(int a,int b)
	{
		return a%b;
	}
	public static void main(String[] args) {
		Main ob = new Main();
		
		Main.add(12, 13);
		ob.sub();
		System.out.println("Mul:: "+ Main.mul());
		ob.div(56, 12);
		System.out.println("Rem:: "+ ob.rem(56, 12));	
	}
}
