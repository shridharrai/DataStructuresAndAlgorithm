package patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		//Initialization
		int row = 1;
		int nst = n/2;
		int nsp = 1;
		
		//Work
		while(row<=n) {
			//stars work
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			//spaces work
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			//Again stars work
			cst = 1;
			while (cst<=nst) {
				System.out.print("*");
				cst++;
			}
			//Preparation
			if(row<=n/2) {
				nst = nst-1;
				nsp = nsp+2;
			}
			else {
				nst = nst+1;
				nsp = nsp-2;
			}
			row++;
			System.out.println();
		}
		scn.close();
	}

}
