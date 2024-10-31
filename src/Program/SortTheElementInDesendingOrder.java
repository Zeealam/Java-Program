package Program;

public class SortTheElementInDesendingOrder {

	// Java Program to sort the elements of an array in Desending order

	public static void main(String[] args) {

		int arr[] = new int[] { 2, 6, 4, 3, 7, 0, 8 };

		int temp = 0;

		System.out.println("Original array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();

		System.out.println("Desending order value");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

		}
	}

}
