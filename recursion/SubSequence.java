package recursion;

import java.util.ArrayList;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(getSS("abc"));
		printSubSequence("abc", "");
	}
	public static ArrayList<String> getSS(String str) {
		if(str.length() == 0) {     //baseCase
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}
		
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myResult = new ArrayList<String>();
		ArrayList<String> recResult = getSS(ros);
		
		for(int i = 0; i < recResult.size(); ++i) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
		}
		return myResult;
	}

	public static void printSubSequence(String str, String result) {
		if(str.length() == 0) {
			System.out.println(result);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSubSequence(ros, result);
		printSubSequence(ros, result + cc);
	}
}
