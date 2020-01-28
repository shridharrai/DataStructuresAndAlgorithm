package recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = fact(4);
		System.out.println(fact);
	}
	
	public static int fact(int n) {
		if(n == 1) {
			return 1;
		}
		
		int fnm1 = fact(n-1);
		int fn = n*fnm1;
		return fn;
	}

}
