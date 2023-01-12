package p1;
public class B extends A {
	B() {
		super(456); //this should be added by programmer
		System.out.println("This is Cc Con");
	}

	public static void main(String[] args) {
		B ob =  new B();
	}

}
