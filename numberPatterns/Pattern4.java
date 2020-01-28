package numberPatterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nr = 2*n-1;
		int nst = 1;
		int val;
		
		int row = 1;
		while(row <= nr) {
			if (row <= nr/2+1) {
				val = row;
			} else {
				val = nr - row + 1;
			}
			//Work
			int cst = 1;
			while(cst <= nst) {
				if(cst % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(val);
				}
				cst++;
			}
			
			//Preparation
			if(row <= nr/2) {
				nst = nst+2;
			}
			else {
				nst = nst-2;
			}
			row++;
			System.out.println();
		}
		
		
		scn.close();
	}

}
