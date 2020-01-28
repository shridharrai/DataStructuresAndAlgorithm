package backtracking;

public class QueenPermutationAndCombination {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		queenPermutation(new boolean[4], 0, 2, "");
		queenCombination(new boolean[4], 0, 2, "", -1);
	}
	
	public static void queenPermutation(boolean boxes[], int qpsf, int tq, String ans) {
		if(qpsf == tq) {   //base case
			count++;
			System.out.println(count+ " " +ans);
			return;
		}
		for (int i = 0; i < boxes.length; i++) {
			if(boxes[i] == false) {
				boxes[i] = true;
				queenPermutation(boxes, qpsf + 1, tq, ans+"q"+qpsf+"b"+i+" ");
				boxes[i] = false;    //undo means backtracking
			}
			
		}
		
	}
	
	
	public static void queenCombination(boolean boxes[], int qpsf, int tq, String ans, int lastBoxUsed) {
		if(qpsf == tq) {   //base case
			count++;
			System.out.println(count+ " " +ans);
			return;
		}
		for (int i = lastBoxUsed+1; i < boxes.length; i++) {
			
				boxes[i] = true;
				queenCombination(boxes, qpsf + 1, tq, ans+"q"+qpsf+"b"+i+" ", i);
				boxes[i] = false;    //undo means backtracking
			
		}
		
	}

}
