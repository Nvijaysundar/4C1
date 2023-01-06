package stringjoiner;
import java.util.*;
public class Delta {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("-");
		sj.add("Java");
		System.out.println(sj.toString());
		sj.add("Programming");
		System.out.println(sj.toString());
		StringJoiner sj2 = new StringJoiner("/");
		sj2.add("30").add("12").add("2022");
		System.out.println(sj2);
		sj.merge(sj2);
		System.out.println(sj);
		StringJoiner sj3 = new StringJoiner("@");
		sj3.setEmptyValue("Joiner is Empty");
		System.out.println(sj3);
		sj3.add("Hi");
		System.out.println(sj3);
	}

}
