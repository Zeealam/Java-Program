package leetcodeTwoPointerTech;

import java.util.Arrays;

public class ReverseanArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 5, 6, 7, 8, 9, 0 };
		System.out.println("Original Array:" + Arrays.toString(arr));

		int start = 0, end = arr.length - 1;

		while (start < end) {
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
		System.out.print("Reverse Array:" + Arrays.toString(arr));

	}

}
