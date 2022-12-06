package p1;

public class Main {
	static int i =10;
	int j=20;
	public static void main(String[] args) {
		int c=30;
		Main ob = new Main();
		System.out.println("i: "+Main.i);
		System.out.println("ob-j: "+ob.j);
		System.out.println("C: "+c);
		Main.i += 100;
		ob.j +=200;
		System.out.println("i: "+Main.i);
		System.out.println("ob-j: "+ob.j);
		Main ob2 = new Main();
		System.out.println("i: "+Main.i);
		System.out.println("ob2-j: "+ob2.j);
		
	}

}
