import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean flag = false;
		int divisor = 2;
		
		while (divisor<n) {
			if(n%divisor == 0) {
				flag = true;
			}
			divisor+=1;
		}
		
		if(flag == true) {
			System.out.println("Non Prime");
		}
		else {
			System.out.println("Prime");
		}
		
		
		scn.close();
	}

}
