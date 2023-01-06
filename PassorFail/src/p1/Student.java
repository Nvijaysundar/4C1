package p1;
public class Student {
	String name;
	long rollno;
	public Student(String Sname, long Srollno)
	{
		name = Sname;
		rollno = Srollno;
	}
	public void getData()
	{
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+ rollno);
	}
}
