package stringtokenizerclass;
import java.util.StringTokenizer;
public class Beta {
	public static void main(String[] args) {
		String str = "Hi, Hello. My Name is XYZ";
		StringTokenizer ob = new StringTokenizer(str);
		System.out.println(ob.countTokens());
		while(ob.hasMoreTokens())
		{
	System.out.println(new StringBuffer(ob.nextToken()).reverse());			
		}
	}

}
