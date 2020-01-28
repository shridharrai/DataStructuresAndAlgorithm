package array;

public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the array
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
		
		
		// non working swap
		int i = 0, j = 2;
		System.out.println(arr[i] + "," + arr[j]);
		swap(arr[i], arr[j]);
		System.out.println(arr[i] + "," + arr[j]);
	}
	
	public static void swap(int one, int two) {
		int temp = one;
		one = two;
		two = temp;
	}

}
