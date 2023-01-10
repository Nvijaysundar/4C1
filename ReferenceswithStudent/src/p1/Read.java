package p1;

import java.util.Scanner;

public class Read {
	public Read(Scanner sc,Student st)
	{
		System.out.println("Enter Student Details\n Name: ");
		st.Name = sc.nextLine();
		System.out.println("Enter Rollno: ");
		st.Rollno = sc.nextLine();
		System.out.println("Enter Branch: ");
		st.Branch = sc.nextLine();
		
		while(true)
		{
			System.out.println("Enter Emailid: ");
			st.c.Emaild = sc.nextLine();
			if(st.c.Emaild.contains("@")&&st.c.Emaild.contains("."))
			{
				System.out.println("Emailid Verified");
				break;
			}
			else
				System.out.println("Enter Valid Emailid");
		}
		while(true) 
		{
			System.out.println("Enter Mobileno: ");
			st.c.phno = Long.parseLong(sc.nextLine());
			if(String.valueOf(st.c.phno).length()==10)
			{
				System.out.println("Mobile no Verified");
				break;
			}
			else
				System.out.println("Enter Valid Mobile No");
		}
		System.out.println("Enter Hno: ");
		st.ad.hno = sc.nextLine();
		System.out.println("Ener Stname: ");
		st.ad.stname = sc.nextLine();
		System.out.println("Enter City: ");
		st.ad.stname = sc.nextLine();
		System.out.println("Enter Pincode: ");
		st.ad.pincode = Integer.parseInt(sc.nextLine());
		
		for(int i=1,sub;i<=6;i++)
		{
			System.out.println("Enter sub"+i+" Marks: ");
			sub = Integer.parseInt(sc.nextLine());
			st.m.totalmarks += sub;
			if(sub<40)
				st.m.failsub++;
		}
		System.out.println();
	}
}
