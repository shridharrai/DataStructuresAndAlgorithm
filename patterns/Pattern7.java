package patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		//Initialization
		int rows = 1;
		int nst = 1;
		int nsp = 2*n-3;
		//Work
		while (rows<=n) {
			//Stars work
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			//Spaces work
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			//Stars work
			cst = 1;
			if(rows == n) {
				cst = 2;
			}
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			//Preparation
			rows++;
			nst = nst+1;
			nsp = nsp-2;
			System.out.println();
		}
		scn.close();
	}

}
