package strings;

import java.util.Scanner;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		// String to StringBuilder
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.append("abc");
		System.out.println(sb);
		//insert
		sb.insert(2, "def");
		System.out.println(sb);
		sb.insert(2, 'g');
		System.out.println(sb);
		sb.insert(sb.length(), 'g');
		System.out.println(sb);
		//delete
		sb.deleteCharAt(3);
		System.out.println(sb);
		//update
		sb.setCharAt(4, 'd');
		System.out.println(sb);
		//StringBuilder to String
		String s = sb.toString();
		System.out.println(s);
		scn.close();
	}

}
