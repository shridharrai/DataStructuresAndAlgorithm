package sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,0,0,0};
		int[] arr2 = {2,5,6};
		int[] ans = mergeTwoSortedArrays(arr1, arr2);
		
		for(int val : ans) {
			System.out.print(val + " ");
		}
		
//		int[] arr = {20, 10, 30, 50, 60, 5, 80, 25};
//		int[] ans = mergeSort(arr, 0, arr.length-1);
//		for(int val : ans) {
//			System.out.print(val + " ");
//		}
	}
	
	public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] <= arr2[j]) {
				merged[k] = arr1[i];
				i++;
				k++;
			} else {
				merged[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		if(i == arr1.length) {
			while (j < arr2.length) {
				merged[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		if(j == arr2.length) {
			while (i < arr1.length) {
				merged[k] = arr1[i];
				i++;
				k++;
			}
		}
		
		return merged;
	}
	
	
	public static int[] mergeSort(int[] arr, int lo, int hi) {
		if(lo == hi) {  //Base case
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}
		int mid = ((lo+hi)/2);
		int[] fh = mergeSort(arr, lo, mid);
		int[] sh = mergeSort(arr, mid+1, hi);
		
		int[] merge = mergeTwoSortedArrays(fh, sh);
		return merge;
	}
}
