package patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n;
		int row = 1;
		while (row<=n) {
			int col = 1;
			while (col<=nst) {
				System.out.print("*");
				col++;
			}
			row++;
			nst--;
			System.out.println();
		}
	}

}
