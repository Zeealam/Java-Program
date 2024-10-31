package Program;

public class Printsmallelementinanarray {

	// Program to print the smallest element in an array

	public static void main(String[] args) {

		int arr[] = new int[] { 55, 66, 12, 10, 9 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			
		}
		System.out.println("Small element present in a given array: " + min);

	}

}
