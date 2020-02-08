package backtracking;

public class CoinChange {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coinChange(new int[] {2, 3, 5, 6}, 5, "", 0);
//		coinChangePermutation(new int[] {2, 3, 5, 6}, 10, "");
	}
	
	public static void coinChange(int[] denom, int amount, String ans, int lastDenomIdx) {
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = lastDenomIdx; i < denom.length; i++) {
			if(amount >=denom[i]) {
				coinChange(denom, amount - denom[i], ans + denom[i], i);
			}
			
		}
	}
	
	public static void coinChangePermutation(int[] denom, int amount, String ans) {
		if(amount == 0) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}
		
		for (int i = 0; i < denom.length; i++) {
			if(amount >=denom[i]) {
				coinChangePermutation(denom, amount - denom[i], ans + denom[i]);
			}
			
		}
	}

}
