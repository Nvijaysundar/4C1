package p1;
public class Student {
	String Name,Emailid,Branch;
	long rollno;
	public void setData(String Name,String sEmailid,
							long srollno,String sBranch)
	{
		this.Name = Name;
		Emailid = sEmailid;
		rollno = srollno;
		Branch = sBranch;
	}
	public void getData()
	{
		System.out.println("Name: "+Name);
		System.out.println("Rollno: "+rollno);
		System.out.println("EMailid: "+Emailid);
		System.out.println("BRanch: "+Branch);
	}
}
