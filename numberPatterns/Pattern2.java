package numberPatterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int rows = 1;
		int nsp = n-1;
		int nst = 1;
		int val = 1;
		
		while(rows<=n) {
			for(int csp = 1; csp<=nsp; csp++) {
				System.out.print("\t");
			}
			
			for(int cst = 1; cst<=nst; cst++) {
				System.out.print(val + "\t");
				val++;
			}
			
			rows++;
			nsp = nsp-1;
			nst = nst+2;
			System.out.println();
		}
		scn.close();
	}

}
