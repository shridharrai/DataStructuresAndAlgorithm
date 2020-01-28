package strings;

import java.util.Scanner;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
//		printChars(str);
		printSubstring(str);
		scn.close();
	}
	
	public static void printChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public static void printSubstring(String str) {
		for (int si = 0; si <= str.length()-1; si++) {
			for (int ei = si+1; ei <= str.length(); ei++) {
				String ss = str.substring(si, ei);
				System.out.println(ss);
			}
			
		}
	}

}
