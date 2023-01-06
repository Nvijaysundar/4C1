package stringclassdemo;
public class Stringcomparisions {
	public static void main(String[] args) {
		String st1 = "Java";
		String st2 = "Java";
		String st3 = new String("Java");
		String st4 = new String("Java");
		System.out.println(st1.equalsIgnoreCase(st4));
		System.out.println(st2.compareTo(st3));
		if(st1==st2)
			System.out.println("String are same");
		else
			System.out.println("String are not same");
		if(st3==st4)
			System.out.println("String are same");
		else
			System.out.println("String are not same");
		
	}

}
