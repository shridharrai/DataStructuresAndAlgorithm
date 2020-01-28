package recursion;

import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(getBoardPath(0, 10).size());
//		System.out.println(getBoardPath(0, 10));
//		printBoardPath(0, 10, "");
		System.out.println(countBoardPath(0, 10));
	}
	
	
	public static ArrayList<String> getBoardPath(int curr, int end) {
		if(curr == end) {  //+ve base case
			ArrayList<String> br = new ArrayList<String>();
			br.add("\n");
			return br;
		}
		
		if (curr > end) {    //-ve base case
			ArrayList<String> br = new ArrayList<String>();
			return br;
		}
		ArrayList<String> mr = new ArrayList<String>();
		
		for(int dice = 1; dice <= 6; ++dice) {
			ArrayList<String> rr = getBoardPath(curr+dice, end);
			
			for(String rrs : rr) {
				mr.add(dice + rrs);
			}
		}
		return mr;
	}

	public static void printBoardPath(int curr, int end, String ans) {
		if(curr == end) {
			System.out.println(ans);
			return;
		}
		if(curr > end) {
			return;
		}
		
		for(int dice = 1; dice <= 6; ++dice) {
			printBoardPath(curr+dice, end, ans+dice);
		}
	}

	public static int countBoardPath(int curr, int end) {
		if(curr == end) {
			return 1;
		}
		if(curr > end) {
			return 0;
		}
		
		int count = 0;
		for(int dice = 1; dice <= 6; ++dice) {
			count += countBoardPath(curr+dice, end);
		}
		
		return count;
	}
}
