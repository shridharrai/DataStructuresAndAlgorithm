package recursion;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,8,1,1,8,3,4};
//		System.out.println(firstIndex(arr, 0, 8));
//		System.out.println(lastIndex(arr, 0, 8));
		int[] ans = allIndices(arr, 0, 8, 0);
		display(ans);
	}
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int firstIndex(int[] arr, int si, int data) {
		if(si == arr.length) {     //base case
			return -1;
		}
		if(arr[si] == data) {
			return si;
		} else {
			int resAns = firstIndex(arr, si+1, data);
			return resAns;
		}
	}
	
	public static int lastIndex(int[] arr, int si, int data) {
		if(si == arr.length) {    //base case
			return -1;
		}
		
		int index = lastIndex(arr, si+1, data);
		
		if (index == -1) {
			if (arr[si] == data) {
				return si;
			} else {
				return -1;
			}
		} else {
			return index;
		}
	}
	
	public static int[] allIndices(int[] arr, int si, int data, int count) {
		if (si == arr.length) {   //base case
			int[] base = new int[count];
			return base;
		}
		
		int[] indices = null;
		if (arr[si] == data) {
			indices = allIndices(arr, si+1, data, count+1);
		} else {
			indices = allIndices(arr, si+1, data, count);
		}
		
		if (arr[si] == data) {
			indices[count] = si;
		}
		return indices;
	}

}
