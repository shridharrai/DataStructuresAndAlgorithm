package recursion;

public class SkipNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PDISkip(5);
	}
	
	public static void PDISkip(int n) {
		if(n==0) {
			return;
		}
		if(n%2 == 1) {
			System.out.println(n);
		}
		
		PDISkip(n-1);
		if(n%2 == 0) {
			System.out.println(n);
		}
	}

}
