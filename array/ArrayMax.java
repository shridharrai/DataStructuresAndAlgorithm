package array;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,20,50,15,70};
		System.out.println(maxInArray(array));
	}

	public static int maxInArray(int[] array) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} 
		}
		
		return max;
	}

}
