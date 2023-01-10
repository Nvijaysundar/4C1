package p1;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Employee {
	TechSkills ob = null;
	String Name,Desg,Branch,Empid;
	public Employee(TechSkills ob)
	{
		this.ob = ob;
	}
	public void setData(Scanner sc)
	{
		Name = sc.nextLine();
		Desg = sc.nextLine();
		Branch = sc.nextLine();
		Empid = sc.nextLine();
		ob.BE_lang = sc.nextLine();
		ob.tools = sc.nextLine();
		ob.fend_lang = sc.nextLine();
	}
	public void getData()
	{
		StringTokenizer st = null;
		System.out.println("Name : "+Name);
		System.out.println("Desg: "+Desg);
		System.out.println("Branch: "+Branch);
		System.out.println("EMpid: "+Empid);
		st = new StringTokenizer(ob.BE_lang,",");
		int i =1;
		System.out.println("Backend Languages: ");
		while(st.hasMoreTokens())
		{
			System.out.println(i++ +"."+st.nextToken());
		}
		i =1;
		st = new StringTokenizer(ob.tools,",");
		System.out.println("Tools: ");
		while(st.hasMoreTokens())
		{
			System.out.println(i++ +"."+st.nextToken());
		}
		i =1;
		st = new StringTokenizer(ob.fend_lang,",");
		System.out.println("Frontend Languages: ");
		while(st.hasMoreTokens())
		{
			System.out.println(i++ +"."+st.nextToken());
		}
	}
}
