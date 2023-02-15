package p1;
public class Task2 implements Runnable {
	public void run() {
		for(int i=220;i<=230;i++)
		{
			System.err.println("Task2: "+i);
				
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
