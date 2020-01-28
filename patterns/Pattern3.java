package patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		//Initialization
		int nsp = 0;
		int nst = n;
		int row = 1;
		while (row<=n) {
			//spaces work
			int csp = 1;
			while (csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			//stars work
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			//preparation
			row++;
			nst--;
			nsp++;
			System.out.println();
		}
		scn.close();
	}

}
