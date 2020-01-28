package functions;

import java.util.Scanner;

public class AnybaseToAnybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int snum = scn.nextInt();
		int sb = scn.nextInt();
		int db = scn.nextInt();
		int res = conversion(snum, sb, db);
		System.out.println("Result is "+res);
		scn.close();
	}
	
	public static int conversion(int snum, int sb, int db) {
		int decimalnumber = 0;
		int multiplier = 1;
		
		//First anybase to decimal
		while(snum != 0) {
			int rem = snum % 10;
			decimalnumber = decimalnumber + rem*multiplier;
			snum = snum/10;
			multiplier = multiplier*sb;
		}
		System.out.println(decimalnumber);
		
		//Then decimal to destination base
		int ans = 0;
		multiplier = 1;
		while (decimalnumber != 0) {
			int rem = decimalnumber % db;
			ans = ans + rem*multiplier;
			decimalnumber = decimalnumber/db;
			multiplier = multiplier*10;
		}
		
		return ans;
	}

}
