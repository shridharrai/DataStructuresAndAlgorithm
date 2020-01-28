package array;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {99,88,77,66,55};
		selectionSort(arr);
		display(arr);
	}
	
	public static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		//Sort in Ascending Order
		for(int counter = 0; counter < arr.length-1; counter++) {
			
			int min = counter;
			
			for(int j = counter+1; j < arr.length; ++j) {
				
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			
			int temp = arr[counter];
			arr[counter] = arr[min];
			arr[min] = temp;
		}
	}

	public static void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}

}
