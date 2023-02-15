package com.execution;

public class Deposit implements Transaction {

	public boolean process(int amt) {
		if(amt%100==0)
		{
			if(amt>=500)
			{
				Balance.bal += amt;
				Transaction.b.getBal();
				return true;
			}
			else
			{
				System.out.println("Minimum amt id 500/-");
				return false;
			}
		}
		else
		{
			System.out.println("Not 100 Multiple");
			return false;
		}
	}
	
}
