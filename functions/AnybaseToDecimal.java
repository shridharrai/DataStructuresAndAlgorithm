package functions;

import java.util.Scanner;

public class AnybaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int snum = scn.nextInt();
		int sb = scn.nextInt();
		int res = conversion(snum, sb);
		System.out.println(res);
		scn.close();
	}
	
	public static int conversion(int snum, int sb) {
		int multiplier = 1;
		int ans = 0;
		
		while(snum != 0) {
			int rem = snum % 10;
			ans = ans + rem*multiplier;
			snum = snum/10;
			multiplier = multiplier*sb;
		}
		return ans;
	}

}
