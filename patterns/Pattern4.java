package patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nr = (n*2)-1;
		int nst = 1;
		//row
		int row = 1;
		while (row<=nr) {
			//work
			int cst = 1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			//preparation
			if(row <= nr/2) {
				nst++;
			}
			else {
				nst--;
			}
			row++;
			System.out.println();
		}
		scn.close();
	}

}
