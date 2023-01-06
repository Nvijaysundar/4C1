package p1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Charecter:");
		char ch = sc.nextLine().charAt(0);
		if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
		{
			switch(ch)
			{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'I':
			case 'i':
			case 'o':
			case 'O':
			case 'U':
			case 'u':
				System.out.println("Vowel");
				break;
				default:
					System.out.println("Consonent");
			}
		}
		else if(ch>=48 && ch<=57)
		{
			System.out.println("Number");
		}
		else
			System.out.println("Symbol");
	}
}
