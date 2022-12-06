package p1;

public class Meth {
	int x =100, y= 23;
	static double add(int a, int b)
	{
		return a+b;
	}
	void sub()
	{
		System.out.println("diff:: "+ (x-y));
	}
	static void mul(double a, int b)
	{
		System.out.println("MuL :: "+ (a*b));
	}
	float div(int a, int b)
	{
		return a/(float)b;
	}
	int rem(int a,int b)
	{		
		return a%b;
	}
	public static void main(String[] args) {
		System.out.println("Add" + add(123,125));
		Meth ob = new Meth();
		ob.sub();
		mul(45.636,12);
		System.out.println("Div: "+ ob.div(45, 3));
		System.out.println("Rem: "+ new Meth().rem(78, 12));
	}
}
