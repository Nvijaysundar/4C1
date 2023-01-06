package stringclassdemo;
import java.util.*;
public class Delta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine().toLowerCase();
		int vc=0,cc=0,dc=0,syc=0,sum=0;
		//int sum2=0;
		for(int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				switch(ch)
				{
				case 'a','e','i','o','u':
					vc++;
					break;
				default:
					cc++;
				}
			}
			else if(ch>='0'&&ch<='9')
			{
				dc++;
				sum += Integer.parseInt(String.valueOf(ch));
				//sum2 += ((int)ch -48);
			}
			else
				syc++;
		}
		System.out.println("VC: "+vc);
		System.out.println("Consonents: "+cc);
		System.out.println("Symbols: "+syc);
		System.out.println("Digits: "+dc);
		System.out.println("Sum: "+sum);
	}

}
