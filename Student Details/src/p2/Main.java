package p2;
import java.util.Scanner;
import p1.Student;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String STName = sc.nextLine();
		long Strollno = Long.parseLong(sc.nextLine());
		String StBranch = sc.nextLine();
		String Stemail = sc.nextLine();
		Student s = new Student();
		s.setData(STName, Stemail, Strollno, StBranch);
		s.getData();
		sc.close();
		s = null;
		Student st2 = new Student();
		st2.setData("ABC", "ABC@gmail.com",9864516314l, "4c1");
		st2.getData();
	}
}
