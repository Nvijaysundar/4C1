package p1;

public class Task1 implements Runnable {

	public void run() {
		for(int i=100;i<=110;i++)
		{
			System.out.println("Task1: "+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
