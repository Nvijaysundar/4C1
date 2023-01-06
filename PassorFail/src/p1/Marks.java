package p1;
public class Marks {
	int totalmarks,fcount;
	public Marks(int tmarks, int failc)
	{
		totalmarks = tmarks;
		fcount = failc;
	}
	public void getResult()
	{
		System.out.println("Perecntage: "+ (totalmarks/6.0f));
		if(fcount>0)
			System.out.println("Fail");
		else
			System.out.println("Pass");
	}
}
