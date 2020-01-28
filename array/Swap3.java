package array;

public class Swap3 {

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
		
		int[] other = {100,200,300};
		System.out.println(arr[0] + " ," + other[0]);
		swap(arr, other);
		System.out.println(arr[0] + " ," + other[0]);
	}
	
	public static void swap(int[] one, int[] two) {
		int[] temp = one;
		one = two;
		two = temp;
		System.out.println(one[0] + " ," + two[0]);
	}

}
