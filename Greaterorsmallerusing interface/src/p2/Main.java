package p2;
import p1.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The CHoice: 1.Greater\n2.Smaller");
		switch(sc.nextInt())
		{
		case 1:
			System.out.println(new Greater().comapare(sc.nextInt(), sc.nextInt()));
			break;
		case 2:
			System.out.println(new Smaller().comapare(sc.nextInt(), sc.nextInt()));
		}
		sc.close();
	}

}
