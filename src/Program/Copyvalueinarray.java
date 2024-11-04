package Program;

public class Copyvalueinarray {

	// Copy one value off an array to another array

	public static void main(String[] args) {
		int arr1[] = new int[] { 1, 2, 3, 4, 5 }; //arr1 is an integer array initialized with the values {1, 2, 3, 4, 5}.
		int arr2[] = new int[arr1.length]; //arr2 is an integer array created with the same length as arr1, but it is initially empty

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		System.out.println("Element of original array");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		System.out.println("Element of new array");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

}
