package stringclassdemo;
public class Gamma {
	public static void main(String[] args) {
		String str = "  Java";
		String st2 = "Programming  ";
		String str3=  str+st2;
		String str4 = str.concat(st2);
		str4 = str4.strip();
		System.out.println(str3.toString());
		for(int i=0;i<str4.length();i++)
			System.out.print(str4.charAt(i)+" ");
		System.out.println();
		System.out.println(str4.endsWith("ing"));
		System.out.println(str4.contains("Prog"));
		//str4 = str4.replaceAll("[ra]","Python");
		System.out.println(str4);
		System.out.println(str4.substring(5,10));
	}
}




