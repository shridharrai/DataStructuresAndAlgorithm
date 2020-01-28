package array;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {99,88,77,66,55};
		insertionSort(arr);
		display(arr);
	}
	
	public static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int counter = 1; counter<=arr.length - 1; counter++) {
			
			int val = arr[counter];
			
			int j = counter-1;
			while(j>=0 && arr[j]>val) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = val;
		}
	}

	public static void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}

}
