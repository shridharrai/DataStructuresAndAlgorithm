import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TraillingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        for(int i=5; n/i>=1; i=i*5) {
            count = count+(n/i);
        }
        System.out.println(count);
        scn.close();
		
	}

}
