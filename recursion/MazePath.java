package recursion;

import java.util.ArrayList;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(getMazePath(0, 0, 2, 2));
//		System.out.println(getMazePathDiagonal(0, 0, 2, 2));
//		printMazePath(0, 0, 2, 2, "");
//		System.out.println(countMazePath(0, 0, 2, 2));
//		printMazePathDiagonal(0, 0, 2, 2, "");
		System.out.println(countMazePathDiagonal(0, 0, 2, 2));
	}
	
	public static ArrayList<String> getMazePath(int cr, int cc, int er, int ec) {
		if(cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		
		if(cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<String>();
			return br;
		}
		
		ArrayList<String> mr = new ArrayList<String>();
		ArrayList<String> rrh = getMazePath(cr, cc+1, er, ec);
		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}
		
		ArrayList<String> rrv = getMazePath(cr+1, cc, er, ec);
		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}
		
		return mr;
	}
	
	public static ArrayList<String> getMazePathDiagonal(int cr, int cc, int er, int ec) {
		if(cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		
		if(cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<String>();
			return br;
		}
		
		ArrayList<String> mr = new ArrayList<String>();
		ArrayList<String> rrh = getMazePathDiagonal(cr, cc+1, er, ec);
		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}
		
		ArrayList<String> rrv = getMazePathDiagonal(cr+1, cc, er, ec);
		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}
		
		ArrayList<String> rrd = getMazePathDiagonal(cr+1, cc+1, er, ec);
		for (String rrds : rrd) {
			mr.add("D" + rrds);
		}
		
		return mr;
	}

	public static void printMazePath(int cr, int cc, int er, int ec, String ans) {
		if(cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if(cr > er || cc > ec) {
			return;
		}
		
		printMazePath(cr, cc+1, er, ec, ans+"H");
		printMazePath(cr+1, cc, er, ec, ans+"V");
	}
	
	public static int countMazePath(int cr, int cc, int er, int ec) {
		if(cr == er && cc == ec) {
			return 1;
		}
		if(cr > er || cc > ec) {
			return 0;
		}
		
		int ch = countMazePath(cr, cc+1, er, ec);
		int cv = countMazePath(cr+1, cc, er, ec);
		
		return ch+cv;
	}

	public static void printMazePathDiagonal(int cr, int cc, int er, int ec, String ans) {
		if(cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if(cr > er || cc > ec) {
			return;
		}
		
		printMazePathDiagonal(cr, cc+1, er, ec, ans + "H");
		printMazePathDiagonal(cr+1, cc, er, ec, ans + "V");
		printMazePathDiagonal(cr+1, cc+1, er, ec, ans + "D");
	}
	
	public static int countMazePathDiagonal(int cr, int cc, int er, int ec) {
		if(cr == er && cc == ec) {
			return 1;
		}
		if(cr > er || cc > ec) {
			return 0;
		}
		
		int ch = countMazePathDiagonal(cr, cc+1, er, ec);
		int cv = countMazePathDiagonal(cr+1, cc, er, ec);
		int cd = countMazePathDiagonal(cr+1, cc+1, er, ec);
		
		return ch + cv + cd;
	}
}
