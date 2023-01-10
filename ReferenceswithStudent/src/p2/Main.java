package p2;
import p1.*;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Student[] st = new Student[2]; 
		Read[] r = new Read[st.length];
		Out[] o = new Out[st.length];
		for(int i=0;i<st.length;i++ )	{			
				st[i]= new Student(new Address(),new Contact(),new Marks());
				r[i] = new Read(new Scanner(System.in), st[i]);
		}
		for(int i=0;i<o.length;i++)
			o[i]= new Out(st[i]);
	}
}
