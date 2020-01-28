package patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	//Initialization
	int row = 1;
	int nst = 1;
	int nsp = n/2;
	
	//Work
	while(row<=n) {
		//Spaces work
		for (int csp = 1; csp <= nsp; csp++) {
			System.out.print(" ");
		}
		//Stars work
		for (int cst = 1; cst <= nst; cst++) {
			System.out.print("*");
		}
		
		//Preparation
		if(row <= n/2) {
			nst = nst+2;
			nsp = nsp-1;
		}
		else {
			nst = nst-2;
			nsp = nsp+1;
		}
		row++;
		System.out.println(); 
	}
	scn.close();
	}

}
