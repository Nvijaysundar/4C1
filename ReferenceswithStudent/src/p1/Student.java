package p1;

public class Student {
	Address ad = null;
	Contact c = null;
	Marks m = null;
	String Name,Rollno,Branch;
	public Student(Address ad, Contact c, Marks m)
	{
		this.ad = ad;
		this.c = c;
		this.m = m;
	}
	public void Display()
	{
		System.out.println("Details of Student\nName: "+Name);
		System.out.println("Rollno: "+Rollno);
		System.out.println("Branch: "+Branch);
		System.out.println("EMailid: "+c.Emaild);
		System.out.println("Mobile no: "+c.phno);
		System.out.println("Hno: "+ad.hno);
		System.out.println("Stname: "+ad.stname);
		System.out.println("City: "+ad.city);
		System.out.println("Pincode: "+ad.pincode);
		System.out.println("Percentage: "+ (m.totalmarks/6.0f));
		if(m.failsub>0)
			System.out.println("Result: Fail");
		else
			System.out.println("Result: Pass\n");
		
	}
}
