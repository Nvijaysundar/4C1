package p1;
public class Execution {
	public static void main(String[] args) {
		
		new Thread(new Task1()).start();
		
		Task2 ob2 = new Task2();
		Thread t2 = new Thread(ob2);
		t2.start();
	}
}
