package twoDArray;

import java.util.Scanner;

public class TwoDArrayOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr = {{10,20}, {30,40,50}, {60,70}};
		int[][] arr = takeinput();
		display(arr);
	}

	public static int[][] takeinput() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int rows = s.nextInt();
		int[][] arr = new int[rows][];
		
		for(int row = 0; row<rows; row++) {
			System.out.println("Enter the number of columns for row " + row);
			int cols = s.nextInt();
			arr[row] = new int[cols];
			
			for(int col = 0; col<cols; col++) {
				System.out.println("Enter the value for row "+row+" column "+col);
				arr[row][col] = s.nextInt();
			}
		}
		s.close();
		return arr;
	}
	
	public static void display(int[][] arr) {
		// TODO Auto-generated method stub
		for(int row = 0; row<arr.length; ++row) {
			for(int col = 0; col<arr[row].length; ++col) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
