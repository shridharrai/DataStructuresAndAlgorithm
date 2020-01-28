package array;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {99,88,77,66,55};
		bubbleSort(arr);
		display(arr);
	}
	
	public static void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}

	public static void bubbleSort(int[] arr) {
		//Sort in Ascending Order
	
		for(int counter = 0; counter < arr.length-1; counter++) {
			
			for(int j = 0; j < arr.length - 1 - counter; j++) {
				
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
