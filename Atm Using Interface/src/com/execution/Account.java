package com.execution;
import java.util.Scanner;
public class Account {
	long accno;
	String Name;
	public void Execution() {
		Scanner sc =new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter Account no: ");
			accno = Long.parseLong(sc.nextLine());
			if(String.valueOf(accno).length()==5)
			{
				break;
			}
			else
				System.out.println("Invalid Account nos");
		}
		System.out.println("Enter Name: ");
		Name = sc.nextLine();
		if(new Pinverify().pincheck(sc))
		{
			while(true) {
				System.out.println("Select the Choice:\n1.Deposit\n2.withdraw\n"
					+ "3.Balance\n4.exit");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				while(true)
				{	
					System.out.println("Enter AMount:");
					if(new Deposit().process(Integer.parseInt(sc.nextLine())))
						break;
					else
					System.out.println("Invalid Format");
				}
					break;
				
			case 2:
				while(true)
				{	
					System.out.println("Enter AMount:");
					if(new Withdraw().process(Integer.parseInt(sc.nextLine())))
						break;
					else
					System.out.println("Invalid Format");
				}
				break;
			case 3:
				Transaction.b.getBal();
				break;
			case 4:
				System.out.println("Thanks for using Services");
				sc.close();
				System.exit(0);
				default:
					System.out.println("Invalid Selection");
			}
			}
		}
		else
		{
			System.out.println("Reach the nearest Branch to chance pin");
			sc.close();
			System.exit(0);
		}
	}
}
