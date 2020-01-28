package patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nsp = n-1;
		int nst = 1;
		
//		row
		while(row<=n) {
//			space work
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
//			star work
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			
//			preparation
			row++;
			nsp--;
			nst++;
			System.out.println();
		}
		
	}
}


/*Another way

		int row = 1;
		while(row<=n) {
			int nsp = n-row;
			int nst = row;
			while (nsp>=1) {
				System.out.print(" ");
				nsp--;
			}
			while(nst>=1) {
				System.out.print("*");
				nst--;
			}
	
			row++;
			System.out.println();
		}
	*/
