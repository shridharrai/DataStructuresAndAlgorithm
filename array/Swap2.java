package array;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = null;
		System.out.println(arr);
		
		//Allocate the space
		arr = new int[5];
		System.out.println(arr);
		
		//Set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//Working Swap
		int i = 0, j = 2;
		System.out.println(arr[i] + " ," + arr[j]);
		swap(arr, i, j);
		System.out.println(arr[i] + " ,"+ arr[j]);
	}
	
	public static void swap(int[] arr, int i, int j) {
		System.out.println(arr[i] + " ," + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		System.out.println(arr[i] + " ," + arr[j]);
	}

}
