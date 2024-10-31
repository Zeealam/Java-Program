package Program;

public class Copyvalueinarray {

	// Copy one value off an array to another array

	public static void main(String[] args) {
		int arr1[] = new int[] { 1, 2, 3, 4, 5 };
		int arr2[] = new int[arr1.length];

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
