package p2;
import p1.Inout;
import java.util.*;
public class EmployeeDetails {
	public static void main(String[] args) {
	Scanner sc=  new Scanner(System.in);
	Inout[] ob = new Inout[Integer.parseInt(sc.nextLine())];
	
		for(int i=0;i<ob.length;i++)
			{
			ob[i] = new Inout();
			ob[i].setData(sc);
			}
		System.out.println("Name\tDesg\tBsal\tHno\tStname\tCity"
					+"\tPincode");
		for(Inout temp: ob)
			temp.getData();
	}
}
