package array;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,20,30,25,5};
		System.out.println(linearsearch(array, 25));
	}

	public static int linearsearch(int[] array, int item) {
		// TODO Auto-generated method stub
		for (int j = 0; j < array.length; j++) {
			if (array[j] == item) {
				return j;
			}
		}
		return -1;
	}
	

}
