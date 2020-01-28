package recursion;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(getPermutations("abc"));
		printPermutation("abc", "");
	}
	public static ArrayList<String> getPermutations(String str) {
		if(str.length() == 0) {     //baseCase
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> mr = new ArrayList<String>();
		ArrayList<String> rr = getPermutations(ros);
		
		for (String rrs : rr) {
			for (int i = 0; i <= rrs.length(); i++) {
				String val = rrs.substring(0, i) + cc + rrs.substring(i);
				mr.add(val);
			}
		}
		return mr;
	}

	public static void printPermutation(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String roq = ques.substring(0,i) + ques.substring(i+1);
			printPermutation(roq, ans + ch);
		}
	}
}
