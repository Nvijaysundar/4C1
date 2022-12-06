package p1;

public class Employee {
	String Name,Desg;
	float bsal;
	public void setdata(String Name,String Desg,float bsal)
	{
		this.Name = Name;
		this.Desg = Desg;
		this.bsal = bsal;
	}
	public void getData()
	{
		System.out.println("Name: "+Name);
		System.out.println("Desg: "+Desg);
		System.out.println("Tsal: "+ (bsal + 0.53f*bsal 
									+ 0.22f*bsal));
	}
}
