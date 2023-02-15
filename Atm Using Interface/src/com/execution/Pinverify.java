package com.execution;

import java.util.Scanner;

public class Pinverify {

	public boolean pincheck(Scanner sc) {
		int pinchances =3;
		while(true) {
			System.out.println("Enter pin: ");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1111,2222,3333:
				return true;
			default:
				System.out.println("Invalid Pin no");
				System.out.println("Leftover chances: "+--pinchances);
			}
			if(pinchances==0)
				return false;
	}
	}

}
