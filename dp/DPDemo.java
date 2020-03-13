package dp;

public class DPDemo {
	public static long start;
	public static long end;
	
	public static void startAlgo() {
		start = System.currentTimeMillis();
	}
	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 45;
		int[] strg = new int[n+1];
		startAlgo();
		System.out.println(fib(n));
		System.out.println("Fib Normal took time "+endAlgo()+" ms ");
		
		startAlgo();
		System.out.println(fibRS(n, strg));
		System.out.println("Fib Recursive storage took time "+endAlgo()+" ms ");
		
		startAlgo();
		System.out.println(fibIS(n));
		System.out.println("Fib Iterative storage took time "+endAlgo()+" ms ");
		
	}
	
	public static int fib(int n) {
		if (n == 1) {
			return n;
		}
		if (n == 0) {
			return n;
		}
		
		int fnm1 = fib(n-1);
		int fnm2 = fib(n-2);
		int fn = fnm1 + fnm2;
		return fn;
	}
	
	public static int fibRS(int n, int[] strg) {
		if (n == 1) {
			return n;
		}
		if (n == 0) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		
		int fnm1 = fibRS(n-1, strg);
		int fnm2 = fibRS(n-2, strg);
		int fn = fnm1 + fnm2;
		strg[n] = fn;
		return fn;
	}
	
	public static int fibIS(int n) {
		int[] strg = new int[n+1];
		//Seed
		strg[0] = 0;
		strg[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i-1] + strg[i-2];
		}
		
		return strg[n];    
	}

}
