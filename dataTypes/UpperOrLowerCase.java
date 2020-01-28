package dataTypes;

import java.util.Scanner;

public class UpperOrLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		System.out.println(ch);
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("Uppercase");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lowercase");
		} else {
			System.out.println("Invalid character");
		}
		scn.close();
	}

}
