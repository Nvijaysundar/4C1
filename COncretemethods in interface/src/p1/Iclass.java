package p1;

public class Iclass implements ITest {

	@Override
	public void m1() {
		System.out.println("This is m1 method");
	}

	public static void main(String[] args) {
		Iclass ob = new Iclass();
		ob.m1();
		ob.m3();
		ITest.m2();
	}

}
