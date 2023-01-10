package p2;
import java.util.Scanner;
import p1.*;
public class Empdetails {

	public static void main(String[] args) {
		Employee e = new Employee(new TechSkills());
		e.setData(new Scanner(System.in));
		e.getData();

	}

}
