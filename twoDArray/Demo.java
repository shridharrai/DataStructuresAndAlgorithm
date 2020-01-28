package twoDArray;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr;
		arr = new int[3][3];
		display(arr);
		System.out.println("**************");
		arr[0][0] = 10;
		arr[2][0] = 20;
		display(arr);
		System.out.println("************");
		
		int[][] arr1 = new int[3][];
		arr1[0] = new int[4];
		arr1[2] = new int[3];
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[0][2]);
//		System.out.println(arr1[1][2]); //null pointer exception
		arr1[1] = new int[2];
		display(arr1);
	}

	public static void display(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i<arr.length; ++i) {
			for(int j = 0; j<arr[i].length; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
