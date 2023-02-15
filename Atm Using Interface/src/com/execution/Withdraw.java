package com.execution;

public class Withdraw implements Transaction{

	
	public boolean process(int amt) {
		if(amt%100==0)
		{
			if(amt<Balance.bal)
			{
				if(Balance.bal-amt>=500)
				{
					Balance.bal -= amt;
					Transaction.b.getBal();
					return true;
				}
				else
				{
					System.out.println("Minimum Bal need to maintained");
					return false;
				}
			}
			else
			{
				System.out.println("Insufficient funds");
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
