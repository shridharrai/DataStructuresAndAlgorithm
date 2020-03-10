import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;
		while (n != 0) {
			int rem = n%10;
			ans = ans*10+rem;
			n = n/10;
		}
		System.out.println(ans);
		System.out.println(Math.round((Math.pow(2, 31.0)))-1);
		scn.close();
	}

}
