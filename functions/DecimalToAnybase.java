package functions;

import java.util.Scanner;

public class DecimalToAnybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int snum = scn.nextInt();
		int db = scn.nextInt();
		int res = conversion(snum, db);
		System.out.println(res);
		scn.close();
	}
	
	public static int conversion(int snum, int db) {
		int ans = 0;
		int multiplier = 1;
		
		while(snum != 0) {
			int rem = snum % db;
			ans = ans + rem*multiplier;
			snum = snum/db;
			multiplier = multiplier*10;
		}
		return ans;
	}

}
