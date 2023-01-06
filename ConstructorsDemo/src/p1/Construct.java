package p1;
public class Construct {
	int x;
	public Construct(int i) {
		x = i;
		System.out.println(x);
	}
	public static void main(String[] args) {
		Construct ob = new Construct(1000);
	}
}
