package stringbufferclass;
public class Gamma {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("Java");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("Programming Language");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		System.out.println(sb);
	}
}
