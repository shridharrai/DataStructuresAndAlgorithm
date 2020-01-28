package array;

import java.util.Scanner;

public class ArrayOps {
    static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = takeinput();
		display(array);
	}
	
	public static void display(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static int[] takeinput() {
		System.out.println("Size ? ");
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i<arr.length; ++i) {
			System.out.println("Enter value for "+i+" index ? ");
			arr[i] = scn.nextInt();
		}
		
		return arr;
	}

}
